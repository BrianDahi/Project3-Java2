import java.time.*; 
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.time.LocalDateTime;


public class DateTimeOne extends MesoDateTimeOneAbstract{

	HashMap<String,String> timeZoneMap = new HashMap<String,String>();
	LocalDateTime[] localDateTime = new LocalDateTime[5];
	 
	 HashMap<String,String> timeZoneSwap = new HashMap<String,String>();

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

		System.out.println(dTNow);

	}

	void dateTimeOfOtherCity() {
		// just return city time 
		String gmtTime = justTime.format(GMT);
		String bstTime = justTime.format(BST);
		String cstTime = justTime.format(CST);
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
			String value = timeZoneMap.get(zone);  //Might need toString()
			System.out.println(key + " " + value);  
		} 
// I added these two since the instructions made it sound like they didn't
// need to be printed on this go.
		timeZoneMap.put("ZST:", zst);
		timeZoneMap.put("AST:", ast);

	}
		 
//This method is my method for swaping and storeing the array 
	 public void hashMapSwap()  {
//Here we add the values of the first map and swap them
// so key will now be value and value will now be key
		for (String swap: timeZoneMap.keySet()){
			String key = swap.toString();
			String value = timeZoneMap.get(swap).toString(); 
			timeZoneSwap.put(value, key);
			  
		} 
// Array that will take in the first hashmap the format needs to be "yyy/mm/ddThr:mm"
// So make a for each loop con take both key and values and concatanate in this cause 
// key is date value is time. 
		
		int i = 0;
		for (String zone : timeZoneMap.keySet()){
			String key = zone.toString();
			String value = timeZoneMap.get(zone);  //Might need toString()
			//System.out.println("test value: " + value);
		
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
			
			LocalDateTime convertedValue = LocalDateTime.parse(value , formatter);
			
			System.out.println("converted: " + convertedValue);
			//value.toLocalDateTime()
			localDateTime[i] = convertedValue ;
			i++;
		}
		for(int j = 0; j < localDateTime.length;++j) {
			System.out.println("in array: " + localDateTime[j]);
		}
		
		
	 }
		void timeZoneHashMap() {
//This is unsorted first hashmap with the zst and ast zones
			for (String zone : timeZoneMap.keySet()){
				String key = zone;
				String value = timeZoneMap.get(zone);  //Might need toString()
				System.out.println(key + " " + value);  
			} 
			
			   for(LocalDateTime day : localDateTime){ 
				   	
		          
		            
		          }
		}
		
	
	
}
