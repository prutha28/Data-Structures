package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class ListClient {

	
	public static void main(String[] args) {
		
		Collection<String> c = new TreeSet<String>() ;
		c.add("anar") ;
		c.add("mumma") ;
		c.add("viraj") ;
		c.add("pingi") ;
		c.add("sparsh") ;
		c.add("tino") ;

		System.out.println("Iterating the list using for each construct");
		System.out.println("The contents of the collection are:" );
		for (String element : c) {
			System.out.println(element);
		}
		
		System.out.println("Initializing a list using the conversion contructor");
		List<String> tellerList = new ArrayList<String>(c) ;
		
		System.out.println("Adding elements to the list");
		System.out.println("Keep Adding Elements to the end of the list.");
	
		tellerList.add("prutha") ;
		tellerList.add("sparsh") ;
		
		System.out.println(" Add an element to the list at index = 4");
		tellerList.add(4, "janedoe") ;
		
		System.out.println("Iterating the list using iterator");
		
		Iterator<String> itr = tellerList.iterator() ;
	
		while(itr.hasNext()){ 
			System.out.println(itr.next());
		}
		
		System.out.println("Iterating the list using list iterator in the forward direction");
		
		ListIterator<String> listItr = tellerList.listIterator() ;
		
		while(listItr.hasNext()){
			String tellerName = listItr.next() ; 
			System.out.println(tellerName);
			
			if( tellerName.equals("janedoe")){
				listItr.remove();
			}
		}
		
		
		System.out.println("Iterating the list using list iterator in the backward direction") ;
		
		while(listItr.hasPrevious()){
			System.out.println(listItr.previous());

		}
		
		

		List<Integer> listOfNumbers = new ArrayList<Integer>() ;
		listOfNumbers.add(10) ; //Auto boxing!
		listOfNumbers.add(20) ;
		listOfNumbers.add(30) ;
		listOfNumbers.add(40) ;
		listOfNumbers.add(50) ;
		listOfNumbers.add(60) ;
		listOfNumbers.add(70) ;
		
		int sum = 0 ;
		
		for (Integer number : listOfNumbers) {
			System.out.println("Number is:  " + number);
			sum = sum + number ;
			listOfNumbers.set(0, 100) ;
		}
		
		System.out.println("Sum is "+ sum);
		
		
		
	}

}
