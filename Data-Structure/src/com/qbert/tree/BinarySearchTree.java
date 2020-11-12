package com.qbert.tree;

public class BinarySearchTree {
	Node root;
//-----------------------METHOD-1 for INSERTION INTO BST--(EFFECTIVE)---------------------------------------//	
	public void add(int num) {
			root=recursiveAdd(num,root);	
	}
	public Node recursiveAdd(int a,Node root1) {
		if(root1==null) {
			return new Node(a);
		}
		if(a>root1.item) {
			root1.right=recursiveAdd(a, root1.right);
		}else {
			root1.left=recursiveAdd(a, root1.left);
		}
		return root1;
	}
//--------------------------------------------------------------//	
	                     //OR
//-----------------------METHOD-2 for INSERTION INTO BST-------------------------------------------//
	public void insert(int num) {
		Node node=new Node();
		node.item=num;
		node.left=null;
		node.right=null;
		
		if(root==null) {
			root=node;
		}else {
			Node temp=recursive(num,root);
			if(num>temp.item) {
				temp.right=node;
			}else {
				temp.left=node;
			}
		}	
	}
	
	private Node recursive(int a,Node root1) {
		if(a>root1.item) {
			if(root1.right==null) {
				return root1;
			}
			return recursive(a,root1.right);
		}else {
			if(root1.left==null) {
				return root1;
			}
			return recursive(a, root1.left);
		}
	}
//------------------------------------------------------------------//
	
	public void delete(int num) {
		root=delRecur(num,root);
	}
	private Node delRecur(int a,Node root1) {
		if(root==null) return null;  //if root is NULL	
		//Need to traverse to the required Node
		
	
		if(a<root1.item) { 
			//if deletion val is less than currently pointing root1
			root1.left=delRecur(a, root1.left);
		}else if(a>root1.item) {
			//if deletion val is greater than currently pointing root1
			root1.right=delRecur(a, root1.right);
		}else {
			//if deletion val is equal to the currently pointing root1
			//deletion takes places here...
			//IF deletion node has 1 or 0 child
			if(root1.left==null) {
				return root1.right;
			}else if(root1.right==null) {
				return root1.left;
			}else {
				//IF deletion node has 2 child 
				Node minSub=root1.right;
				int minVal=0;
				//Traversing to lowest value available at right sub-tree
				while(minSub!=null) {
					minVal=minSub.item;
					minSub=minSub.left;
				}
				//inserting that lowest val to the deletion node
				root1.item=minVal;
				//deleting that lowest val node from right sub-tree
				root1.right=delRecur(minVal, root1.right);
			}
		}
		return root1;
	}
	
	public void search(int num) {
		Node temp=searchRecur(num,this.root);
		if(temp==null) {
			System.out.println("Tree does not have any such element");
		}else {
			System.out.println("Element is Successfully found");
			System.out.print("val="+temp.item);
			if(temp.left!=null)
				System.out.print(" left="+temp.left.item);
			if(temp.right!=null)
				System.out.print(" right="+temp.right.item);
			System.out.println();
		}	
	}
	public Node searchRecur(int a,Node root1) {
		Node find=null;
		if(root1==null) {
			return null;
		}
		if(root1.item==a) {
			return root1;
		}	
		if(a<root1.item) {
			find=searchRecur(a, root1.left);
		}else if(a>root1.item) {
			find=searchRecur(a, root1.right);
		}
		return find;
	}
	
//--------------------------To DISPLAY OUTPUT TREE----------------------------------------//	
	//FOR Display Structure
	private int count=0;
	private int once=0;
	private void frame() {
		for(int i=1;i<count;i++) {
			System.out.print("   ");
		}
		if(count>0 || once>0) {
			System.out.print("|");
			System.out.println();
			once++;
		}
		for(int i=1;i<count;i++) {
			System.out.print("   ");
		}
		if(once>0) {
			System.out.print("---");
		}
	}
	
	//PRE-ORDER TRAVERSAL
	private void pretraverse(Node root1) {
		if(root1==null)
			return;	
		frame();	
		//------------------------------//
		System.out.print(root1.item);
		//------------------------------//
		System.out.println();
		count++;
		pretraverse(root1.left);
		pretraverse(root1.right);
		count--;
	}
	
	public void show() {
		pretraverse(this.root);
		count=0;
		once=0;
	}
//--------------------------------------------------------------------//
}
