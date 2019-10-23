import java.time.*; 
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.time.LocalDateTime;


public class DateTimeOne extends MesoDateTimeOneAbstract{

	Map<String,String> timeZoneMap = new HashMap<String,String>();
	LocalDateTime[] localDateTime = new LocalDateTime[5];
	Map<String,String> timeZoneSwap = new HashMap<String,String>();

	/*added the implmented classes. Also added imports Not sure if
	 * needed for this project going to make a new project and test how they work.*/
	//I am using the DatTimeFormatter for easy formating
	// and LocalDateTime will get the date and time now.
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");  
	//this gives local time and date
	LocalDateTime now = LocalDateTime.now();  

	ZonedDateTime CST = ZonedDateTime.now(ZoneId.of("America/Chicago"));
	ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("GMT"));
	ZonedDateTime BST = ZonedDateTime.now(ZoneId.of("Europe/London"));
//This format just returns time
	DateTimeFormatter justTime = DateTimeFormatter.ofPattern("HH:mm");
	 
	String zst = "11/05/2018 19:59";
	String ast = "10/01/2020 19:59";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
    LocalDateTime ZST = LocalDateTime.parse(zst, formatter);
    LocalDateTime AST = LocalDateTime.parse(ast, formatter);   

	private int seconds = now.getSecond();
	int getValueOfSecond() {

		return seconds;
	}
	void sleepForFiveSec() throws InterruptedException  {
		
		TimeUnit.SECONDS.sleep(5);

	}

	void dateTimeNow() {
		// I made this String to format the now 
		// Also so I can handle it better
		
		String dTNow = dtf.format(now);
		System.out.println("The value of Second now: " + seconds);
		System.out.println(dTNow);

	}

	void dateTimeOfOtherCity() {
		// just return city time 
		String gmtTime = justTime.format(GMT);
		String bstTime = justTime.format(BST);
		String cstTime = justTime.format(CST);
		System.out.println("Time on Server: " + cstTime );
		System.out.println("GMT: " + gmtTime);
		System.out.println("BST (90E): " + bstTime);
		System.out.println("CST (90W): " + cstTime);

	}


	void dateTimeDifferentZone() {
		String gmt = dtf.format(GMT);
		String bst = dtf.format(BST);
		String cst = dtf.format(CST);
		String zst = dtf.format(ZST);
		String ast = dtf.format(AST);
		
		timeZoneMap.put("GMT:", gmt);
		timeZoneMap.put("BST:", bst);
		timeZoneMap.put("CST:", cst);
		
//This prints out the unsorted timezones with the key		
		for (String zone : timeZoneMap.keySet()){
			String key = zone;
			String value = timeZoneMap.get(zone);  
			System.out.println(key + " " + value);  
		} 
// I added these two since the instructions made it sound like they didn't
// need to be printed on this go.
		timeZoneMap.put("ZST:", zst);
		timeZoneMap.put("AST:", ast);

	}
		 

		void timeZoneHashMap() {
//This is unsorted first hashmap with the zst and ast zones
			//Here we add the values of the first map and swap them
			// so key will now be value and value will now be key
					for (String swap: timeZoneMap.keySet()){
						String key = swap;
						String value = timeZoneMap.get(swap); 
						timeZoneSwap.put(value, key);
					} 
					
			// Array that will take in the first hashmap the format needs to be "yyy/mm/ddThr:mm"
			// So make a for each loop con take both key and values and concatanate in this cause 
			// key is date value is time. 
					
					int i = 0;
					for (String zone : timeZoneMap.keySet()){
						String key = zone.toString();
						String value = timeZoneMap.get(zone);  //Might need toString()
						
					
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
						DateTimeFormatter formatterYearFirst = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
						
						//String formatDateTime = now.format(formatter);
						LocalDateTime convertedValue = LocalDateTime.parse(value , formatter);
						convertedValue.format(formatterYearFirst);
						
						localDateTime[i] = convertedValue ;
						i++;
					}
			/** Now sort the first hashmap using keys and print. It should be look like: *
			 * Print Style 1:
			AST 10/01/2020 19:59
			BST 10/09/2019 02:48
			CST 10/08/2019 15:48
			GMT 10/08/2019 20:48
			ZST 11/05/2018 19:59*/
			System.out.println("Print Style 1:");
			timeZoneMap = new TreeMap<>(timeZoneMap);
			for(String printOne : timeZoneMap.keySet()) {
				String keyOne = printOne;
				String valueOne = timeZoneMap.get(printOne);
				System.out.println(keyOne + " " + valueOne);
			}
			//System.out.println("\n");
			//hashMapSwap();
			//System.out.println("\n");
			/*
			 * Now sort the second hashmap using it keys and print like:
			 * Print Style 3:
			10/01/2020 19:59
			10/08/2019 15:48
			10/08/2019 20:48
			10/09/2019 02:48
			11/05/2018 19:59
			 * */
			System.out.println("Print style 3:");
			timeZoneSwap = new TreeMap<>(timeZoneSwap);
			for (String printTwo : timeZoneSwap.keySet()){
				String keyTwo = printTwo;
				//String valueTwo = timeZoneSwap.get();  
				System.out.println(keyTwo);  
			} 
			
			/** Sort the array and print it like: *
				Print Style 5: Final sorted Array:
			 * 2020-10-01T19:59
			2019-10-09T02:48
			2019-10-08T20:48
			2019-10-08T15:48
			2018-11-05T19:59 
			 * */
			System.out.println("Print Style 5: Final sorted Array:");
			Arrays.sort(localDateTime,  Collections.reverseOrder());
			   for(int j = 0; j < localDateTime.length ; ++j) {
				   System.out.println(localDateTime[j]);
			   }
		}
	
	
	
}
