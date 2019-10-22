import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTwo {

	 Calendar ca = Calendar.getInstance(); 
     

	
	
	
	
	//Read the text file: Dates.txt
	void daysOfCurrentMonth() {
		String tenthDay;
		String eighteenthDay;
		YearMonth ym = YearMonth.of(2019, 10);
		tenthDay = ym.atDay(10).getDayOfWeek().toString();
		eighteenthDay = ym.atDay(18).getDayOfWeek().toString();
		// "The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthtDay
		System.out.println("The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthDay);
	}
	
	public void daysOfAnyMonth(int month, int year) {
		 YearMonth yearM = YearMonth.of(year, month);
	
		String fifteenthDay = yearM.atDay(15).getDayOfWeek().toString();
		String lastDay2 = yearM.atEndOfMonth().getDayOfWeek().name();
		String formatted = String.format("For the year (%d) and month (%d),"
				+ " the fifteenth day is %s and the last day is %s", year, month, fifteenthDay, lastDay2);
		System.out.println(formatted);
	}
	public void compareYear()
	{
		
	}
	public void dateHashMap()
	{
		
	}
	public void dateHashMapSorted() {
		
	}
}
