package binary.trees;

public interface IBinaryTree extends ITree {

	// Accessor methods
	
	public BinaryTreeNode leftChild( BinaryTreeNode parent ) ;
	
	public BinaryTreeNode rightChild( BinaryTreeNode parent ) ;
	
	public BinaryTreeNode sibling( BinaryTreeNode node ) ;
	
	
	
}
