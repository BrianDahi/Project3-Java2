
public class MesoAsciiCal extends MesoAsciiAbstract 
{

	String str ;
	private String newStid = "NRMN";
	public MesoAsciiCal() {

	}
	public MesoAsciiCal(MesoStation mesoStation) {
		str = mesoStation.getStID();
		calAverage();

	}

	int calAverage() {

		char[] charArray = new char[4]; // char array for given stid
		charArray = str.toCharArray(); // convert it to char array
		char[] charArray2 = new char[4];// for NRMN
		charArray2 = newStid.toCharArray(); // convert to stid
		int aInt = 0; // the ascii of given stid
		int bInt = 0;// the ascii of NRMN
		int realAvg = 0;

		for(int i = 0; i< charArray.length ; ++i) {
			aInt += charArray[i]; // compute ascii sum of given stid
			bInt += charArray2[i]; // compute ascii sum for NMRN
		}

		//This takes the avg of the sum of the String and passes to get the rounded
		//verison
		double stidGiven = (aInt)/4.0; // get the averge of given stid
		double temp_AvgFloor = Math.floor(stidGiven);
		if(stidGiven - temp_AvgFloor >= .25)
		{
			realAvg = (int) Math.ceil(stidGiven);

		}else {
			realAvg = (int) Math.floor(stidGiven);
		}


		int avgOfBoth =  (realAvg + 79)/2; 



		return  avgOfBoth;
	}




}

