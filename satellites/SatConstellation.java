import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class SatConstellation
{

	private String satConstellationName;
	private Country country;
	private List <Satellite> satelliteList = new ArrayList<>();
	
	public SatConstellation() throws IOException
	{
	
		this("unknown", "");
		
	}
	
	public SatConstellation(String satConstellationName, String countryName) throws IOException
	{
	
		this.setSatConstellationName(satConstellationName);
		
		this.country = (countryName == null || countryName.isEmpty()) ? 
						new Country() : new Country(countryName);
		
		this.createSatellites();
		
	}
	
	public void setSatConstellationName(String satConstellationName)
	{
	
		this.satConstellationName = satConstellationName;
		
	}
	
	public String getSatConstellationName()
	{
	
		return this.satConstellationName;
		
	}
	
	public void createSatellites() throws IOException
	{
	
		Scanner keyboard = new Scanner(System.in);
		String fileName;
		
		System.out.printf("Please enter file to read in Satellite List from: ");
		fileName = keyboard.nextLine();
		
		File file = new File(fileName);
		
		if (!file.exists())
		{
		
			System.out.println("File is empty!");
			System.exit(0);
		
		}
		
		Scanner inFile = new Scanner(file);
		
		Satellite tempSatellite;
		
		while (inFile.hasNext())
		{
			
			tempSatellite = new Satellite(inFile.nextLine());
			this.satelliteList.add(tempSatellite);
			
		}
		
	}
	
	public int getNumSatellites()
	{
	
		return this.satelliteList.size();
		
	}
	
	public Satellite getSatellite(int satelliteIndex)
	{
	
		if (satelliteIndex < 0 || satelliteIndex > this.getNumSatellites())
		{
		
			System.out.printf("Satellite doesn't exist\n");
			return null;
			
		}
		
		return this.satelliteList.get(satelliteIndex);
		
	}
	
	//@Override
	public String toString()
	{
	
		StringBuilder response = new StringBuilder();
		response.append(String.format("The name of %s's satellite constellation is %s\n",
								this.country.getCountryName(), this.getSatConstellationName()));
		
		for (Satellite sat : this.satelliteList)
		{
		
			response.append(String.format("%s\n", sat));
			
		}
		
		return response.toString();
		
	}
	
}