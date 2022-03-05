package com.java;

import java.util.Scanner;

public class BinarySearchTree {

	static Scanner scanner = null;

	/* main function */

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Node root = CreateTree();
		System.out.println("welcome");
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();

	}

	/* created CreateTree Method , consider initial root value is null */

	public static Node CreateTree() {
		Node root = null;

		System.out.println("Enter data: ");
		int data = scanner.nextInt(); // got data

		if (data == -1) {
			// System.out.println("null");
			return null;
		}
		root = new Node(data); // created node

		System.out.println("enter left for " + data);
		root.left = CreateTree();

		System.out.println("enter right for " + data);
		root.right = CreateTree();

		return root;

	}

	/* inOrder */
	static void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	/* preOrder */
	public static void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	/* postOrder */
	public static void postOrder(Node root) {
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
}
