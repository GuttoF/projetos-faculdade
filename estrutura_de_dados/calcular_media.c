#include <stdio.h>

/*
Crie um programa que receba quatro termos inseridos pelo usuário
correspondente as notas do aluno: nota1, nota2, nota3 e nota4
Calcule a média aritmética  das notas. 
Depois avalie a média e imprima:
Caso a média seja menor que 6 exibir a mensagem REPROVADO
Caso a média seja maior ou igual 6 que exibir a mensagem APROVADO
*/

int main() {
    float result1, result2, result3, result4, mean;

    printf("Result 1: ");
    scanf("%f", &result1);

    printf("Result 2: ");
    scanf("%f", &result2);

    printf("Result 3: ");
    scanf("%f", &result3);

    printf("Result 4: ");
    scanf("%f", &result4);

    mean = (result1 + result2 + result3 + result4) / 4;

    if (mean < 6) {
        printf("REPROVADO\n");
    } else {
        printf("APROVADO\n");
    }

    return 0;
}