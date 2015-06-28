package recursion;

public class PrintString {

	public static void main( String[] args){
		new PrintString() ;
	}
	
	
	public PrintString(){
		String str = "Prutha" ;
		print( str ) ;
	}


	private void print(String str) {

		int len = str.length() ;
		int i = 0 ;
		
		if( len == 0 ) return ;
		
		System.out.printf("%c", str.charAt(i));
		i++ ;
		print(str.substring(i, len)) ;
	}
}
