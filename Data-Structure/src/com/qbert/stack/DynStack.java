package com.qbert.stack;

public class DynStack {
	int capacity=4;
	int arr[]=new int[capacity];
	int top=0;
	
	private void extension() {
		int newCap=capacity*2;
		int newArr[]=new int[newCap];
		//System.arraycopy(arr, 0, newArr, 0, capacity); //can use this simple method to copy
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		capacity=newCap;
		arr=newArr;
	}
	
	private void shrink() {
		capacity=capacity/2;
		int newArr[]=new int[capacity];
		System.arraycopy(arr, 0, newArr, 0, capacity);
		arr=newArr;
	}
	
	public void push(int num) {
		if(top==capacity) {
			this.extension();
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
		
		if(top==(capacity)/4) {
			this.shrink();
		}
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("No element to peek");
			return -1;
		}
		return arr[top-1];
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
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
