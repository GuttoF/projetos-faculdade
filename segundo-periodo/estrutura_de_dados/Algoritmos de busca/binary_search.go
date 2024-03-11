package main

import (
	"fmt"
)

type Node struct {
	data  int
	left  *Node
	right *Node
}

func NewNode(data int) *Node {
	return &Node{data: data}
}

func Insert(node *Node, data int) *Node {
	if node == nil {
		return NewNode(data)
	}
	if data < node.data {
		node.left = Insert(node.left, data)
	} else {
		node.right = Insert(node.right, data)
	}
	return node
}

func Depth(node *Node) int {
	if node == nil {
		return 0
	}
	leftDepth := Depth(node.left)
	rightDepth := Depth(node.right)
	if leftDepth > rightDepth {
		return leftDepth + 1
	} else {
		return rightDepth + 1
	}
}

func PrintLeaves(node *Node) {
	if node != nil {
		if node.left == nil && node.right == nil {
			fmt.Print(node.data, " ")
		}
		PrintLeaves(node.left)
		PrintLeaves(node.right)
	}
}

func main() {
	var root *Node
	root = Insert(root, 200)
	Insert(root, 450)
	Insert(root, 123)
	Insert(root, 52)
	Insert(root, 133)
	Insert(root, 321)
	Insert(root, 422)
	Insert(root, 523)
	Insert(root, 36)
	Insert(root, 64)

	fmt.Println("Profundidade da árvore:", Depth(root))
	fmt.Print("Nós folha: ")
	PrintLeaves(root)
	fmt.Println()
}
