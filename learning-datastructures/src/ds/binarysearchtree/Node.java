package ds.binarysearchtree;

public class Node {

	int key;
	String value;
	Node leftChild;
	Node rightChild;

	public Node(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}
}
