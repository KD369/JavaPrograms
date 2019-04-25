package com.ds7;

public class BST {

	public int countTree(int numKeys) {

		if (numKeys <= 1) {
			return 1;

		} else {
			int sum = 0;
			int left, right, root;
			for (root = 1; root <= numKeys; root++) {
				left = countTree(root - 1);
				right = countTree(numKeys - root);
				sum += left * right;
			}
			return sum;

		}
	}
	
	public int count(int n) {
		int[] T = new int[n-1];
		T[0] = 1;
		T[1] = 1;
		
 		for(int i = 2; i <= n; i++) {
 			for(int j = 0; j < i; j++) {
 				T[i] += T[j] * T[i-j-1];
 				
 			}
 		}
 		return T[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST tree = new BST();
		System.out.println("Number of node 5 : " + tree.countTree(5));
		System.out.println("Number of node 2 : " + tree.countTree(2));
	}

}
