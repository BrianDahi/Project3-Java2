import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*; 
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.util.Calendar;

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
	
	ZonedDateTime nowInGMT = ZonedDateTime.now(ZoneId.of("GMT"));
	ZonedDateTime BST = ZonedDateTime.now(ZoneId.of("Europe/London"));

	
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
		
		String gmt = dtf.format(nowInGMT);
		String bst = dtf.format(BST);
		String cst = dtf.format(CST);
		System.out.println("in gmt: " + gmt);
		System.out.println("in bst: " + bst);
		System.out.println("in cst: " + cst);
		System.out.println(dTNow);
		
	}

	void dateTimeOfOtherCity() {
		
		
	}

	
	void dateTimeDifferentZone() {
		
		
	}

	@Override
	void timeZoneHashMap() {
		// TODO Auto-generated method stub
		
	}
}