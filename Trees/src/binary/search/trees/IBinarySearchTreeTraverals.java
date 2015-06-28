package binary.search.trees;

public interface IBinarySearchTreeTraverals {

	// Depth First Traversals.
	public void preOrder( BSTNode root ) ;
	
	public void inOrder( BSTNode root ) ;
	
	public void postOrder( BSTNode root ) ;
	
	// Breadth First Traversals.
	public void levelOrderTraversal_1( BSTNode root) ;
	
	public void levelOrderTraversal_2( BSTNode root) ;
}
