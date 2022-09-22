package org.postgresql.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JSONDriver extends BaseDataSource implements Driver {
    public JSONDriver() {
    }

    public Connection connect(String url, Properties info) throws SQLException {
        if (!acceptsURL(url)) {
            return null;
        }
        return new JSONConnection(this, url, info);
    }

    public boolean acceptsURL(String url) throws SQLException {
        return url.startsWith("jdbc:postgresql://");
    }

    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        if (!acceptsURL(url)) {
            return null;
        }
        List<DriverPropertyInfo> props = new ArrayList<DriverPropertyInfo>();
        DriverPropertyInfo prop;

        prop = new DriverPropertyInfo("user", info.getProperty("user"));
        prop.description = "Database user";
        props.add(prop);

        prop = new DriverPropertyInfo("password", info.getProperty("password"));
        prop.description = "Database password";
        props.add(prop);

        return props.toArray(new DriverPropertyInfo[0]);
    }

    public int getMajorVersion() {
        return 0;
    }

    public int getMinorVersion() {
        return 1;
    }

    public boolean jdbcCompliant() {
        return false;
    }

    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }
}
