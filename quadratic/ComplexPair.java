public class ComplexPair
{

	private Complex[] pair = new Complex[2];
	
	public ComplexPair(double solution)
	{
	
		this(solution, 0.0, solution, 0.0);
		
	}
	
	public ComplexPair(double real1, double imaginary1, double real2, double imaginary2)
	{
	
		this.pair[0] = new Complex(real1, imaginary1);
		this.pair[1] = new Complex(real2, imaginary2);
	
	}
	
	public boolean bothIdentical()
	{
	
		return this.pair[0].toString().equals(this.pair[1].toString());
		
	}
	
	public Complex[] getPair()
	{
	
		return this.pair;
		
	}
	
	//@Override
	public String toString()
	{
		
		StringBuilder solution = new StringBuilder();
		
		solution.append(String.format("first: %s; ", this.pair[0]));
		solution.append(String.format("second: %s", this.pair[1]));
		
		return solution.toString();
		
	}

}