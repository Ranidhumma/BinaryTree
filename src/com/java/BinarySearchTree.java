package com.java;

public class BinarySearchTree {

	public Node insert(Node node, int val) {
		if (node == null) {
			return CreateTree(val);
		}
		if (val < node.data) {
			node.left = insert(node.left, val);
		} else if (val > node.data) {
			node.right = insert(node.right, val);
		}
		return node;

	}

	public Node CreateTree(int k) {

		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	public static void inOrder(Node root) {
		// TODO Auto-generated method stub

		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}
}