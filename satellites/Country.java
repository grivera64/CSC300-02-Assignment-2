import java.util.Random;

public class Country
{

	/* Instance Fields */
	private String countryName;
	private Random randy = new Random();
	
	public Country()
	{
	
		this("unknown");
		
	}
	
	public Country(String countryName)
	{
	
		this.setCountryName(countryName);
		
	}
	
	public void setCountryName(String countryName)
	{
	
		this.countryName = countryName;
		
	}
	
	public String getCountryName()
	{
	
		return this.countryName;
		
	}
	
	//@Override
	public String toString()
	{
	
		return String
				.format("The Country for the Constellation is %s.", this.getCountryName());
		
	}
	
}