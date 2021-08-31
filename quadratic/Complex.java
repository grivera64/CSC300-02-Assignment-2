public class Complex
{
	
	private double real, imaginary;
	
	public Complex(double real, double imaginary)
	{
	
		this.setReal(real);
		this.setImaginary(imaginary);
		
	}
	
	public void setReal(double real)
	{
	
		this.real = real;
		
	}
	
	public void setImaginary(double imaginary)
	{
	
		this.imaginary = imaginary;
		
	}
	
	public boolean isReal()
	{
	
		return this.imaginary == 0;
		
	}
	
	public String toString()
	{
		
		if (this.imaginary == 0)
		{
			
			return String.format("%.2f", this.real);
			
		}
		
		return String.format("%.2f %s %.2fi",
							this.real,
							this.imaginary > -0.0001 ? "+" : "-",
							Math.abs(this.imaginary));
		
	}
	
}