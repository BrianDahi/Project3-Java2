import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MesoEquivalent {
	String stId;
	HashMap<String, Integer> equalValues = new HashMap<>();
	ArrayList<String> fileList = new ArrayList<String>();
	// MesoAsciiCal  calcAvg = new MesoAsciiCal();
	public MesoEquivalent() {
		
	}

	public MesoEquivalent(String str) {
		stId = str;
		try{
			read();
		}
		catch(Exception e) {
			System.out.println("wrong in PosAvg");
		}
		
	}
	
	
	
	public HashMap<String, Integer> calAsciiEqual() {
//Find the avgAscii values that match the given and store in hashMap
		int stIdInt = avgOfMeso();
		for(int i = 0; i <  fileList.size(); ++i ) {
			String temp = fileList.get(i);
			int tempInt = (int) avg(temp);
			//System.out.println(temp);
			//System.out.println(tempInt);
			if(tempInt == stIdInt) {
				equalValues.put(temp,stIdInt);
				
			}
			
				
			
		}
		return equalValues;
	}
	
	public int avgOfMeso() {
		
		int avgInt = 0;
		MesoAsciiCal m = new MesoAsciiCal(new MesoStation(stId));
		avgInt = m.calAverage();		
	
		return avgInt;
	}

public double avg(String str) {
	char a = str.charAt(0);
	char b = str.charAt(1);
	char c = str.charAt(2);
	char d = str.charAt(3);
	double avg2 = (a + b + c + d)/4.0;
		int inTPart = (int) avg2;
		double after = avg2 - inTPart;
		
		if(after >=  .25) {
			return avg2 = Math.ceil(avg2);
		}
		else {
			return avg2 = Math.floor(avg2);
		}
	}
	
	public void read() throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Mesonet.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);
		String parse = "";
		String parse2 = "";
		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		
		while(info != null ) {
			//parse =  (String) info.subSequence(2,6);
			parse = info.trim();
			parse2 = (String) parse.subSequence(0,4);
			fileList.add(parse2);
			
			info = br.readLine();
		}
		br.close();

	}
	
	
	
}
