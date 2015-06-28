package binary.search.trees;

import implementing.queues.using.linked.lists.Queue ;

public class BinarySearchTreeTraversals implements IBinarySearchTreeTraverals {

	BinarySearchTreeUtils utils = new BinarySearchTreeUtils() ;
	
	public void preOrder(BSTNode root) {
		
		if( root == null)
			return ;

		// Root L R
		System.out.printf("%4d", root.data );
		preOrder(root.left) ;
		preOrder(root.right) ;
	}

	public void inOrder(BSTNode root) {

		if( root == null)
			return ;
	
		// L Root R
		inOrder(root.left) ;
		System.out.printf("%4d", root.data );
		inOrder(root.right) ;	
	}

	public void postOrder(BSTNode root) {
		if( root == null)
			return ;

		// L R Root
		postOrder(root.left) ;
		postOrder(root.right) ;
		System.out.printf("%4d", root.data );
	}

	public void levelOrderTraversal_1(BSTNode root) {

		int height = utils.height(root) ;
		
		for (int i = 1; i <= height ; i++) {
			printAtLevel( root, i ) ;
		}
	}

	private void printAtLevel(BSTNode root, int level ) {
		
		if( root == null){
			return ;
		}
		
		if( level == 1){
			System.out.printf("%4d", root.data );
		}
		
		printAtLevel(root.left, level -1 ) ;
		printAtLevel(root.right, level -1 ) ;
	}

	public void levelOrderTraversal_2(BSTNode root) {
		
		if( root == null)
			return ;
		
		Queue q = new Queue() ;
		
		while( root != null ){
			// 1. Enqueue a given node
		//	q.enqueue(root) ;
			
			// 2. Visit it
			System.out.printf("%4d", root.data ) ;
			
			// 3. enqueue its children
			//q.enqueue( root.left) ;
//			q.enqueue( root.right) ;
			
			// 4. Dequeue the node at the front.
//			q.dequeue() ;
			levelOrderTraversal_2(root.left) ;
			levelOrderTraversal_2(root.right) ;
		}
		
	}
	
	
}
