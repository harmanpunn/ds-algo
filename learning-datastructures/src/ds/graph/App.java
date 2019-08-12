package ds.graph;

public class App {

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);
		graph.addEdge(4, 0);
		graph.addEdge(4, 3);
		
		
		/*graph.addEdge(0, 1); 
		graph.addEdge(0, 2); 
		graph.addEdge(1, 2); 
		graph.addEdge(2, 0); 
		graph.addEdge(2, 3); 
		graph.addEdge(3, 3); */
		
		Object[] values = graph.adj(2);
		
		for(Object val : values) {
			//System.out.println(val);
		}
		
		graph.DFS(0);
		System.out.println("");
		graph.BFS(0);
		System.out.println("");
		
		Graph g = new Graph(4); 
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        
        System.out.println("Following is Breadth First Traversal "+ 
                "(starting from vertex 2)"); 
        g.BFS(2); 
		
	}

}
