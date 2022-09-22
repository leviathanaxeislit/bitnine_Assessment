# Driver file:

- PostgreSQL JDBC Driver (compatible with PostgreSQL 9.4+)
 - Download the latest driver (JDBC 4.2) from: https://jdbc.postgresql.org/download.html
 - Extract the .jar file from the downloaded archive
 - Copy the .jar file to the directory containing your Java application

 

## Development environment:

 - PostgreSQL 9.4+
 - JDK 1.8+

## Instructions for using the driver:

 - Add the .jar file to your application's classpath
 - Use the following URL format when connecting to the database: jdbc:postgresql://<host>:<port>/<database>
 - Replace <host>, <port>, and <database> with the appropriate values for your environment
 - If you are using a PostgreSQL user with a password, you will also need to supply the user and password properties:

 ```Properties props = new Properties();
 props.setProperty("user", "<username>");
 props.setProperty("password", "<password>");
 Connection conn = DriverManager.getConnection("jdbc:postgresql://<host>:<port>/<database>", props);
 ```


## Explanation

- The JSONDriver class provides a JDBC driver for connecting to a PostgreSQL database and returning outputs in JSON format. The driver implements the Driver interface from java.sql.Driver.

- The connect() method accepts a URL in the format "jdbc:postgresql://<host>:<port>/<database>", as well as a Properties object containing user and password information. The method will return a JSONConnection object, which is a subclass of java.sql.Connection.

- The getPropertyInfo() method returns an array of DriverPropertyInfo objects, one for each property that the driver supports. This information can be used by applications to determine which properties to set when connecting to the database.

- The getMajorVersion() and getMinorVersion() methods return the major and minor version numbers of the driver, respectively.

- The jdbcCompliant() method returns false, indicating that the driver is not JDBC compliant.

- The JSONDriver class also includes a main() method, which can be used to test the driver. This method accepts a URL and a Properties object as arguments, and will print the JSON output of the database query to the console.

- To use the driver, add the .jar file to your application's classpath and use the URL format "jdbc:postgresql://<host>:<port>/<database>". Replace <host>, <port>, and <database> with the appropriate values for your environment. If you are using a PostgreSQL user with a password, you will also need to supply the user and password properties.

