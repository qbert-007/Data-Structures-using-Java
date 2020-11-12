package com.qbert.linkedlist;

public class DoublyLinkedList {
	DoublyNode head;
	public void add(int num) {
		DoublyNode node=new DoublyNode(num);
		if(head==null) {
			head=node;
		}else {
			DoublyNode temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
			node.prev=temp;
		}
	}
	
	public void addFirst(int num) {
		DoublyNode node=new DoublyNode(num);
		if(head==null) {
			head=node;
		}else {
			node.next=head;
			head.prev=node;
			head=node;
		}
	}
	
	public void addAt(int index,int num) {
		if(index>=this.size() || index<0) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			addFirst(num);
			return;
		}
		DoublyNode node=new DoublyNode(num);
		DoublyNode temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		node.prev=temp;
		temp.next.prev=node;
		temp.next=node;
	}
	
	public void addBefore(int befNum,int num) {
		int index=this.indexOf(befNum);
		if(index==0) {
			this.addFirst(num);
			return;
		}
		DoublyNode temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		DoublyNode node=new DoublyNode(num);
		node.next=temp;
		node.prev=temp.prev;
		temp.prev.next=node;
		temp.prev=node;
	}
	
	public int size() {
		int count=0;
		DoublyNode temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public int indexOf(int num) {
		int index=0;
		DoublyNode temp=head;
		while(temp!=null) {
			if(temp.info==num) {
				return index;
			}
			temp=temp.next;
			index++;
		}
		return -1;
	}
	
	public void show() {
		DoublyNode temp=head;
		while(temp!=null) {
			System.out.println(temp.info);
			temp=temp.next;
		}
	}
}
