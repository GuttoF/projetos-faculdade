# include <stdio.h>

# define MAXSIZE 10

int iterms[MAXSIZE];
int front = -1;
int rear = -1;

// Função para verificar se a fila está vazia
int isEmpty() {
    return front == -1 && rear == -1;
}

// Função para verificar se a fila está cheia
int isFull() {
    return rear == MAXSIZE - 1;
}

// Função para inserir um elemento na fila
void enqueue(int data) {
    if (isFull()) {
        printf("A fila está cheia!\n");
        return;
    }
    if (isEmpty()) {
        front = rear = 0;
    } else {
        rear++;
    }
    iterms[rear] = data;
}

// Função para remover um elemento da fila
int dequeue() {
    if (isEmpty()) {
        printf("A fila está vazia!\n");
        return -1;
    }
    int data = iterms[front];
    if (front == rear) {
        front = rear = -1;
    } else {
        front++;
    }
    return data;
}

void display() {
    if (isEmpty()) {
        printf("A fila está vazia!\n");
        return;
    }
    for (int i = front; i <= rear; i++) {
        printf("%d\n", iterms[i]);
    }
}

int main() {
    enqueue(64);
    enqueue(25);
    enqueue(12);
    enqueue(22);
    enqueue(11);
    enqueue(9);

    printf("Desafileirando...\n");
    printf("%d\n", dequeue());
    printf("%d\n", dequeue());
    printf("\nO que sobrou foi: ");

    display();



}