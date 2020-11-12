package com.qbert.graph;

public class Client {

	public static void main(String[] args) {
		Graph g=new Graph();
		g.addVertex("Ajmer");
		g.addVertex("Bareilly");
		g.addVertex("Nainital");
		g.addVertex("Agra");
		g.addVertex("Gwalior");
		g.addVertex("Mathura");
		g.addEdge("Agra", "Gwalior");
		g.addEdge("Gwalior", "Ajmer");
		g.addEdge("Bareilly", "Nainital");
		g.addEdge("Agra", "Mathura");
		g.addEdge("Ajmer", "Agra");
		g.addEdge("Nainital", "Bareilly");
		g.addEdge("Gwalior", "Bareilly");
		
		g.deleteEdge("Agra", "Mathura");
		g.showAdjacent("Agra");
		
	}

}
