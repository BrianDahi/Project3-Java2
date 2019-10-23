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
		//System.out.println(mapSorted);
	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		
		
		for(String printOne : unsorted.keySet()) {
			String keyOne = printOne;
			Integer valueOne = unsorted.get(printOne);
			tempMap.put(keyOne, valueOne);
		}
		tempMap = new TreeMap<>(tempMap);
		
		return tempMap;
	}
//I just wanted to test and make sure it sorted will delete later	
	public void showMyTemp() {
		System.out.println(sortedMap(mapSorted));
		
	}

}