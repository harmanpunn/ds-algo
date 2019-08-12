package ds.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {

	private Node root;
	
	

	public Node getRoot() {
		return root;
	}

	public void insert(int key, String value) {
		Node newNode = new Node(key, value);

		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;

			while (true) {
				parent = current;
				if (key < current.key) {
					current = current.leftChild;
					if (current == null) { // its parent is the leaf node
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) { // its parent is the leaf node
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public Node findMin() {
		Node current = root;
		Node last = null;

		while (current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}

	public Node findMax() {
		Node current = root;
		Node last = null;

		while (current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}

	public boolean remove(int key) {

		Node currentNode = root;
		Node parentNode = root;

		boolean isLeftChild = false;

		// Searching to find the node with key to be deleted

		while (currentNode.key != key) {
			parentNode = currentNode;
			if (key < currentNode.key) {
				isLeftChild = true;
				currentNode = currentNode.leftChild;
			} else {
				currentNode = currentNode.rightChild;
				isLeftChild = false;
			}
			if (currentNode == null) {
				return false;
			}
		}

		// Found the node
		Node nodeToDelete = currentNode;

		// If node is a leaf node
		if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
			if (nodeToDelete == root) {
				root = null;
			} else if (isLeftChild) {
				parentNode.leftChild = null;
			} else {
				parentNode.rightChild = null;
			}
		}

		// If node has one child that is on the left
		else if (nodeToDelete.rightChild == null) {
			if (nodeToDelete == root) {
				root = nodeToDelete.leftChild;
			} else if (isLeftChild) {
				parentNode.leftChild = nodeToDelete.leftChild;
			} else {
				parentNode.rightChild = nodeToDelete.leftChild;
			}
		}
		// If node has one child that is on the right
		else if (nodeToDelete.leftChild == null) {
			if (nodeToDelete == root) {
				root = nodeToDelete.rightChild;
			} else if (isLeftChild) {
				parentNode.leftChild = nodeToDelete.rightChild;
			} else {
				parentNode.rightChild = nodeToDelete.rightChild;
			}
		}

		// If node has two children
		else {
			Node successor = getSuccessor(nodeToDelete);

			// connect parent of the node to delete to successor instead
			if (nodeToDelete == root) {
				root = successor;
			} else if (isLeftChild) {
				parentNode.leftChild = successor;
			} else {
				parentNode.rightChild = successor;
			}
			successor.leftChild = nodeToDelete.leftChild;

		}

		return true;
	}

	private Node getSuccessor(Node nodeToDelete) {
		Node successorParent = nodeToDelete;
		Node successor = nodeToDelete;

		Node current = nodeToDelete.rightChild; // Go to the right child\

		while (current != null) { // start going left down the tree until node
									// has no left child
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}

		// if successor is not the right child
		if (successor != nodeToDelete.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = nodeToDelete.rightChild;
		}
		return successor;
	}

	public void display() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");

		while (isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;
			for (int j = 0; j < nBlanks; j++) {
				System.out.print(" ");
			}

			while (globalStack.isEmpty() == false) {
				Node temp = (Node) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.key);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if (temp.leftChild != null || temp.rightChild != null) {
						isRowEmpty = false;
					}
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}

				for (int j = 0; j < nBlanks * 2 - 2; j++) {
					System.out.print(" ");
				}
			}

			System.out.println();
			nBlanks = nBlanks / 2;

			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		}
		System.out.println("......................................................");

	}

	public static void preOrder(BST tree) {
		if (tree == null)
			return;

		Node node = tree.root;
		printPreOrder(node);
	}

	private static void printPreOrder(Node node) {
		if (node == null)
			return;

		System.out.println(node.key + " ");

		printPreOrder(node.leftChild);
		printPreOrder(node.rightChild);
	}

	public int getHeight() {
		if (root == null) {
			return 0;
		} else {
			Node node = root;
			int lDepth = maxDepth(node.leftChild);
			int rDepth = maxDepth(node.rightChild);

			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}

	}

	private int maxDepth(Node node) {
		if (node == null) {
			return 0;
		} else {
			int lDepth = maxDepth(node.leftChild);
			int rDepth = maxDepth(node.rightChild);

			return Math.max(lDepth, rDepth) + 1;
		}
	}

	// Level order traversal using recursion O(n^2) complexity
	public static void printLevelOrder(BST tree) {
		if (tree == null)
			return;
		int height = tree.getHeight();
		Node node = tree.root;
		for (int d = 1; d <= height; d++) {
			printGivenLevel(node, d);
			System.out.print("$ ");
		}
	}

	private static void printGivenLevel(Node node, int level) {
		if (node == null)
			return;
		
		if (level == 1) {
			System.out.print(node.key + " ");
		} else if (level > 1) {
			printGivenLevel(node.leftChild, level - 1);
			printGivenLevel(node.rightChild, level - 1);
		}
	}

	// Use queue for level order traversal O(n) complexity
	public void printLevelOrder() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.key + " ");

			if (tempNode.leftChild != null) {
				queue.add(tempNode.leftChild);
			}
			if (tempNode.rightChild != null) {
				queue.add(tempNode.rightChild);
			}
			
			
		}
	}

}
