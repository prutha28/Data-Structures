package geek.linked.lists;


/**
 * Given only a pointer to a node to be deleted in a singly linked list, 
 * how do you delete it?
 * A simple solution is to traverse the linked list until you find the node
 * you want to delete. But this solution requires pointer to the head node 
 * which contradicts the problem statement.

 * 	Fast solution is to copy the data from the next node to the node to be deleted 
 * and delete the next node. Something like following.

 *		struct node *temp  = node_ptr->next;
 *		node_ptr->data  = temp->data;
 *		node_ptr->next  = temp->next;
 *  	free(temp);
 *
 */

public class DeletingNodeWithoutHead {

//	This solution doesn’t work if the node to be deleted is the last node of the list.
//	To make this solution work we can mark the end node as a dummy node. 
//	But the programs/functions that are using this function should also be modified.
	
	public static void deleteNode( Node nodeToDel){
		
		Node nextNode = nodeToDel.next ;
		
		// Copy everything from the next node to the current node.
		
		nodeToDel.data = nextNode.data ;
		nodeToDel.next = nextNode.next ;
		
		// Delete the next node.
		nextNode.next = null ;
		nextNode = null ;
	}
	
}
