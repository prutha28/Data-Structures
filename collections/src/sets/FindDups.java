package sets;

import java.util.HashSet;
import java.util.Set;

public class FindDups {

	
public static void main( String[] args ){
	Set<String> uniques = new HashSet<String>() ;
	Set<String> duplicates = new HashSet<String>() ;
	
	
	for (String word : args) {
	
		if( !uniques.add(word)){  // uniques.add(word) == true means, the word is not already present in uniques, we are adding it the first time , so not a duplicate 
			duplicates.add(word) ;
		}
	}
	
	System.out.println("Uniques : "+ uniques);
	System.out.println("Duplicates : "+ duplicates);
	
	
	// While printing uniques, suppose we want only uniques to be printed  
	// not the duplicate ones
	
	uniques.removeAll(duplicates) ;
	System.out.println("Uniques with dups removed : "+ uniques);
	
	
}

}



