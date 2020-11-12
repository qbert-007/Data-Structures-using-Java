package com.qbert.tree;

public class Client {

	public static void main(String[] args) {
		BinarySearchTree bt=new BinarySearchTree();
		//43, 10, 79, 90, 12, 54, 11, 9, 50
		bt.add(43);
		bt.add(10);
		bt.add(79);
		bt.add(90);
		bt.add(12);
		bt.add(54);
		bt.add(11);
		bt.add(9);
		bt.add(50);
		//bt.show();
		//bt.delete(25);
		//bt.show();
		//bt.search(92);
		bt.search(90);
		bt.show();
		//System.out.println(bt.palind(5));
	}

}
