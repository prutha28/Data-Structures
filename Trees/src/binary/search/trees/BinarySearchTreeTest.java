package binary.search.trees;

public class BinarySearchTreeTest {

	public static void main(String[] args) {

		BinarySearchTree bST = new BinarySearchTree() ;
		
		BSTNode root = null ; 
		
		// Insertions
		root = bST.insert(root, 3) ;
		root = bST.insert(root, 4) ;
		root = bST.insert(root, 5) ;
		root = bST.insert(root, 1) ;
		root = bST.insert(root, 8) ;
		root = bST.insert(root, 9) ;
		root = bST.insert(root, 10) ;
		
		// Traversals
		IBinarySearchTreeTraverals traversals = new BinarySearchTreeTraversals() ;
		
		System.out.println("\nIn Order traversal");
		traversals.inOrder(root) ;
		
		System.out.println("\nPost Order traversal");
		traversals.postOrder(root) ;

		System.out.println("\nPre Order traversal");
		traversals.preOrder(root) ;

		System.out.println("\nLevel Order traversal");
		traversals.levelOrderTraversal_1(root) ;
		
//		System.out.println("\nLevel Order traversal");
//		traversals.levelOrderTraversal_1(root) ;
		
		// Deletions
		root = bST.delete(root, 8) ;
		
		System.out.println("\nIn Order traversal");
		traversals.inOrder(root) ;
		
		// Searching
		System.out.println("\nIs the element 4 present? " + bST.search(root, 4) );
		
		// Searching
		System.out.println("\nIs the element 8 present? " + bST.search(root, 8) );

		// Other utilities

		BinarySearchTreeUtils utils = new BinarySearchTreeUtils() ;
		
		// Min & Max
		//Iteratively
		System.out.println("\nThe Maximum is " + utils.findMax(root));
		System.out.println("\nThe Minimum is " + utils.findMin(root).data);

		// Recursively
		System.out.println("\nThe Maximum is " + utils.findMax_rec(root));
		System.out.println("\nThe Minimum is " + utils.findMin_rec(root));
	
		// Comparing 2 BSTs.
		
		BinarySearchTree otherBST = new BinarySearchTree() ;
		BSTNode otherRoot = null ; 
		otherRoot = otherBST.insert(otherRoot, 3) ;
		otherRoot = otherBST.insert(otherRoot, 4) ;
		otherRoot = otherBST.insert(otherRoot, 5) ;
		otherRoot = otherBST.insert(otherRoot, 1) ;
		otherRoot = otherBST.insert(otherRoot, 9) ;
		otherRoot = otherBST.insert(otherRoot, 10) ;

		System.out.println("\nAre BST1 & BST2 identical? " + utils.isBSTSame(root, otherRoot));
		
		otherRoot = otherBST.insert(otherRoot, 8) ;
		System.out.println("\nAre BST1 & BST2 still identical? " + utils.isBSTSame(root, otherRoot));
		
		// Check if it is a binary tree.
		BSTCheck bSTCheck = new BSTCheck() ;
		System.out.println("Is BST1 a binary search tree -> " + bSTCheck.isBST_01(otherRoot));
		System.out.println("Is BST1 a binary search tree -> " + bSTCheck.isBST_02(otherRoot));
		System.out.println("Is BST1 a binary search tree -> " + bSTCheck.isBST(otherRoot, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		
		
		
	}

}
