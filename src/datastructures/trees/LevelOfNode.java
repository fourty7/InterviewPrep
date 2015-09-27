package datastructures.trees;

public class LevelOfNode {

	public static int getLevel(int key, BinaryTreeNode root, int level) {
		if(root == null) {
			return -1;
		}
		
		if(root.getValue() == key) {
			return level;
		}
		
		int result = getLevel(key, root.getLeftChild(), level+1);
		if(result != -1) {
			return result;
		}
		
		result = getLevel(key, root.getRightChild(), level+1);
		if(result != -1) {
			return result;
		}	
		
		return -1;
	}
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		root.setLeftChild(new BinaryTreeNode(2));
		root.setRightChild(new BinaryTreeNode(3));
		root.getLeftChild().setLeftChild(new BinaryTreeNode(4));
		root.getLeftChild().setRightChild(new BinaryTreeNode(5));

		System.out.println(getLevel(6, root, 1));
	}

}
