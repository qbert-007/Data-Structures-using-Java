package com.qbert.stack;

import com.qbert.linkedlist.Node;

public class LinkedListStack<T> {
	Node<T> top=null;
	
	public void push(T num) {
		Node<T> node=new Node<T>();
		node.info=num;
		node.next=null;
		
		if(top==null) {
			top=node;
		}else {
			node.next=top;
			top=node;
		}
	}
	
	public T pop() {
		if(top==null) {
			System.out.println("Stack Underflow");
			return null;
		}
		T rem=top.info;
		Node<T> node=top.next;
		top=null;
		top=node;
		return rem;
	}
	
	public T peek() {
		return (top!=null)?top.info:null;
	}
	
	public void show() {
		Node<T> temp=top;
		while(temp!=null) {
			System.out.print(temp.info+" ");
			temp=temp.next;
		}
	}
}
