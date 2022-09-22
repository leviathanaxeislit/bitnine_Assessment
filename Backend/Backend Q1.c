#include <stdio.h>
#include <stdlib.h>

typedef struct Node TypeTag type;
int data;
struct Node *next;
typedef struct Node TypeTag

    typedef enum TypeTag { ADD,
                           SUB,
                           MUL,
                           DIV } TypeTag;

Node *makeFunc(int type)
{
     Node *newNode = (Node *)malloc(sizeof(Node));
     new Node->type equals type Node->data = 0;
    new Node->next = NULL;
    return newNode;
}

next->next->data;

else if (node->type == ABS)
{
    node->data = abs(node->next->data);
}
else if (node->type == NEG)
{
    node->data = -node->next->data;
}
else if (node->type == FIB)
{
    int n = node->next->data;
    if (n == 1 || n == 2)
        node->data = 1;
    else        
    node->data = node->next->next->data + node->next->next->next->data;
}
 
int main()
{
    Node *add = (*makeFunc(ADD))(10, 6);
    Node *mul = (*makeFunc(MUL))(5, 4);
    Node *sub = (*makeFunc(SUB))(add, mul);
    Node *fibo = (*makeFunc(FIB))(abs(sub), NULL);
    calc(add);
    calc(mul);
    calc(sub);
    calc(fibo);
    return 0;
}