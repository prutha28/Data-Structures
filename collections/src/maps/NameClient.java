package maps;

import java.util.Map;
import java.util.TreeMap;

public class NameClient {

	public static void main(String[] args) {

		PersonName person1 = new PersonName("Prutha", "Khandeparkar") ; 
		PersonName person2 = new PersonName("Savinay", "Narendra") ;
		PersonName person3 = new PersonName("Dodo", "Biswas") ;
		PersonName person4 = new PersonName("Partik", "Madan") ;
		PersonName person5 = new PersonName("Goku", "Raju") ;
		PersonName person6 = new PersonName("Rableen", "Kaur") ;
		
		
		Map<PersonName, Integer> m = new TreeMap<PersonName, Integer>(new CustomNameComparator()) ;
		m.put(person1, 100) ;
		m.put(person2, 200) ;
		m.put(person3, 300) ;
		m.put(person4, 400) ;
		m.put(person5, 500) ;
		m.put(person6, 600) ;
		
		
	}

}
