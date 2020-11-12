package com.qbert.stack;

public class Stack {
	int cap=5;
	int arr[]=new int[cap];
	int top=0;
	
	public void push(int num) {
		if(top==cap) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[top]=num;
		top++;
	}
	
	public int pop() {
		if(this.isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		top--;
		int temp=arr[top];
		arr[top]=0;
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("No element to peek");
			return -1;
		}
		int temp=arr[top-1];
		return temp;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		if(top==0)
			return true;
		return false;
	}
	
	public void show() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
