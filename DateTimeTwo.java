import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DateTimeTwo {

	
	Map<LocalDate, Integer> readDate = new HashMap<>();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
	//this gives local time and date
	LocalDate now = LocalDate.now();

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
	
	
	public void compareYear() throws IOException{
		
	
		read();
		for(LocalDate printOne : readDate.keySet()) {
			LocalDate keyOne = printOne;
			int year = keyOne.getYear();
			
			Period period = Period.between(keyOne, now);
			
		   	
		      
			   if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
					System.out.println(year + " is a leap year, and Difference: " +period.getYears() +
							" years, " + period.getMonths() + " months, " + period.getDays() + " days.");
				else
					System.out.println(year + " is not a leap year, and Difference: " +period.getYears() +
							" years, " + period.getMonths() + " months, " + period.getDays() + " days.");
		
		}
	}
	
	
	
	
	public void dateHashMap() throws IOException
	{
		read();
		for(LocalDate printOne : readDate.keySet()) {
			String keyOne = printOne.toString();
			Integer valueOne = readDate.get(printOne);
			System.out.println(keyOne + ":" + valueOne);
		}
	
	}
	public void dateHashMapSorted() throws IOException {

		readDate = new TreeMap<>(readDate);
		read();
		for(LocalDate printOne : readDate.keySet()) {
			String keyOne = printOne.toString();
			Integer valueOne = readDate.get(printOne);
			System.out.println(keyOne + ":" + valueOne);
		}
	}


	public void read() throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Dates.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);
		String parse = "";
		
		info = br.readLine();
		int i = 1;
		while(info != null ) {
			parse =  (String) info.subSequence(0,10);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
			LocalDate hashKey = LocalDate.parse(parse, formatter);
			DateTimeFormatter formatterYearFirst = DateTimeFormatter.ofPattern("yyyy.MM.dd");
			hashKey.format(formatterYearFirst);
			readDate.put(hashKey, i);
			

			++i;

			info = br.readLine();
		}
		br.close();
		System.out.println("");
		
		


	}
}
