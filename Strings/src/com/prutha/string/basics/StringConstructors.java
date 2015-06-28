package com.prutha.string.basics;

public class StringConstructors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating a String using a String literal
		String s1 = "prutha" ;
		// Creating a String using a String constructor
		String s2 = new String("prutha") ;

		// Creating a String using a character array
		char[] charArray = { 'p', 'r', 'u', 't', 'h', 'a' };
		String s3 = new String(charArray) ;
		
		byte[] byteArray =  { 20 , 30, 40 , 50 } ;
		String s4 = new String(byteArray) ;
		System.out.println(s4);
		
	}

	
	
}
