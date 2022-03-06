package com.java;

public class Main {

	private static final Node size = null;
	private static final Node root = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Binary Tree");

		BinarySearchTree a = new BinarySearchTree();

		Node root = null;

		root = a.insert(root, 56);
		root = a.insert(root, 30);
		root = a.insert(root, 70);
		root = a.insert(root, 22);
		root = a.insert(root, 40);
		root = a.insert(root, 60);
		root = a.insert(root, 95);
		root = a.insert(root, 11);
		root = a.insert(root, 65);
		root = a.insert(root, 3);
		root = a.insert(root, 16);
		root = a.insert(root, 63);
		root = a.insert(root, 67);

		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();

		/* Search Key */
		root = a.searchKey(root, 95);

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