import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.util.HashMap;

public class DateSortingUsingAlgorithm {


	HashMap<LocalDate, Integer> map = new HashMap<>();
	
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
			
			parse = info.trim();
			parse2 = parse.replaceAll("\\s+", "");
			
			DateTimeFormatter formatterYearFirst = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate hashKey = LocalDate.parse(parse2, formatterYearFirst);
			
			map.put(hashKey, i);
			

			++i;
			info = br.readLine();
		}
		br.close();

	}
	public void changeToArray() throws IOException {
		read();
		int i = 0;
		
		for(LocalDate printOne : map.keySet()) {
			
			LocalDate keyOne = printOne;
		
			arrayMap[i] = keyOne;
			++i;
		}
	

	}
	

	public void dateHashMapSortedDescending() throws IOException {
		changeToArray();
		String[] convertDateToString = new String[arrayMap.length];
		String[] decendArrayMap = new String[arrayMap.length];
		LocalDate[] decendingDate = new LocalDate[arrayMap.length];
		for(int i = 0; i< arrayMap.length;++i) {
			String temp3 = arrayMap[i].toString();
			convertDateToString[i] = temp3;
			
		}

		decendArrayMap = decend(convertDateToString);
		for ( int i = 0; i < decendArrayMap.length;++i) {
			String d = decendArrayMap[i];
			DateTimeFormatter formatterYearFirst = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate dF = LocalDate.parse(d, formatterYearFirst);
			decendingDate[i] = dF;
			
		}
		for(int i = 0; i< decendingDate.length;++i) {
			System.out.println(decendingDate[i]);
		}

	}
	public void dateHashMapSorted() throws IOException {
		changeToArray();
		String[] convertDateToString2 = new String[arrayMap.length];
		String[] ascendArrayMap = new String[arrayMap.length];
		LocalDate[] ascendDate = new LocalDate[arrayMap.length];
		String temp2 = "";
		for(int i = 0; i< arrayMap.length;++i) {

			temp2 = arrayMap[i].toString();
			convertDateToString2[i] = temp2;
			
		}

		ascendArrayMap = ascend(convertDateToString2);
		for ( int i = 0; i < ascendArrayMap.length;++i) {
			String d = ascendArrayMap[i];
			DateTimeFormatter formatterYearFirst = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate dF = LocalDate.parse(d, formatterYearFirst);
			ascendDate[i] = dF;
			
		}
		for(int i = 0; i< ascendDate.length;++i) {
			System.out.println(ascendDate[i]);
		}


	}

	public String[] ascend(String[] arr) {
		String temp;
		
		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				// comparing adjacent strings
				if (arr[i].compareTo(arr[j]) < 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				
				}

			}
		}
		return arr;
	}
	public String[] decend(String[] arr) {
		String temp;
		
		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}

			}
		}
		return arr;
	}
}

