#include <stdio.h>

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

    printf("\nS: %d\n", count);

    return 0;
}