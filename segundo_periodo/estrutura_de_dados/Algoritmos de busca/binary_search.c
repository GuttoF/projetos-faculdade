
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct node {
    int value;
    struct node *left;
    struct node *right;
} node;

// Função para criar um novo nó
node *create_node(int value) {
    node *new_node = (node *) malloc(sizeof(node));
    new_node->value = value;
    new_node->left = NULL;
    new_node->right = NULL;
    return new_node;
}

// Função para inserir um valor na árvore
void insert(node **root, int value) {
    if (*root == NULL) {
        *root = create_node(value);
    } else {
        if (value < (*root)->value) {
            insert(&(*root)->left, value);
        } else {
            insert(&(*root)->right, value);
        }
    }
}

// Função para imprimir a árvore em ordem
void print_tree(node *root) {
    if (root != NULL) {
        print_tree(root->left);
        printf("%d ", root->value);
        print_tree(root->right);
    }
}

// Função para liberar a memória ocupada pela árvore
void free_tree(node *root) {
    if (root != NULL) {
        free_tree(root->left);
        free_tree(root->right);
        free(root);
    }
}

int main() {
    int size, min, max;
    node *root = NULL;

    printf("Digite o tamanho do array: ");
    scanf("%d", &size);

    printf("Digite o valor mínimo: ");
    scanf("%d", &min);

    printf("Digite o valor máximo: ");
    scanf("%d", &max);

    int array[size];

    srand(time(NULL));

    for (int i = 0; i < size; i++) {
        array[i] = rand() % (max - min + 1) + min;
        insert(&root, array[i]);
    }

    print_tree(root);
    printf("\n");

    free_tree(root);

    return 0;
}

