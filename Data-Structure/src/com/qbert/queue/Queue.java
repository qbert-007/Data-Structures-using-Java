package com.qbert.queue;

public class Queue {
	int cap=5;
	int arr[]=new int[cap];
	int front;
	int rear;
	int size;
	
	public void enqueue(int num) {
		if(this.getSize()<cap) {
//			arr[(rear%cap)]=num;
//			rear++;
			//OR
			arr[rear]=num;
			rear=(rear+1)%cap;
			size++;
		}else {
			System.out.println("Queue Full");
		}	
	}
	
	public int dequeue() {
		if(this.getSize()>0) {
//			int rem=arr[front%cap];
//			front++;
			//OR
			int rem=arr[front];
			front=(front+1)%cap;
			size--;
			return rem;
		}else {
			System.out.println("Queue Empty");
			return -1;
		}
	}
	
	public void show() {
//		for(int i=front;i<rear;i++) {
//			System.out.print(arr[i%cap]+" ");
//		}  
		//OR
		for(int i=0;i<size;i++) {
			System.out.print(arr[(front+i)%cap]+ " ");
		}
		System.out.println();
	}
	
/*	public void realArr() {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}*/
	
	public int getSize() {
		return size;
	}
}
