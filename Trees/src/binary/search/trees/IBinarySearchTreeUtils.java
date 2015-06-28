package binary.search.trees;

public interface IBinarySearchTreeUtils {


	public BSTNode createNode( int data ) ;

	public int size( BSTNode root) ;

	// Query methods
	public boolean isInternal( BSTNode root) ;

	public boolean isLeaf( BSTNode root) ;

	public boolean isRoot( BSTNode node ) ;
	
	public BSTNode findMin( BSTNode root ) ;

	public int findMax( BSTNode root ) ;

	public int findMin_rec( BSTNode root ) ;

	public int findMax_rec( BSTNode root ) ;

	public int height( BSTNode root ) ;

	public boolean isBSTSame( BSTNode root, BSTNode other) ;

	public BSTNode union( BSTNode otherBST ) ;
	
	public BSTNode intersection( BSTNode otherBST ) ;
	
	
}