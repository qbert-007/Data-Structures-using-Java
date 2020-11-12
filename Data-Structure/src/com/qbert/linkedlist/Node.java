package com.qbert.linkedlist;

public class Node<T> {
	public T info;
	public Node<T> next;
	
	public Node(){
	}
	public Node(T info) {
		this.info=info;
	}
}
