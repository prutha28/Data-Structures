package vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> names = new Vector<String>() ;
		
		System.out.println("The initial capacity is : " + names.capacity());
		
		names.addElement("prutha") ;
		System.out.println("The capacity is : " + names.capacity());
		names.addElement("sparsh") ;
		System.out.println("The capacity is : " + names.capacity());
		names.addElement("anar") ;
		System.out.println("The capacity is : " + names.capacity());
		names.addElement("viraj") ;
		System.out.println("The capacity is : " + names.capacity());
		names.addElement("merideth") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("derek") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("bran") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("rickon") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("sansa") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("arya") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("jon") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("robb") ;
		System.out.println("The capacity is : " + names.capacity());
		
		Enumeration<String> itr = names.elements() ;
		
		while(itr.hasMoreElements()){
			
			System.out.println(itr.nextElement());
		}
		
		
		
		
		names = new Vector<>(4, 2) ;
		
		System.out.println("The initial capacity is : " + names.capacity());
		names.add("1. dany") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("2. tywin") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("3. cersie") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("4. jaime") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("5. tyrion") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("6. jeoffry") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("7. peter") ;
		System.out.println("The capacity is : " + names.capacity());
		names.add("8. heidi") ;
		System.out.println("The capacity is : " + names.capacity());
		
	}

}
