package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main( String[] args){
		List<String> names = new ArrayList<String>() ;
		names.add("A") ;
		names.add("P") ;
		names.add("P") ;
		names.add("L") ;
		names.add("E") ;
		
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println();
		
		
		ListIterator<String> lItr = names.listIterator(names.size()) ;
		System.out.println(names.size());
		
//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(i);
//		}
		
		while( lItr.hasPrevious())
		{
			System.out.println(lItr.previous());
		}
		
	}
}


