package linked.lists;

public class Node {

	Object value ;
	Node nextNode ;
	
	Node(){
		super();
	}
	
	
	Node( Object value , Node next){
		this.value = value ;
		this.nextNode = next ;
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
