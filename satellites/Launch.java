import java.util.Scanner;
import java.io.IOException;

public class Launch
{

	public static final Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException
	{
		
		/* Local Variables */
		SatConstellation constellation;
		String countryName, satConstellationName;
		
		System.out.printf("Please enter the name of the Country: ");
		countryName = keyboard.nextLine();
		
		System.out.printf("Please enter the name of the Satellite Constellation: ");
		satConstellationName = keyboard.nextLine();
		
		constellation = new SatConstellation(satConstellationName, countryName);
		
		System.out.printf("%s\n", constellation);
		
		int numOfSatellites = constellation.getNumSatellites();
		
		Satellite firstSatellite, currSatellite;
		firstSatellite = constellation.getSatellite(0);
		currSatellite = null;
		
		if (numOfSatellites > 1)
		{
		
			boolean hasMatch = false;
			
			for (int currIndex = 1; currIndex < numOfSatellites; currIndex++)
			{

				currSatellite = constellation.getSatellite(currIndex);
				
				if (firstSatellite.equals(currSatellite))
				{
				
					System.out.printf("%s\n", currSatellite);
					hasMatch = true;
					
				}
				
			}
			
			if (!hasMatch)
			{
			
				System.out.printf("There is no satellite that matches the first satellite.\n");
				
				firstSatellite.setSatelliteName(currSatellite.getSatelliteName());
				firstSatellite
					.setSatelliteOrbitHeight(currSatellite.getSatelliteOrbitHeight());
					
				if (firstSatellite.equals(currSatellite))
				{
				
					System.out
						.printf("%s\b and equals the first satellite in the ArrayList.\n",
							currSatellite);
				
				}
				
			}
			
		}
		else
		{
		
			System.out.printf("There are no satellites to compare.\n");
			
		}
		
		keyboard.close();
		
	}
	
}