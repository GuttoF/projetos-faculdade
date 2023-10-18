#include <stdio.h>

int main(){
    float value1,value2, result;
    char operator;

    printf("First value: ");
    scanf("%f", &value1);

    printf("Second value: ");
    scanf("%f", &value2);

    printf("Operator: (+, -, *, /)");
    scanf(" %c", &operator);

    switch(operator){
        case '+':
            result = value1 + value2;
            break;
        case '-':
            result = value1 - value2;
            break;
        case '*':
            result = value1 * value2;
            break;
        case '/':
            result = value1 / value2;
            break;
        default:
            printf("Invalid operator");
            return 0;
    }

    printf("%.2f %c %.2f = %.2f", value1, operator, value2, result);

    return 0;
}