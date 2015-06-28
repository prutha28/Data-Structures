package binary.search.trees;

public class BSTCheck {

	BinarySearchTreeUtils utils = new BinarySearchTreeUtils() ;

	public boolean isBST_01( BSTNode root )
	{
		if( root == null)
			return true ;

		if( isBST_01(root.left)				// The left subtree should be a BST 
				&& isBST_01(root.right) 	// The right subtree should be a BST
				&& isSubtreeLess( root.left, root.data)			// Each element in the left subtree must be lesser than the value in the root.
				&& isSubTreeGreater( root.right, root.data))	// Each element in the right subtree must be greater than the value in the root.
			return true ;

		else
			return false ;
	}

	/**
	 * Returns true if every value in the subtree with root is lesser than the value being passed.
	 * @param root
	 * @param value
	 * @return
	 */
	private boolean isSubtreeLess(BSTNode root, int value) {
		if( root == null )
			return true ;

		if(( root.data <= value) &&
				isSubtreeLess(root.right, value) &&
				isSubtreeLess(root.left, value))
			return true;
		else 
			return false ;
	}
	
	private boolean isSubTreeGreater(BSTNode root, int value) {

		if( root == null )
			return true ;

		if( root.data > value &&
				isSubTreeGreater(root.right, value) &&
				isSubTreeGreater(root.left, value))
			return true;
		else 
			return false ;
	}

	// Recursively, Check if the left & right subtrees are BSTs.
	// Check if the element in the root is more than the MAX in the left subtree and MIN in the right subtree.

	public boolean isBST_02( BSTNode root )
	{
		if( root == null)
			return true ;

		if( (isBST_02(root.left)) 
				&& (isBST_02(root.right )) 
				&& ( root.data >= utils.findMax(root.left)) 
				&& ( root.data < utils.findMin_rec(root.right)))

			return true ;

		else
			return false ;
	}


	public boolean isBST( BSTNode root, int minValue, int maxValue )
	{
		if( root == null)
			return true ;


		if (( root.data > minValue) &&
				( root.data < maxValue) && 
				isBST(root.left, minValue, root.data) && 
				isBST(root.right, root.data, maxValue)) 
			return true ;

		else
			return false ;
	}
}
