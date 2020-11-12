package com.qbert.stack;

public class Client {

	public static void main(String[] args) {
/*		DynStack s1=new DynStack();
		//System.out.println("top is "+s1.peek());
		s1.push(20);
		s1.push(30);
		s1.push(10);
		s1.push(40);
		s1.push(90);
		s1.push(100);
		s1.push(50);
		s1.push(120);
		s1.push(1000);
		s1.show();
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
//		System.out.println(s1.pop());
		System.out.println("Size is :"+s1.size());
		s1.show();
*/
		LinkedListStack<Integer> lls=new LinkedListStack<Integer>();
		lls.push(10);
		lls.push(20);
		lls.push(30);
		lls.push(40);
		lls.push(50);
		lls.pop();
		System.out.println(lls.peek());
		lls.show();
	}

}
