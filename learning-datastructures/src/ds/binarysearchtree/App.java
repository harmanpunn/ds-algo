package ds.binarysearchtree;


public class App {

	public static void main(String[] args) {

		
		BST tree = new BST();
		/*tree.insert(10, "Ten");
		tree.insert(4, "Four");
		tree.insert(20, "Twenty");
		tree.insert(2, "Two");
		tree.insert(5, "Five");
		tree.insert(18, "Eighteen");
		tree.insert(22, "Twenty Two");
		tree.insert(8, "Eight");
		tree.insert(17, "Seventeen");
		tree.insert(19, "Nineteen");
		tree.insert(21, "Twenty One");
		tree.insert(24, "Twenty Four");
		tree.insert(9, "Nine");
		tree.insert(33, "Thirty Three");
		tree.insert(11, "Eleven");
		tree.insert(12, "Twelve");*/
		
		tree.insert(7, "seven");
		tree.insert(10, "ten");
		tree.insert(4, "four");
		tree.insert(8,  "eight");
		tree.insert(6, "six");
		tree.insert(3, "three");
		tree.insert(20, "twenty");
		tree.insert(15, "fifteen");
		
		tree.display();
		//BST.preOrder(tree);
		
		
		
		//System.out.println(tree.findMax().value);
		//System.out.println(tree.findMin().value);
		
		System.out.println(tree.getHeight());
		
		BST.printLevelOrder(tree);
		System.out.println("");
		tree.printLevelOrder();
	}

}
