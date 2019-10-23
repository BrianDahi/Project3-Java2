import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{
	HashMap<String, Integer> mapSorted = new HashMap<>();
	Map<String, Integer> tempMap = new HashMap<>();
	public MesoLexicographical(HashMap<String, Integer> asciiVal) {
		mapSorted = asciiVal;
		sortedMap(asciiVal);
		
	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		
		tempMap = new TreeMap<>(tempMap);
		for(String printOne : unsorted.keySet()) {
			String keyOne = printOne;
			Integer valueOne = unsorted.get(printOne);
			tempMap.put(keyOne, valueOne);
			
		}
		
		for(String printOne : tempMap.keySet()) {
			String keyTwo = printOne;
			Integer valueTwo = tempMap.get(printOne);
			
			System.out.println(keyTwo);
		}
		return tempMap;
	}
	
		
	


}