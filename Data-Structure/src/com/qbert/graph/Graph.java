package com.qbert.graph;

import com.qbert.linkedlist.LinkedList;

//Graph using Adjacency List
public class Graph{
	int count=0;
	String []verticesArr=new String[10];
	LinkedList<String>[] edgeArr=new LinkedList[10];
	
	public void addVertex(String vertex) {
		verticesArr[count]=vertex;
		count++;
	}
	
	public int getIndex(String v) {
		for(int i=0;i<verticesArr.length;i++) {
			if(verticesArr[i].equalsIgnoreCase(v)) {
				return i;
			}
		}
		return -1;
	}
	
	public void addEdge(String from,String to) {
		int iFrom=this.getIndex(from);
	    int iTo=this.getIndex(to);
		if(iFrom==-1 || iTo==-1) {
			System.err.println("Invalid Vertices");
			System.exit(-1);
		}
		if(edgeArr[iFrom]==null) {
			edgeArr[iFrom]=new LinkedList<String>();
			edgeArr[iFrom].add(to);
		}else {
			edgeArr[iFrom].add(to);
		}	
	}
	
	public void deleteEdge(String from,String to) {
		int iFrom=this.getIndex(from);
		int iTo=this.getIndex(to);
		if(iFrom==-1 || iTo==-1) {
			System.err.println("Invalid Vertices");
			System.exit(-1);
		}
		edgeArr[iFrom].remove(to);
	}
	
	
	private LinkedList<String> getAdjacentList(String v) {
		int ind=this.getIndex(v);
		return edgeArr[ind];
	}
	public void showAdjacent(String v) {
		this.getAdjacentList(v).show();
	}
}
