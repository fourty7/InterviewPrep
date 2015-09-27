package datastructures.trees;

public class BSTNodeCount {

	public static int countNodes(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		
		return 1+ countNodes(root.getLeftChild()) + countNodes(root.getRightChild());
	}

	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		root.setLeftChild(new BinaryTreeNode(2));
		root.setRightChild(new BinaryTreeNode(3));
		root.getLeftChild().setLeftChild(new BinaryTreeNode(4));
		root.getLeftChild().setRightChild(new BinaryTreeNode(5));
		
		System.out.println(countNodes(root));
	}

}
