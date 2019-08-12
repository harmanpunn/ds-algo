package code.practice;

import ds.binarysearchtree.BST;
import ds.binarysearchtree.Node;

public class MaximumSumLevelTree {

	public static void main(String[] args) {
		BST tree = new BST();
		
		int[] arr = {7, 10, 4, 3, 20, 15,6,8};
		
		for(int i : arr) {
			tree.insert(i, Integer.toString(i));
		}
		
		tree.display();
		int maxSum = 0;
		System.out.println("");
		System.out.println(printLevelOrder(tree, maxSum));
	}
	
	
	public static int printLevelOrder(BST tree, int maxSum) {
		if (tree == null)
			return 0;
		int height = tree.getHeight();
		Node node = tree.getRoot();
		for (int d = 1; d <= height; d++) {
			int levelSum = 0;
			levelSum = printGivenLevel(node, d, levelSum);
			maxSum = Math.max(maxSum, levelSum);
			//System.out.print("$ ");
		}
		
		return maxSum;
	}

	private static int printGivenLevel(Node node, int level, int levelSum) {
		if (node == null)
			return levelSum;
		
		if (level == 1) {
			levelSum += node.getKey();
		} else if (level > 1) {
			levelSum = printGivenLevel(node.getLeftChild(), level - 1, levelSum);
			levelSum = printGivenLevel(node.getRightChild(), level - 1, levelSum);
		}
		return levelSum;
	}

}
