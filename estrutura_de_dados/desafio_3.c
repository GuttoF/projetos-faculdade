#include <stdio.h>

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