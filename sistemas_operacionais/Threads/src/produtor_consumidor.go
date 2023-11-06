package main

import (
	"fmt"
	"sync"
	"time"
)

const bufferSize = 10

func main() {
	var buffer []int
	var mu sync.Mutex             // Mutex(mu) controla o acesso ao buffer
	notFull := sync.NewCond(&mu)  // Aguardar se o buffer estiver cheio
	notEmpty := sync.NewCond(&mu) // Aguardar se o buffer estiver vazio

	// Go routine do produtor
	go func() {
		for i := 0; i < 10; i++ {
			mu.Lock()
			for len(buffer) == bufferSize {
				notFull.Wait()
			}
			buffer = append(buffer, i)
			fmt.Printf("Produtor: inseriu %d\n", i) // Produtor insere item no buffer
			notEmpty.Signal()
			mu.Unlock()
			time.Sleep(1000 * time.Millisecond)
		}
	}()

	// Go routine do consumidor
	go func() {
		for i := 0; i < 10; i++ {
			mu.Lock()
			for len(buffer) == 0 {
				notEmpty.Wait()
			}
			item := buffer[0]
			buffer = buffer[1:]
			fmt.Printf("Consumidor: consumiu %d\n", item) // Consumidor consome item do buffer
			notFull.Signal()
			mu.Unlock()
			time.Sleep(1000 * time.Millisecond)
		}
	}()

	time.Sleep(10 * time.Second) // Aguarda 10 segundos para finalizar a execução
}
