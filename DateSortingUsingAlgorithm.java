import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.time.LocalDate;
public class DateSortingUsingAlgorithm {


	HashMap<LocalDate, Integer> map = new HashMap<>();
	
	public void dateHashMapSorted() {
		// TODO Auto-generated method stub

	}
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
			parse2 = (String) parse.subSequence(0,4);
			System.out.println(parse);
			//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
			//LocalDate hashKey = LocalDate.parse(parse, formatter);
			//DateTimeFormatter formatterYearFirst = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			//LocalDate hashKey = LocalDate.parse(parse, formatterYearFirst);
			//hashKey.format(formatterYearFirst);
			//map.put(hashKey, i);
			//System.out.println(hashKey);

			++i;


			
			info = br.readLine();
		}
		br.close();

	}
}
