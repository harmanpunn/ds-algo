package ds.heaptree;

public class App {

	public static void main(String[] args) {
			
		
		Heap heap = new Heap(8);
		heap.insert(17);
		heap.insert(15);
		heap.insert(9);
		heap.insert(1);
		heap.insert(12);
		heap.insert(3);
		heap.insert(8);
		//heap.insert(10);
		
		heap.remove();
		heap.displayHeap();
		
	}

}
