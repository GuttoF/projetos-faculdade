#include <stdio.h>

void raise_price(float price){
    float percent;
    if (price < 100) {
        price *=1.2;
        percent = 20;
    } else {
        price *=1.1;
        percent = 10;
    }
    printf("New price: %.2\n", price);
    prinft("Percent raised: %.2f%%\n", percent);
}

int main(){
    float price;
    printf("Enter the price of the product: ");
    scanf("%f", &price);
    raise_price(price);
    return 0;
}
