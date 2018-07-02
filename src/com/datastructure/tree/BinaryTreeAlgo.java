package com.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeAlgo {
	public BinaryTreeNode binaryTreeNode;
	public boolean root = true;
	public int count = 0;

	public static void main(String a[]) {
		List<Integer> treeValueList = new ArrayList<>();
		treeValueList.add(50);
		treeValueList.add(5);
		treeValueList.add(39);
		treeValueList.add(28);
		treeValueList.add(100);
		treeValueList.add(87);
		treeValueList.add(67);
		treeValueList.add(3);
		treeValueList.add(22);
		treeValueList.add(38);
		treeValueList.add(56);
		treeValueList.add(105);
		treeValueList.add(69);
		BinaryTreeAlgo binaryTreeAlgo = new BinaryTreeAlgo();
		BinaryTreeNode binaryTree = binaryTreeAlgo.createBinaryTree(treeValueList);
		binaryTreeAlgo.postOrder(binaryTree);

	}

	public BinaryTreeNode createBinaryTree(List<Integer> treeValueList) {
		boolean root = true;
		BinaryTreeNode rootBinaryTreeNode = null;
		for (Integer i : treeValueList) {
			if (root) {
				root = false;
				rootBinaryTreeNode = new BinaryTreeNode(i);
			} else {
				add(i, rootBinaryTreeNode);
			}

		}
		return rootBinaryTreeNode;
	}

	public void add(int value, BinaryTreeNode rootNode) {
		if (rootNode.getValue() > value && rootNode.getBinaryTreeLeftChild() != null) {
			add(value, rootNode.getBinaryTreeLeftChild());
		} else if (rootNode.getValue() < value && rootNode.getBinaryTreeRightChild() != null) {
			add(value, rootNode.getBinaryTreeRightChild());
		} else if (rootNode.getValue() > value && rootNode.getBinaryTreeLeftChild() == null) {
			rootNode.setBinaryTreeLeftChild(new BinaryTreeNode(value));
		} else if (rootNode.getValue() < value && rootNode.getBinaryTreeRightChild() == null) {
			rootNode.setBinaryTreeRightChild(new BinaryTreeNode(value));
		}
	}

	public void delete(int value, BinaryTreeNode rootNode) {

	}

	public void inOrder(BinaryTreeNode rootNode) {
		if(rootNode.getBinaryTreeLeftChild()==null){
			System.out.println(rootNode.getValue());
		}else{
			inOrder(rootNode.getBinaryTreeLeftChild());
			System.out.println(rootNode.getValue());
			if(rootNode.getBinaryTreeRightChild()!=null){
				inOrder(rootNode.getBinaryTreeRightChild());
			}
		}
	}

	public void preOrder(BinaryTreeNode rootNode) {
		System.out.println(rootNode.getValue());
		if(rootNode.getBinaryTreeLeftChild()!=null){
			preOrder(rootNode.getBinaryTreeLeftChild());
			if(rootNode.getBinaryTreeRightChild()!=null){
				preOrder(rootNode.getBinaryTreeRightChild());
			}
		}

	}

	public void postOrder(BinaryTreeNode rootNode) {
		if(rootNode.getBinaryTreeLeftChild()!=null){
			postOrder(rootNode.getBinaryTreeLeftChild());
			if(rootNode.getBinaryTreeRightChild()!=null){
				postOrder(rootNode.getBinaryTreeRightChild());
			}
		}
		System.out.println(rootNode.getValue());

	}
	public void bfsTraversal(BinaryTreeNode rootNode){
		System.out.println(rootNode.getValue());
		System.out.println(rootNode.getBinaryTreeLeftChild().getValue());
		System.out.println(rootNode.getBinaryTreeRightChild().getValue());
		bfsTraversal(rootNode.getBinaryTreeLeftChild());
		bfsTraversal(rootNode.getBinaryTreeRightChild());
	}
}
