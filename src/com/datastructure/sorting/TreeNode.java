package com.datastructure.sorting;

import java.util.List;

public class TreeNode {
	int vertexValue;
	int vertexNumber;
	List<TreeNode> treeCutAddressList;
	public int getVertexValue() {
		return vertexValue;
	}
	public void setVertexValue(int vertexValue) {
		this.vertexValue = vertexValue;
	}
	public int getVertexNumber() {
		return vertexNumber;
	}
	public void setVertexNumber(int vertexNumber) {
		this.vertexNumber = vertexNumber;
	}
	public List<TreeNode> getTreeCutAddressList() {
		return treeCutAddressList;
	}
	public void setTreeCutAddressList(List<TreeNode> treeCutAddressList) {
		this.treeCutAddressList = treeCutAddressList;
	}

}
