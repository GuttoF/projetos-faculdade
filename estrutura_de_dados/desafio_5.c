#include <stdio.h>

int main() {
    int n, i = 1, limit;

    printf("n value: ");
    scanf("%d", &n);
    // Set a limit to escape from a infinite loop.
    printf("Limit: ");
    scanf("%d", &limit);

    while (i <= n && i <= limit) {
        printf("%d ", i);
        i++;
    }

    return 0;
}