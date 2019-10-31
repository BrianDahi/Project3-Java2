import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{
	Map<String, Integer> mapSorted = new HashMap<>();
	
	public MesoLexicographical(HashMap<String, Integer> asciiVal) {
		
		sortedMap(asciiVal);
		
	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		
		mapSorted = new TreeMap<>(mapSorted);
		for(String printOne : unsorted.keySet()) {
			String keyOne = printOne;
			Integer valueOne = unsorted.get(printOne);
			mapSorted.put(keyOne, valueOne);
			
		}
		
		for(String printOne : mapSorted.keySet()) {
			String keyTwo = printOne;
			
			
			System.out.println(keyTwo);
		}
		return mapSorted;
	}
	
		
	


}