package arrays.methods.demo;

import java.util.List;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args){

		String[] nameArray = { "prutha", "viraj", "anar", "shalini", "sparsh", "tvikram" } ;
		System.out.println("Name array is : ");
		print(nameArray) ;
		System.out.println("Array as a List");
		List<String> listFromArray = Arrays.asList(nameArray) ;
		System.out.println("Name list is : " + "\n" + listFromArray);
		
		System.out.println("Converting list to array");
//		String[] arrayFromList  =  (String[])listFromArray.toArray() ;
	
		System.out.println("\n\nCall to my method");
		String[] arrayFromList  =  listToArray(listFromArray) ;
		print(arrayFromList) ;
	}


	private static void print(String[] nameArray) {

		for (int i = 0; i < nameArray.length; i++) {
			System.out.print(nameArray[i] + "   " );
		}
		System.out.println("\n");
	}
	
	private static String[] listToArray(List<String> inputList){
		int size = inputList.size() ;
		String[] array = new String[size] ;
		for (int i = 0; i < array.length; i++) {
			array[i] = inputList.get(i) ;
		}
		return array ;
		
	}
	
}
