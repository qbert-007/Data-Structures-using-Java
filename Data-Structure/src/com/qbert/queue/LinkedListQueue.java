package com.qbert.queue;

import com.qbert.linkedlist.Node;

public class LinkedListQueue<T> {
	Node<T> front;
	Node<T> rear;
	int size;
	
	public void enqueue(T num) {
		Node<T> node=new Node<T>();
		node.info=num;
		node.next=null;
		if(rear==null) {
			rear=node;
			front=node;
		}else {
			rear.next=node;
			rear=node;
		}
		size++;
	}
	
	public T dequeue() {
		if(front==null) {
			System.out.println("Queue Empty");
			System.exit(-1);
		}
		T rem=front.info;
		front=front.next;
		size--;
		if(front==null) {
			rear=null;
		}
		return rem;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
	public void show() {
		Node<T> temp=front;
		while(temp!=null) {
			System.out.print(temp.info+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
