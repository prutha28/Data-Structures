package binary.search.trees;

public class BinarySearchTree implements IBinarySearchTree {

	/**
	 *  This method looks up the entire binary tree for an appropriate 
	 *  position for inserting the data.
	 *  It then returns the root ( may or may not have been modified)
	 *  
	 *  Each call to insert function returns the reference 
	 *  to the newly created node.
	 */

	public BSTNode insert( BSTNode root, int data) {

		if( root == null)
		{
			// First insertion.
			root = new BSTNode(data) ;		// Base Case.
			return root ;
		}

		if( data < root.data ){
			root.left = insert( root.left, data) ;
		}
		else{
			root.right = insert( root.right, data) ;
		}

		return root ;
	}

	/**
	 *  This method looks up the entire binary tree for the data.
	 *  It does so by first looking at the root, then recursively 
	 *  looking at the left & right subtrees. 
	 */
	public boolean search( BSTNode root, int data) {

		if ( root == null)
			return false ;

		if( data == root.data )
			return true ;

		else if( data < root.data)
			return search( root.left, data ) ;

		else if( data > root.data)
			return search( root.right, data) ;

		else 
			return false ;
	}

	public BSTNode delete( BSTNode root, int data) {

		if( root == null){
			return null ;
		}

		// First search the value to be deleted.

		if( data < root.data)
			root.left = delete( root.left, data ) ;

		else if ( data > root.data)
			root.right = delete( root.right, data ) ;

		else if ( root.data == data ){
			// Data to be deleted is found.

			// Case 1: If the node is a leaf.
			if( root.left == null && root.right == null )
			{
				root = null ;
				return root ;
			}

			// Case 2: If the node has exactly 1 child.
			// Right child null
			else if( root.left != null && root.right == null ){
				BSTNode temp = root ; // node to be deleted.
				root = root.left ;
				temp = null ;
				return root ;
			}

			// Left child null
			else if( root.left == null && root.right != null ){
				BSTNode temp = root ; // node to be deleted.
				root = root.right ;
				temp = null ;
				return root ;
			}

			// Case 3: node to be deleted has 2 children.

			else if( root.left != null && root.right != null ){
				BinarySearchTreeUtils utils = new BinarySearchTreeUtils() ;

				// 1. Find the min in the right subtree
				// P.S. If the node is the minNode then, it is guaranteed to be 
				// either the leftmost child( leaf node, case 1 ) or as a node with only a right child. ( case 2) 
				BSTNode minNode = utils.findMin(root.right) ;

				// 2. Copy its value onto the root.				
				root.data = minNode.data ;

				// 3. Delete that duplicate node from the right subtree
				return delete( root.right, minNode.data) ;

			}
		}

		return root ;
	}



	/**
	 *  This method looks up the entire binary tree for the data.
	 *  It does so by first looking at the root, then recursively 
	 *  looking at the left & right subtrees. 
	 *  If the data is found, it returns the pointer to the node at which 
	 *  it was found.
	 *  Otherwise it returns a pointer to the parent node where it should be
	 *  inserted.
	 */
	public BSTNode searchTree( BSTNode root, int data){

		if ( root == null)
			return null ;

		if( data == root.data )
			return root ;

		else if( data < root.data){
			if( root.left == null )
				return root ;
			else
				return searchTree( root.left, data ) ;
		}

		else{ //if( data > root.data){
			if( root.right == null)
				return root ;
			else
				return searchTree( root.right, data) ;
		}

	}


	public BSTNode insertTree( BSTNode root, int data) {

		BSTNode place = searchTree(root, data) ;

		if( place == null){
			place = new BSTNode(data) ;
		}
		
		else if( place.data == data)
		{
			// Means that the data being search was present already
			// and therefore node to that data was returned.

			return null ;
			// Or if u want to allow duplicates
			// place.count++ ;

		}else if( data < place.data)
			place.left = new BSTNode(data) ;
		else
			place.right = new BSTNode(data) ;
		return place;
	}

}