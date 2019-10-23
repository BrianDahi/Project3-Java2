
public class MesoAsciiCal extends MesoAsciiAbstract 
{

	String str ;
	private String newStid = "NRMN";
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
		
		char e = newStid.charAt(0);
		char f = newStid.charAt(1);
		char g = newStid.charAt(2);
		char h = newStid.charAt(3);
		double stidGiven = (a + b + c + d )/4.0;
		double stidGivenAvg = avg(stidGiven);
		
		double stidPrivate = (e + f + g + h)/4.0;
		double stidPrivateAvg = avg(stidPrivate);
		
		double avgOfBoth = (stidGivenAvg + stidPrivateAvg)/2.0;
		double rounded = Math.ceil(avgOfBoth);
		int roundedInt = (int) rounded;
		
		
		return roundedInt;
	}
	public double avg(double avg2) {
		
		int inTPart = (int) avg2;
		double after = avg2 - inTPart;
		
		if(after >=  .25) {
			return avg2 = Math.ceil(avg2);
		}
		else {
			return avg2 = Math.floor(avg2);
		}
	}
	
   
}

 