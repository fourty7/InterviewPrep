package datastructures.trees;

public class BinaryTreeNode {
	private int value;
	public void setValue(int value) {
		this.value = value;
	}

	private BinaryTreeNode leftChild;
	private BinaryTreeNode rightChild;
	
	public BinaryTreeNode(int value) {
		this.value = value;
		leftChild = null;
		rightChild = null;
	}
	
	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}
	
	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public int getValue() {
		return value;
	}
	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}

	public BinaryTreeNode getRightChild() {
		return rightChild;
	}
	
	public boolean isLeafNode(){
		return leftChild==null && rightChild ==null;
	}

}
