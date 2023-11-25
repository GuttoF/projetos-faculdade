# include <stdio.h>

# define MAXSIZE 5

int items[MAXSIZE];
int top = -1;

// Função para verificar se a pilha está vazia
int isEmpty() {
    return top == -1;
}

// Função para verificar se a pilha está cheia
int isFull() {
    return top == MAXSIZE - 1;
}

// Função para empilhar um elemento
void push(int data) {
    if (isFull()) {
        printf("A pilha está cheia!\n");
        return;
    }

    items[++top] = data;
}

// Função para desempilhar um elemento
int pop() {
    if (isEmpty()) {
        printf("A pilha está vazia!\n");
        return -1;
    }

    return items[top--];
}

int peek() {
    if (isEmpty()) {
        printf("A pilha está vazia!\n");
        return -1;
    }

    return items[top];
}

int main() {
    push(10);
    push(20);
    push(30);

    printf("Elemento no topo da pilha: %d\n", peek());
    printf("Elemento removido da pilha: %d\n", pop());
    printf("Elemento no topo da pilha: %d\n", peek());

    return 0;
}