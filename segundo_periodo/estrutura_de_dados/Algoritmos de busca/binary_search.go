package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {

	var arraySize int
	var searchValue int

	fmt.Println("Digite o tamanho do array: ")
	fmt.Scan(&arraySize)

	fmt.Println("Digite o valor que deseja buscar: ")
	fmt.Scan(&searchValue)

	array := generateArray(arraySize)

	fmt.Println("Array gerado: ", array)

	result := binarySearch(array, searchValue)

	if result == -1 {
		fmt.Println("Valor não encontrado")
	} else {
		fmt.Println("Valor encontrado na posição: ", result)
	}

}

func generateArray(size int) []int {

	rand.Seed(time.Now().UnixNano())

	var array []int

	for i := 0; i < size; i++ {
		array = append(array, rand.Intn(100))
	}

	return array
}

func binarySearch(array []int, searchValue int) int {

	var left int = 0
	var right int = len(array) - 1

	for left <= right {

		var middle int = (left + right) / 2

		if array[middle] == searchValue {
			return middle
		} else if array[middle] < searchValue {
			left = middle + 1
		} else {
			right = middle - 1
		}
	}

	return -1
}
