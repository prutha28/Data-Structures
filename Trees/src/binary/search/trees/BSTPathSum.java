package binary.search.trees;

public class BSTPathSum {

	public boolean hasPathSum( BSTNode root, int sum )
	{
		if( root == null)	// Base case 1
			return false ;

		if( root.data == sum ) // Base Case 2
			return true ;
		
		int subSum = ( sum- root.data ) ;
		
		return (hasPathSum(root.left, subSum)	|| 
				hasPathSum(root.left, subSum)) ;
	}
	
}
