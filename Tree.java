package com.tree.traversal;

import java.util.Stack;

public class Tree
{
	public TreeNode insertNode(TreeNode root, int data)
	{
		TreeNode node=new TreeNode(data);
		if(root==null)
		{
			return node;
		}
		if(root.getData()>=node.getData())
		{
			root.setLeftChild(insertNode(root.getLeftChild(),data));
		}
		else
		{
			root.setRightChild(insertNode(root.getLeftChild(),data));
		}
		return root;
	}
	
	
	public void pre_order_recursive(TreeNode root)
	{
		if(root!=null)
		{
			System.out.print(root.getData() + " ");
			pre_order_recursive(root.getLeftChild());
			pre_order_recursive(root.getRightChild());
		}
	}
	
	
	public void pre_order_iterative(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		Stack<TreeNode>s=new Stack<TreeNode>();
		s.push(root);
		
		while(!s.empty())
		{
			TreeNode current=s.pop();
			System.out.print(current.getData() + " ");
			
			if(current.getRightChild()!=null)
			{
				s.push(current.getRightChild());
			}
			
			if(current.getLeftChild()!=null)
			{
				s.push(current.getLeftChild());
			}
			
		}
		
	}
	
	
	public void in_order_recursive(TreeNode root)
	{
		if(root!=null)
		{
			in_order_recursive(root.getLeftChild());
			System.out.print(root.getData() + " ");
			in_order_recursive(root.getRightChild());
		}
	}
	
	public void in_order_iterative(TreeNode root)
	{
		if(root==null)
		{
			return;

		}
		Stack<TreeNode> s=new Stack<TreeNode>();
		TreeNode current=root;
		while(!s.empty() || current!=null)
		{
			if(current!=null)
			{
				s.push(current);
				current=current.getLeftChild();
			}
			else
			{
				current=s.pop();
				System.out.print(current.getData() + " ");
				current=current.getRightChild();
			}
		}
	}
	
	public void post_order_recursive(TreeNode root)
	{
		if(root!=null)
		{
			post_order_recursive(root.getLeftChild());
			post_order_recursive(root.getRightChild());
			System.out.print(root.getData() + " ");
		}
	}
	
	
	public void post_order_iterative(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		Stack<TreeNode>in=new Stack<TreeNode>();
		Stack<TreeNode>out=new Stack<TreeNode>();
		in.push(root);
		
		while(!in.empty())
		{
			TreeNode current=in.pop();
			out.push(current);
			
			if(current.getLeftChild()!=null)
			{
				in.push(current).getLeftChild();
			}
			if(current.getRightChild()!=null)
			{
				in.push(current).getRightChild();
			}
		}
		while(!out.empty())
		{
			System.out.print(out.pop().getData() + " ");
		}
	}
}
