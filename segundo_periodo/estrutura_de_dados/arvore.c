#include <stdio.h>
#include <stdlib.h>


struct node {
    int data;
    struct node *left, *right;
};


struct node* newNode(int data) {
    struct node* node = (struct node*)malloc(sizeof(struct node));
    node->data = data;
    node->left = node->right = NULL;
    return node;
}

struct node* insert(struct node* node, int data) {
    if (node == NULL) return newNode(data);
    if (data < node->data) node->left  = insert(node->left, data);
    else if (data > node->data) node->right = insert(node->right, data);
    return node;
}

int depth(struct node* node) {
    if (node == NULL) return 0;
    else {
        int lDepth = depth(node->left);
        int rDepth = depth(node->right);
        if (lDepth > rDepth) return(lDepth + 1);
        else return(rDepth + 1);
    }
}


void printLeaves(struct node* node) {
    if (node == NULL) return;
    if (node->left == NULL && node->right == NULL) printf("%d ", node->data);
    printLeaves(node->left);
    printLeaves(node->right);
}

int main() {
    struct node *root = NULL;
    root = insert(root, 200);
    insert(root, 450);
    insert(root, 123);
    insert(root, 52);
    insert(root, 133);
    insert(root, 321);
    insert(root, 422);
    insert(root, 523);
    insert(root, 36);
    insert(root, 64);

    printf("Profundidade da árvore: %d\n", depth(root));
    printf("Nós folha: ");
    printLeaves(root);

    return 0;
}