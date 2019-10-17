import java.time.*; 
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
public class DateTimeOne extends MesoDateTimeOneAbstract{
	
   
/*added the implmented classes. Also added imports Not sure if
 * needed for this project going to make a new project and test how they work.*/
	//I am using the DatTimeFormatter for easy formating
	// and LocalDateTime will get the date and time now.
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   
	   private int seconds = now.getSecond();
	int getValueOfSecond() {
		
		return seconds;
	}
	
	void sleepForFiveSec() throws InterruptedException  {
		TimeUnit.SECONDS.sleep(5);
		
	}
	
	void dateTimeNow() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	void dateTimeOfOtherCity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void dateTimeDifferentZone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void timeZoneHashMap() {
		// TODO Auto-generated method stub
		
	}
}