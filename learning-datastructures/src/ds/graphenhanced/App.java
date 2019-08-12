package ds.graphenhanced;

public class App {

	public static void main(String[] args) {
		
		Graph graph = new Graph(5, "directed");
		
		graph.addVertex("State");
		graph.addVertex("Avenel");
		graph.addVertex("Elm");
		graph.addVertex("Pocono");
		graph.addVertex("William");
		
		graph.addEdge("State", "Avenel");
		graph.addEdge("Avenel", "Pocono");
		graph.addEdge("Elm", "Avenel");
		graph.addEdge("Elm", "William");
		graph.addEdge("William", "State");
		graph.addEdge("Pocono", "Elm");
		graph.addEdge("William", "Pocono");
		
		graph.print();
		
	}

}
