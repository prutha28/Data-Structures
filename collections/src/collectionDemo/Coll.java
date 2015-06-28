package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Coll {
	
	public static void main(String[] args) {
		
		List l = new ArrayList() ;
		l.add("prutha") ;
		l.add("sparsh") ;
		l.add(22) ;
		l.add(22) ;
		
		Iterator itr = l.iterator() ;
		
		while( itr.hasNext()){
			System.out.print("  ");
			System.out.print(itr.next());
		}
		
		l.add(1, 17) ;
		
		itr = l.iterator() ;
		System.out.println();
		while( itr.hasNext()){
			System.out.print("  ");
			System.out.print(itr.next());
		}
	}

}
