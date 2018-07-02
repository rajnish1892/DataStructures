package com.datastructure.tree;

public class BinaryTreeNode {
	private int value;
	private BinaryTreeNode binaryTreeLeftChild;
	private BinaryTreeNode binaryTreeRightChild;
	BinaryTreeNode(int value){
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public BinaryTreeNode getBinaryTreeLeftChild() {
		return binaryTreeLeftChild;
	}
	public void setBinaryTreeLeftChild(BinaryTreeNode binaryTreeLeftChild) {
		this.binaryTreeLeftChild = binaryTreeLeftChild;
	}
	public BinaryTreeNode getBinaryTreeRightChild() {
		return binaryTreeRightChild;
	}
	public void setBinaryTreeRightChild(BinaryTreeNode binaryTreeRightChild) {
		this.binaryTreeRightChild = binaryTreeRightChild;
	}
	@Override
	public String toString() {
		return "BinaryTreeNode [value=" + value + ", binaryTreeLeftChild="
				+ binaryTreeLeftChild + ", binaryTreeRightChild="
				+ binaryTreeRightChild + "]";
	}

}
