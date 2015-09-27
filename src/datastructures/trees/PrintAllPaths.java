package datastructures.trees;

public class PrintAllPaths {

	public static void printPaths(BinaryTreeNode root, Integer[] path, Integer pathLen) {
		path[pathLen] = root.getValue();
		pathLen++;
		if(root.isLeafNode()) {
			printArray(path, pathLen);
		}
		else {
			printPaths(root.getLeftChild(), path, pathLen);
			printPaths(root.getRightChild(), path, pathLen);
		}
	}
	private static void printArray(Integer[] path, Integer pathLen) {
		StringBuilder output = new StringBuilder();
		for(int i=0;i<pathLen;i++) {
			output.append(path[i]);
			output.append(",");
		}
		
		System.out.println(output.toString());
		
	}
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		root.setLeftChild(new BinaryTreeNode(2));
		root.setRightChild(new BinaryTreeNode(3));
		root.getLeftChild().setLeftChild(new BinaryTreeNode(4));
		root.getLeftChild().setRightChild(new BinaryTreeNode(5));
		
		Integer[] path = new Integer[1000];
		printPaths(root, path, 0);

	}

}
