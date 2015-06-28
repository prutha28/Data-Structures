package binary.search.trees;


/**
Given a binary tree, prints out all of its root-to-leaf
 **/


public class BSTPrintAllPaths {

	public void printAllPaths( BSTNode root )
	{
		if( root == null)
			return ;

		System.out.println(root.data);

		printAllPaths(root.left) ;
		printAllPaths(root.right) ;
	}


}
