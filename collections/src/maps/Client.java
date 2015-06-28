package maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Client {

	
	public static void main( String[] args){
		
		// Creating Houses
		
		House stark = new House("Winterfell", "Direwolf") ;
		House targaryan = new House("King's Landing", "Dragon") ;
		House tully = new House("Trident", "Fish") ;
		House lannister =  new House("Casterly Rock", "lion") ;
		House baratheon = new House("Wall", "deer") ;
		
		// Creating people
	
		List<Person> starks = new ArrayList<Person>() ;
		starks.add(new Person("Jon", "Snow")) ;
		starks.add(new Person("Robb", "Stark")) ;
		starks.add(new Person("Arya", "Stark")) ;
		starks.add(new Person("Sansa", "Stark")) ;
		starks.add(new Person("Rickon", "Stark")) ;
		starks.add(new Person("Bran", "Lannister")) ;
		starks.add(new Person("Ned", "Stark")) ;
		starks.add(new Person("Lyanna", "Stark")) ;
		
		List<Person> lannisters = new ArrayList<Person>() ;
		lannisters.add(new Person("Jaime", "Lannister")) ;
		lannisters.add(new Person("Cersie", "Lannister")) ;
		lannisters.add(new Person("Tywin", "Lannister")) ;
		lannisters.add(new Person("Tyrion", "Lannister")) ;
		lannisters.add(new Person("Jeoffry", "Lannister")) ;
		
		List<Person> targaryans = new ArrayList<Person>() ;
		targaryans.add(new Person("Danaerys", "Stormborn")) ;
		
		List<Person> tullys = new ArrayList<Person>() ;
		tullys.add(new Person("Catelyn", "Tully")) ;
		tullys.add(new Person("Edmund", "Tully")) ;
		tullys.add(new Person("Black", "Fish")) ;
		
		List<Person> baratheons = new ArrayList<Person>() ;
		baratheons.add(new Person("Robert", "Baratheon")) ;
		baratheons.add(new Person("Stannis", "Baratheon")) ;
		baratheons.add(new Person("Renly", "Baratheon")) ;
		
		// Mapping house -people
		Map<House, List<Person>> peopleByHouse = new HashMap<House, List<Person>>() ;
		
		peopleByHouse.put(stark, starks) ;
		peopleByHouse.put(baratheon, baratheons) ;
		peopleByHouse.put(lannister, lannisters) ;
		peopleByHouse.put(tully, tullys);
		peopleByHouse.put(targaryan, targaryans) ;
		
		// Printing the people in each house
		
		Set<Entry<House, List<Person>>> peoplebyHouseSet = peopleByHouse.entrySet() ;

		Iterator<Entry<House, List<Person>>> itr = peoplebyHouseSet.iterator() ;
		
//		while( itr.hasNext()){
//			System.out.println(itr.next());
//		}
		
		// Using all the collection views
		Collection<List<Person>> values =    peopleByHouse.values() ;
		Set<House> keys = peopleByHouse.keySet() ;
		Set<Map.Entry<House, List<Person>>> peopleByHouseMappings =	peopleByHouse.entrySet() ;
		
		for (Entry<House, List<Person>> entry : peopleByHouseMappings) {
			
		}
		
		System.out.println("Keys .........................................................");
		for (House house : keys){
			System.out.println( "\n" + house);
		}
		
		System.out.println("\n\nValues .........................................................");
		for (List<Person> value : values){
			System.out.println( "\n" + value);
		}
	}
}
