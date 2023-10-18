#include <stdio.h>

/*
Crie um programa que receba um valor inteiro "n"
e gere uma sequência de números na ordem DECRESCENTE
com o número de termos informados. 
Ao final exibir a soma de todos os termos da sequência
Usar FOR
*/

int main() {
    int n, i, limit, count = 0;

    printf("n value: ");
    scanf("%d", &n);

    printf("Limit: ");
    scanf("%d", &limit);

    for (i = n; i >= 1 && i >= limit; i--) {
        printf("%d ", i);
        count += i;
    }

    printf("\nSum: %d\n", count);

    return 0;
}