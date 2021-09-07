import java.util.Random;

public class Satellite
{

	/* Private Class Fields */
	private String satelliteName;
	private int satelliteOrbitHeight;
	private Random randy = new Random();
	
	/* Constructors */
	public Satellite()
	{
	
		this("unknown");
		
	}
	
	public Satellite(String satelliteName)
	{
	
		this.setSatelliteName(satelliteName);
		this.setSatelliteOrbitHeight(100 + this.randy.nextInt(101));
		
	}
	
	/* Accessors and Mutators */
	public void setSatelliteName(String satelliteName)
	{

		this.satelliteName = satelliteName;
		
	}
	
	public String getSatelliteName()
	{
	
		return this.satelliteName;
		
	}
	
	public void setSatelliteOrbitHeight(int satelliteOrbitHeight)
	{
	
		this.satelliteOrbitHeight = satelliteOrbitHeight;
		
	}
	
	public int getSatelliteOrbitHeight()
	{
	
		return this.satelliteOrbitHeight;
		
	}
	
	/* Returns the Satellite name and Orbital height */
	//@Override
	public String toString()
	{
	
		return String
				.format("The satellite named %s has an orbital height of %d miles.", 
					this.getSatelliteName(), this.getSatelliteOrbitHeight());
		
	}
	
	/* Compares two Satellites to each other */
	//@Override
	public boolean equals(Object o)
	{
	
		if (!(o instanceof Satellite) || o == null) return false;
		
		Satellite otherSatellite = (Satellite) o;
		
		return this.getSatelliteName().equals(otherSatellite.getSatelliteName()) &&
			this.getSatelliteOrbitHeight() == otherSatellite.getSatelliteOrbitHeight();
		
	}
	
}