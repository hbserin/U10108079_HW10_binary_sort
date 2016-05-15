/**Name:Erin
 *Id:U10108079
 *Exercise:HW10_binary_sort
 */

import java.util.Scanner;

//main method
public class BinarySort <E extends Comparable<E>> extends AbstractTree<E>{
	public static void main(String[] args) {

	  	// Create a Scanner
		Scanner input = new Scanner(System.in);

		//Enter how many numbers in the list
		int number;
		System.out.print("Enter how many numbers in the list：");
		number= input.nextInt();		

		//Create an array to store the list
		int[] list;
		list = new int[number];

		//Enter the numbers in the list
		System.out.println("Enter the numbers in the list：");
		for(int i = 0; i<list.length; i++){
			System.out.print("["+ (i+1) + "]:");
			list[i] = input.nextInt();
		}
		
		protected TreeNode<E> root;
		protected int size = 0;
		
		BST<Integer> intTree = new BST<>(numbers); 
		System.out.print("\nInorder (sorted): ");
		intTree.inorder();
		
		 @Override /** Insert element o into the binary tree
		 Return true if the element is inserted successfully */
		 public boolean insert(E e) {
		 	if (root == null)
		 		root = createNewNode(e); // Create a new root
		 	else {
		 		// Locate the parent node
		 		TreeNode<E> parent = null;
		 		TreeNode<E> current = root;
		 		while (current != null)
		 		if (e.compareTo(current.element) < 0) {
		 			parent = current;
		 			current = current.left;
		 		}else if (e.compareTo(current.element) > 0) {
		 			parent = current;
		 			current = current.right;
		 		}else
		 			return false; // Duplicate node not inserted

				// Create the new node and attach it to the parent node
				if (e.compareTo(parent.element) < 0)
					parent.left = createNewNode(e);
				else
					parent.right = createNewNode(e);
			}
			size++;
			return true; // Element inserted successfully
		}

		protected TreeNode<E> createNewNode(E e) {
			return new TreeNode<>(e);
		}

		@Override /** Inorder traversal from the root */
		public void inorder() {
			inorder(root);
		}

		/** Inorder traversal from a subtree */
		protected void inorder(TreeNode<E> root) {
			if (root == null) return;
			inorder(root.left);
			System.out.print(root.element + " ");
			inorder(root.right);
		}

		/** This inner class is static, because it does not access any instance members defined in its outer class */
		public static class TreeNode<E extends Comparable<E>> {
			public E element;
			public TreeNode<E> left;
			public TreeNode<E> right;
			
			public TreeNode(E e) {
				element = e;
			}
		}

		/** Returns the root of the tree */
		public TreeNode<E> getRoot() {
			return root;
		}

		/** Returns a path from the root leading to the specified element */
		public java.util.ArrayList<TreeNode<E>> path(E e) {
			java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<>();
			TreeNode<E> current = root; // Start from the root

			while (current != null) {
				list.add(current); // Add the node to the list
				if (e.compareTo(current.element) < 0) {
					current = current.left;
				}else if (e.compareTo(current.element) > 0) {
					current = current.right;
				}else
					break;
			}
			
			return list; // Return an array list of nodes
		}

		/** Inorder traversal from a subtree */
		private void inorder(TreeNode<E> root) {
			if (root == null)return;
			norder(root.left);
			list.add(root.element);
			inorder(root.right);
		}

		@Override /** More elements for traversing? */
		public boolean hasNext() {
			if (current < list.size())
				return true;
			else
				return false;
		}

		@Override /** Get the current element and move to the next */
		public E next() {
			return list.get(current++);
		}

		@Override /** Remove the current element */
		public void remove() {
			delete(list.get(current)); // Delete the current element
			list.clear(); // Clear the list
			inorder(); // Rebuild the list
		}
		
	}

	/** Remove all elements from the tree */
	public void clear() {
		root = null;
		size = 0;
	}
	
}
