package binary.search.trees;

public class BinarySearchTreeUtils implements IBinarySearchTreeUtils {

	public BSTNode createNode( int data ) 
	{
		return new BSTNode(data) ;
	}

	// Iteratively
	public BSTNode findMin( BSTNode root )
	{
		if ( root == null) 
			return null ;

		// Traverse till the left-most node down the tree.
		while ( root.left != null ){
			root = root.left ;
		}

		return root ;
	}

	//	Iteratively
	public int findMax( BSTNode root )
	{
		if ( root == null) 
			return 0 ;

		// Traverse till the right-most node down the tree.
		while ( root.right != null ){
			root = root.right ;
		}

		return root.data ;
	}


	// Recursively
	public int findMin_rec( BSTNode root )
	{
		// Base case
		if ( root == null) 
			return 0 ;

		// If there is no left subtree, then root itself is the min.
		if( root.left == null)
			return root.data ;
		// else keep recursing down the left subtree
		else
			return findMin_rec(root.left) ;		
	}


	// Recursively
	public int findMax_rec( BSTNode root )
	{
		// Base case
		if ( root == null) 
			return 0 ;

		// If there is no right subtree, then root itself is the max.
		if( root.right == null)
			return root.data ; // return root ; if you wish to return the min node.
		// else keep recursing down the left subtree
		else
			return findMax_rec(root.right) ;
	}

	/**
	 * Height of the tree is measured by the number of edges
	 * from root to its deepest leaf node.
	 * Alternatively, it is also the max Depth of the tree. 
	 * @param root
	 * @return
	 */
	
	public int height( BSTNode root )
	{
		if ( root == null) 
			return 0 ;
		
		int l_height = 1 + height( root.left) ;
		int r_height = 1 + height( root.right) ;
		
		if( l_height > r_height )
			return l_height ;
		else 
			return r_height ;
	}

	
	public boolean isBSTSame( BSTNode root, BSTNode other){
		
		// 1. Both empty trees.
		if( root == null && other == null)
				return true ;
		
		// 2. If both are non-emty then compare them
		if( root != null && other!= null){
			return ( root.data == other.data 
					&& isBSTSame( root.left, other.left) 
					&& isBSTSame( root.right, other.right)) ;
		}

		//3. One is empty, other is non-empty.  
		else
			return false ;
	}

	
	public boolean isLeaf( BSTNode root){
		if ( root == null )
			return false ;
		
		if( root.left == null && root.right == null )
			return true ;
		
		else 
			return false ;
	} 
	
	public boolean isInternal( BSTNode root){
		return !(isLeaf(root)) ;
	} 
	
	
	public int size( BSTNode root){
		if ( root == null )
			return 0 ;
		
		else
			return ( size(root.left) + 1 + size( root.right) ) ;
		
	}

	@Override
	public boolean isRoot(BSTNode node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BSTNode union(BSTNode otherBST) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BSTNode intersection(BSTNode otherBST) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
