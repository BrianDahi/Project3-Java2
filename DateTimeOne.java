import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*; 
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeOne extends MesoDateTimeOneAbstract{
	
   
/*added the implmented classes. Also added imports Not sure if
 * needed for this project going to make a new project and test how they work.*/
	//I am using the DatTimeFormatter for easy formating
	// and LocalDateTime will get the date and time now.
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  
//this gives local time
	LocalDateTime now = LocalDateTime.now();  
	
	ZonedDateTime CST = ZonedDateTime.now();
	
	ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("GMT"));
	ZonedDateTime BST = ZonedDateTime.now(ZoneId.of("Europe/London"));

	DateTimeFormatter justTime = DateTimeFormatter.ofPattern("HH:mm:ss");
	
	
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
//These where my test for GMT, BST, CST delete when project is done		
		/*String gmt = dtf.format(GMT);
		String bst = dtf.format(BST);
		String cst = dtf.format(CST);
		System.out.println("in gmt: " + gmt);
		System.out.println("in bst: " + bst);
		System.out.println("in cst: " + cst);*/
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
	HashMap<String,String> timeZoneMap = new HashMap<String,String>();
	
	void dateTimeDifferentZone() {
		String gmt = dtf.format(GMT);
		String bst = dtf.format(BST);
		String cst = dtf.format(CST);
		timeZoneMap.put("GMT:", gmt);
		timeZoneMap.put("BST:", bst);
		timeZoneMap.put("CST:", cst);
		
		for (String zone: timeZoneMap.keySet()){
            String key = zone.toString();
            String value = timeZoneMap.get(zone).toString();  
            System.out.println(key + " " + value);  
} 
		
	}

	
	void timeZoneHashMap() {
		
		
	}
}