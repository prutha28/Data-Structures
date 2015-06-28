package recursion;

public class PrintReversedString {

	public PrintReversedString(){
		String s = "Prutha Khandeparker" ;
		reverseString(s) ;
	}

	private void reverseString(String s) {
		int len = s.length() ;
		
		if( len <= 0 ) return ;
		
		System.out.printf("%c", s.charAt(len - 1) );
		reverseString(s.substring(0, len-1)) ;
	}
	
	public static void main( String[] args){
		new PrintReversedString() ;
	}
}
