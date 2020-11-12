package com.qbert.linkedlist;

public class CircularLinkedList<T> {
	Node<T> head;
	Node<T> tail;
	
	public void add(T num) {
		Node<T> node=new Node<T>(num);
		if(head==null) {
			head=node;
		}else {
			Node<T> temp=tail;
			temp.next=node;
		}
		tail=node;
		tail.next=head;
	}
	
	//Similarly other methods can also be implemented 
	
	public void show() {
		Node<T> temp=head;
		while(temp.next!=head) {
			System.out.println(temp.info);
			temp=temp.next;
		}
		System.out.println(temp.info);
	}
}
