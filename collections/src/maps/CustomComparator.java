package maps;

import java.util.Comparator;

public class CustomComparator implements Comparator<String>{


	@Override
	public int compare(String str1, String str2) {

		if( str1.equals(str2))
			return 0 ;
		else if(str1.compareTo(str2) < 0)
			return 1 ;
		else
			return -1 ;
//		return str2.compareTo(str1) ;
		
	}
}
