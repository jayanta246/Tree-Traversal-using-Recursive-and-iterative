package com.tree.traversal;

public class Main
{

	public static void main(String[] args)
	{
		Tree t=new Tree();
		TreeNode root=null;
		root=t.insertNode(root, 25);
		root=t.insertNode(root, 20);
		root=t.insertNode(root, 15);
		root=t.insertNode(root, 27);
		root=t.insertNode(root, 30);
		root=t.insertNode(root, 29);
		root=t.insertNode(root, 26);
		root=t.insertNode(root, 22);
		root=t.insertNode(root, 22);
		t.in_order_recursive(root);
		System.out.println();
		t.in_order_iterative(root);
		System.out.println();
		t.pre_order_recursive(root);
		System.out.println();
		t.pre_order_iterative(root);
		
		
		

	}

}
