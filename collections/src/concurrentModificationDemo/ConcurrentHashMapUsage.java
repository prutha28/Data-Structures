package concurrentModificationDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUsage {

		public static void main( String[] args){

			Map<String, String> phones = new ConcurrentHashMap<String, String>() ;
			phones.put("Apple", "iPhone");
			phones.put("HTC", "HTC one");
			phones.put("Samsung","S5");


			Iterator<String> itr = phones.keySet().iterator() ;
			String key  = "" ;

			while( itr.hasNext()){
				key = itr.next() ;
				System.out.println(phones.get(key));
				// I try to modify the structure of the map
				// by adding a new element to the map by a way other than the iterator's own remove method
				// it should throw a concurrentModificationException because a hashset has a fail-fast itr

				phones.put("Sony", "Xperia Z");	
			}

		}	
	
}
