package binary.trees;

import java.util.List;

public interface ITree {


	// Positional Container methods

	public void swapElements( TreeNode one, TreeNode two) ;

	public void replaceElement( TreeNode one, int key ) ;

	// Query methods
	public boolean isInternal( TreeNode root) ;

	public boolean isLeaf( TreeNode root) ;

	public boolean isRoot( TreeNode node ) ;

	// Accessor methods

	public TreeNode root( TreeNode root ) ;

	public TreeNode parent( TreeNode node ) ;

	public List<TreeNode> children( TreeNode node ) ;



}
