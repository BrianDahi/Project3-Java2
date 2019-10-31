import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class MesoEquivalent {
	String stId;
	HashMap<String, Integer> equalValues = new HashMap<>();
	ArrayList<String> fileList = new ArrayList<String>();
	int avg;

	public MesoEquivalent() {

	}

	public MesoEquivalent(String str) throws IOException {
		equalValues = new HashMap<>();
		fileList = read();
		stId = str;
		
		avg = new MesoAsciiCal(new MesoStation(str)).calAverage();
	}

	public HashMap<String, Integer> calAsciiEqual() {
		//Find the avgAscii values that match the given and store in hashMap
		
		for(int i = 0; i <  fileList.size(); ++i ) {
			//This stores the mesonet stations to be passed to method for avg
			String temp = fileList.get(i);
			int temp_1 = new MesoAsciiCal(new MesoStation(temp)).calAverage();

			if(temp_1 == avg) {
				equalValues.put(temp,avg);

			}
		}
		return equalValues;
	}



	//	
	public ArrayList<String >read() throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Mesonet.txt");
		fileList = new ArrayList<String>();
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);
		String parse = "";
		String parse2 = "";

		info = br.readLine();
		info = br.readLine();
		info = br.readLine();

		while(info != null ) {

			parse = info.trim();
			parse2 = (String) parse.subSequence(0,4);

			fileList.add(parse2);
			
			info = br.readLine();
		}
		br.close();
		return fileList;

	}



}


