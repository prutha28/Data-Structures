package queues;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main( String[] args){
		
		Queue<String> q = new PriorityQueue<String>(10 , new NameComparator()) ;
		
		System.out.println("Adding elements to the queue");
		System.out.println("By default, elements are added to the head");
		
		q.add("Arya") ;
		q.add("Bran") ;
		q.add("cersie") ;
		q.add("elle") ;
		q.add("dany") ;
		q.add("fiona") ;
		q.add("goa") ;
		q.add("hena") ;
		q.add("iowa") ;
		q.add("jon") ;
		
		for (String element : q) {
			System.out.println(element);
		}
		
		System.out.println("______________________________________");
		Iterator<String> itr = q.iterator() ;
		while( itr.hasNext()){
			System.out.println(itr.next());
		} 
		
		System.out.println("Element at the head : " +  q.peek());
	}
	
}
