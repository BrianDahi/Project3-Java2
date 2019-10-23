
public class MesoAsciiCal extends MesoAsciiAbstract 
{

	String str ;
	public MesoAsciiCal() {
		
	}
	public MesoAsciiCal(MesoStation mesoStation) {
		str = mesoStation.getStID();
	}
	
	int calAverage() {
		char a = str.charAt(0);
		char b = str.charAt(1);
		char c = str.charAt(2);
		char d = str.charAt(3);
		
		
		double num = (a + b + c + d)/4.0;
	
		double avg = Math.round(num);
		
		
		int avgInt = (int)avg;
		return avgInt;
	}
	
	
   
}

 