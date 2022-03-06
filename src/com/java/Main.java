package com.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Binary Tree");

		BinarySearchTree a = new BinarySearchTree();
		Node root = null;

		root = a.insert(root, 56);
		root = a.insert(root, 30);
		root = a.insert(root, 70);

		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();

	}
	/* inOrder */

	public static void inOrder(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	/* postOrder */
	public static void postOrder(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;

		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data + " ");

	}

	public static void preOrder(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;
		System.out.print(root.data + " ");
		inOrder(root.left);
		inOrder(root.right);

	}
}
