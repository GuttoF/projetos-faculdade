#include <stdio.h>

int main() {
    int num;

    printf("Number: ");
    scanf("%d", &num);

    // If a number is divisible by 2, it is even.
    if (num % 2 == 0) {
        printf("Par.\n");
    } else {
        printf("Impar.\n");
    }

    if (num >= 0) {
        printf("Positivo.");
    } else {
        printf("Negativo");
    }

    return 0;
}