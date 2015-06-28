package maps;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClient{

	public static void main(String[] args) {

		Map<String, BigDecimal> maximumAmountForCurrencyMap = new TreeMap<String, BigDecimal>(new CustomComparator()) ;
		maximumAmountForCurrencyMap.put("GBP", new BigDecimal(1000)) ;
		maximumAmountForCurrencyMap.put("JPY", new BigDecimal(2000)) ;
		maximumAmountForCurrencyMap.put("AUD", new BigDecimal(3000)) ;
		maximumAmountForCurrencyMap.put("INR", new BigDecimal(4000)) ;
		maximumAmountForCurrencyMap.put("EUR", new BigDecimal(5000)) ;

		// To Print the Map.
		Set<Map.Entry<String, BigDecimal>> entries = maximumAmountForCurrencyMap.entrySet() ;

		for(Map.Entry<String, BigDecimal> entry : entries){
			System.out.println("Max Amount Allowed for " +
					entry.getKey() + " is 0" +
					entry.getValue());
		}

		BigDecimal amountAllowed = maximumAmountForCurrencyMap.get("AUD") ;
		amountAllowed  = new BigDecimal(4500) ;
		maximumAmountForCurrencyMap.put("AUD", amountAllowed) ;

		System.out.println("\nMax Amount allowed for AUD "  + "is now " 
				+ maximumAmountForCurrencyMap.get("AUD") );

	}

}
