import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateTimeTwo {

	Calendar ca = Calendar.getInstance(); 
     Map<LocalDate, Integer> readDate = new HashMap<>();
     
     public void read(String filename) throws IOException{
 		// creating object for FileReader and taking in .txt
 		
 		FileReader file = new FileReader("Dates.txt");
 		//info stores lines from .txt
 		String info;
 		BufferedReader br = new BufferedReader(file);
 		String parse = "";
 		String afterParse = "";
 		info = br.readLine();
 		int i = 0;
 		while(info != null ) {
 			parse =  (String) info.subSequence(0,10);
 			
 			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
 			LocalDate hashKey = LocalDate.parse(parse, formatter);
 			DateTimeFormatter formatterYearFirst = DateTimeFormatter.ofPattern("yyyy.MM.dd");
 			hashKey.format(formatterYearFirst);
 			readDate.put(hashKey, i);
 			System.out.println(hashKey);
 			System.out.println(readDate);
 			i++;
 			
 			info = br.readLine();
 		}
 		br.close();
 		
     }

	 //Read the text file: Dates.txt
	public void daysOfCurrentMonth() {
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
		
		for(LocalDate printOne : readDate.keySet()) {
			String keyOne = printOne.toString();
			Integer valueOne = readDate.get(printOne);
			System.out.println();
		}
	}
	public void dateHashMapSorted() {
		
	}
	
	}
