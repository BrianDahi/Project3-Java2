import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
//import java.time.LocalDate;
public class DateSortingUsingAlgorithm {


	HashMap<LocalDate, Integer> map = new HashMap<>();
	ArrayList<LocalDate> mapList = new ArrayList<LocalDate>();
	LocalDate[] arrayMap = new LocalDate[20];

	public void read() throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("SortingDates.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);
		String parse = "";
		String parse2 = "";
		info = br.readLine();

		int i = 1;
		while(info != null ) {
			//parse =  (String) info.subSequence(2,6);
			parse = info.trim();
			parse2 = parse.replaceAll("\\s+", "");
			//System.out.println(parse2);
			//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
			//LocalDate hashKey = LocalDate.parse(parse, formatter);
			//System.out.println(hashKey);
			DateTimeFormatter formatterYearFirst = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate hashKey = LocalDate.parse(parse2, formatterYearFirst);
			//hashKey.format(formatterYearFirst);
			map.put(hashKey, i);
//			System.out.println(hashKey);
//			System.out.println("Hello from read");

			++i;
			info = br.readLine();
		}
		br.close();

	}
	public void changeToArrayList() throws IOException {
		read();
		int i = 0;
		//int capacity =5;
		for(LocalDate printOne : map.keySet()) {
//			if(i == capacity) {
//				expandArray();
//				capacity++;
//			}
			LocalDate keyOne = printOne;
			Integer valueOne = map.get(printOne);
			arrayMap[i] = keyOne;
			++i;
		}
//		System.out.println("\nTesting array for null");
//		for(int j = 0;j<arrayMap.length;++j) {
//			System.out.println(arrayMap[j]);
//		}
		
	}
	public void expandArray(){

		LocalDate[] temp = new LocalDate[arrayMap.length + 1];
		System.arraycopy(arrayMap, 0, temp, 0, arrayMap.length);
		arrayMap= temp;
	}

	public void dateHashMapSortedDescending() throws IOException {
		changeToArrayList();
		String[] convertDateToString = new String[arrayMap.length];
		String[] decendArrayMap = new String[arrayMap.length];
		
		for(int i = 0; i< arrayMap.length;++i) {
			String temp3 = arrayMap[i].toString();
			convertDateToString[i] = temp3;
			//System.out.println(convertDateToString[i]);
		}
		
		decendArrayMap = decend(convertDateToString);
		for ( int i = 0; i < decendArrayMap.length;++i) {
			System.out.println(decendArrayMap[i]);
		}

	}
	public void dateHashMapSorted() throws IOException {
		changeToArrayList();
		String[] convertDateToString2 = new String[arrayMap.length];
		String[] ascendArrayMap = new String[arrayMap.length];
		String temp2 = "";
		for(int i = 0; i< arrayMap.length;++i) {
			
			temp2 = arrayMap[i].toString();
			convertDateToString2[i] = temp2;
			//System.out.println(convertDateToString2[i]);
		}
		
		ascendArrayMap = ascend(convertDateToString2);
		for ( int i = 0; i < ascendArrayMap.length;++i) {
			System.out.println(ascendArrayMap[i]);
		}


	}

	public String[] ascend(String[] arr) {
		String temp;
		String[] finalArray = new String[arrayMap.length];
		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				// comparing adjacent strings
				if (arr[i].compareTo(arr[j]) < 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					//return arr;
				}

			}
		}
		return arr;
	}
	public String[] decend(String[] arr) {
		String temp;
		String[] finalArray = new String[arrayMap.length];
		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				// comparing adjacent strings
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					//return arr;
				}

			}
		}
		return arr;
	}
}

