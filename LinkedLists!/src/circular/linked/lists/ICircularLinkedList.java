package circular.linked.lists;

import circular.linked.lists.CircularLinkedList.Node;

public interface ICircularLinkedList {

	/**
	 * Adding a node to the start of the list.
	 * @param entry
	 */
	public Node addNode( Node entry, int element ) ;
	/**
	 * Removing node from the start of the list.
	 * @param entry
	 */
	public Node removeNode( Node entry) ;

}
