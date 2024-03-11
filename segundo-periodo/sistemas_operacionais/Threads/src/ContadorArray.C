#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#define NTHREADS 5
#define ARRAYSIZE 10

int array[ARRAYSIZE] = {1,2,3,4,5,6,7,8,9,10};
int partialSums[NTHREADS];

// Funcao executada pelas threads
void *thread_function(void *arg){
    int thread_id = *(int *)arg;
    int start = thread_id * 2;
    int end = start + 2;

    int partialSum = 0;
    for(int i = start; i < end; i++){
        partialSum += array[i];
    }
    partialSums[thread_id] = partialSum; // Salva o resultado parcial na variavel global

    return NULL;
}

int main(){
    pthread_t threads[NTHREADS];
    int thread_id[NTHREADS];

    // Cria as threads
    for(int i = 0; i < NTHREADS; i++){
        thread_id[i] = i;
        pthread_create(&threads[i], NULL, thread_function, &thread_id[i]);
    }

    // Espera as threads terminarem
    for(int i = 0; i < NTHREADS; i++){
        pthread_join(threads[i], NULL);
    }

    // Soma os resultados parciais
    int sum = 0;
    for(int i = 0; i < NTHREADS; i++){
        sum += partialSums[i];
    }

    printf("Soma: %d\n", sum);

    return 0;
}