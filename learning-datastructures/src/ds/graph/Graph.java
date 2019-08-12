package ds.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	
	private int vCount; //number of vertices
	private int eCount; //number of edges
	
	private ArrayList<ArrayList<Integer>> adjacents; //array of integer lists

	public Graph(int vCount) {
		this.vCount = vCount;
		this.eCount = 0;
		adjacents = new ArrayList<>();
		
		for(int i=0; i<vCount; i++) {
			adjacents.add(i, new ArrayList<>());
		}
	}
	
	public int getVertexCount() {
		return vCount;
	}
	
	public int getEgdeCount() {
		return eCount;
	}
	
	public void addEdge(int src, int dest) {
		adjacents.get(src).add(dest);
		eCount++;
	}
	
	public Object[] adj(int src) {
		return adjacents.get(src).toArray();
	}
	
	public void DFS(int v) {
		boolean[] visited = new boolean[vCount];
		DFSUtil(v, visited);
	}

	private void DFSUtil(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");
		Iterator<Integer> itr = adjacents.get(v).listIterator();
		
		while(itr.hasNext()) {
			int n = itr.next();
			if(!visited[n]) {
				DFSUtil(n, visited);
			}
		}
 	}
	
	public void BFS(int v) {
		boolean[] visited = new boolean[vCount];
		BFSUtil(v, visited);
	}

	private void BFSUtil(int v, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();
		visited[v] = true;
		queue.add(v);
		while(!queue.isEmpty()) {
			int s = queue.poll();
			System.out.print(s + " ");
			
			Iterator<Integer> itr = adjacents.get(s).listIterator();
			while(itr.hasNext()) {
				int n = itr.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
}
