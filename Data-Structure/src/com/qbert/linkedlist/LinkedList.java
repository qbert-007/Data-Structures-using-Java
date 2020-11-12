package com.qbert.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList<T>{
	Node<T> head;
	public void add(T num) {
		Node<T> node=new Node<T>();
		node.info=num;
		node.next=null;
		
		if(head==null) {
			head=node;
		}else {
			Node<T> trav=head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next=node;
		}
	}
	
	public void addFirst(T num) {
		Node<T> node=new Node<T>();
		node.info=num;
		node.next=null;
		
			node.next=head;
			head=node;
		
	}
	
	public void addAt(int index,T num) throws IndexOutOfBoundsException{
		if(index>this.size() || index<0) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> node=new Node<T>();
		node.info=num;
		node.next=null;
	/*	int count=0;
	    if(head==null || count==index) {
			node.next=head;
			head=node;
		}else {
			count++;
			Node temp=head;
			while(temp.next!=null && count<index) {
				temp=temp.next;
				count++;
			}
			node.next=temp.next;
			temp.next=node;
		}	*/

		if(index==0) {
			this.addFirst(num);
			return;
		}
		Node<T> temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
	}
	
	public void removeFirst() throws NoSuchElementException{
		if(head==null)
			throw new NoSuchElementException();
		Node<T> temp=head;
		head=temp.next;
	}
	
	public void removeLast() throws NoSuchElementException{
		if(head==null)
			throw new NoSuchElementException();
		Node<T> temp=head;
		Node<T> before=null;
		while(temp.next!=null) {
			temp=temp.next;
			if(before==null) {
				before=head;
			}else {
				before=before.next;
			}
		}
		temp=null;
		before.next=null;
		
	}
	
	public void removeAt(int index) throws IndexOutOfBoundsException{
		if(index>this.size() || index<0) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			this.removeFirst();
			return;
		}
		Node<T> temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		Node<T> rem=temp.next;
		temp.next=rem.next;
		rem=null;
	}
	
	public void remove(T num) {
		Node<T> temp=head;
		while(temp!=null) {
			if(temp.next.info.equals(num)) {
				temp.next=temp.next.next;
				return;
			}
			temp=temp.next;
		}
		System.err.println("Object not present in the list");
		return;
	}
	
	public int size() {
		int size=0;
		Node<T> temp=head;
		if(temp==null) {
			return size;
		}
		size++;
		while(temp.next!=null) {
			size++;
			temp=temp.next;
		}
		return size;
	}
	
	public void show() {
		List<T>list=new ArrayList<T>();
		Node<T> temp=head;
		if(temp==null) {
			System.out.println(list);
			return ;
		}
		while(temp.next!=null) {
			list.add(temp.info);
			//System.out.println(temp.info);
			temp=temp.next;
		}
		//System.out.println(temp.info);
		list.add(temp.info);
		System.out.println(list);
	}
}
