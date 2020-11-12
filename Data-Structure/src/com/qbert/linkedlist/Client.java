package com.qbert.linkedlist;

public class Client {

	public static void main(String[] args) {
		CircularLinkedList<Integer> cll=new CircularLinkedList<Integer>();
		cll.add(10);
		cll.add(20);
		cll.add(30);
		cll.add(40);
		cll.show();
	/*	DoublyLinkedList list=new DoublyLinkedList();
		list.add(100);
		list.addFirst(5);
		list.add(500);
		list.addFirst(2);
		list.addAt(3, 30);
		list.addBefore(2,800);
		list.show();
		System.out.println("index is ="+list.indexOf(30));
		*/
		/*
		LinkedList list=new LinkedList();
		list.add(1);
		list.addFirst(2);
		list.add(2);
		list.addFirst(11);
		list.add(3);
		list.addFirst(07);
		list.addAt(1, 100);
		list.removeAt(6);
		list.show();
		System.out.println("size is :"+list.size());
		java.util.LinkedList<Integer> l=new java.util.LinkedList<Integer>();
		l.add(1);
		l.addFirst(2);
		l.add(2);
		l.addFirst(11);
		l.add(3);
		l.addFirst(07);
		l.add(1, 100);
		l.remove(6);
		System.out.println(l);
		System.out.println("size is :"+l.size());
		*/
	}

}
