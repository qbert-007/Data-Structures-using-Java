package com.qbert.queue;

public class Client {

	public static void main(String[] args) {
		LinkedListQueue<Integer> llq=new LinkedListQueue<Integer>();
		llq.enqueue(10);
		llq.enqueue(20);
		llq.enqueue(30);
		llq.enqueue(40);

		llq.dequeue();
		llq.dequeue();
		llq.dequeue();
		llq.dequeue();
		
		llq.enqueue(110);
		llq.enqueue(120);
		System.out.println(llq.isEmpty());

		llq.show();
		System.out.println(llq.getSize());
		
		
		//----------------//
//		Queue q=new Queue();
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//		q.enqueue(50);
//		//q.enqueue(500);
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.enqueue(60);
//		q.enqueue(70);
//		q.enqueue(80);
//		q.enqueue(90);
//		//q.enqueue(100);
//		q.dequeue();
//		q.dequeue();
////		q.dequeue();
////		q.dequeue();
////		q.dequeue();
//		q.enqueue(110);
//		q.enqueue(120);
//		System.out.println(q.getSize());
//		q.show();
	}

}
