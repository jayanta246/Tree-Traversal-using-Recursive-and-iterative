package com.tree.traversal;

public class TreeNode
{
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(int data)
	{
		this.data=data;
		this.leftChild=this.rightChild=null;
	}
	
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
	public void setLeftChild(TreeNode leftChild)
	{
		this.leftChild=leftChild;
	}
	public TreeNode getLeftChild()
	{
		return leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public String toString()
	{
		return String.valueOf(data);
	}
}
