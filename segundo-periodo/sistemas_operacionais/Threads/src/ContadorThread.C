#include <stdio.h>
#include <stdlib.h>
#include <pthread.h> // Thread
#include <unistd.h> // Sleep

// Para adicionar o sleep só é necessário fazer algumas alterações na thread_function
void *thread_function(void *arg){ // Converte o argumento para o tipo de dado da estrutura
    int thread_id = *((int *)arg); // Converte o argumento para o tipo de dado inteiro

    for (int i = 0; i < 10; i++){
        printf("Thread %d: %d\n", thread_id, i);
        fflush(stdout); // Limpa o buffer de saída

        sleep(1); // Adiciona o sleep de 1 segundo, pode ser qualquer valor
    }

    return NULL; // Retorna NULL pois as threads não retornam nada
}

int main(){
    pthread_t threads[10]; // Array de threads
    int thread_ids[10]; // Array de ids das threads
    int i; // Variável de controle

    // Cria as 10 threads
    for (i = 0; i < 10; i++){
        thread_ids[i] = i++; // Passa o id da thread como argumento para a função
        pthread_create(&threads[i], NULL, thread_function, &thread_ids[i]);
    }

    // Espera as 10 threads terminarem antes de continuar
    for (i = 1; i <= 10; i++){
        pthread_join(threads[i], NULL);
    }

    return 0; // Famoso encerra o programa com código 0
}