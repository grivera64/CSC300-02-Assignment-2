public class Quadratic
{

	private int a, b, c, discriminant;
	private ComplexPair pair;

	public Quadratic(int a, int b, int c)
	{
	
		this.setA(a);
		this.setB(b);
		this.setC(c);
		this.setDiscriminant();
	
	}
	
	/* Mutators and Accessors */
	public void setA(int a)
	{
	
		this.a = a;
		
	}
	
	public void setB(int b)
	{
	
		this.b = b;
		
	}
	
	public void setC(int c)
	{
	
		this.c = c;
		
	}
	
	public void setDiscriminant()
	{
	
		if (a != 0) 
		{
			
			this.discriminant = (int) Math.pow(this.getB(), 2) - (4 * this.getA() * this.getC());
			
		}
		else
		{
		
			this.discriminant = 0;
			
		}
		
	}
	
	public int getA()
	{
	
		return this.a;
		
	}
	
	public int getB()
	{
	
		return this.b;
		
	}
	
	public int getC()
	{
	
		return this.c;
		
	}
	
	public int getDiscriminant()
	{
	
		return this.discriminant;
		
	}
	
	public ComplexPair solveQuadratic()
	{
	
		if (this.a == 0)
		{
		
			/* bx + c = 0 => x = -c / b */
			
			this.pair = new ComplexPair((-1.0 * this.c) / this.b);
			return this.pair;
			
		}
		
		/* ax^2 + bc + c => x = [-b +/- sqrt(b^2 - 4ac)] / 2a */
		
		double real1 = 0;
		double real2 = 0; 
		double imaginary1 = 0;
		double imaginary2 = 0;
		
		if (this.getDiscriminant() >= 0)
		{
		
			real1 = (-this.getB() + Math.sqrt(this.getDiscriminant())) / (2 * this.getA());
			real2 = (-this.getB() - Math.sqrt(this.getDiscriminant())) / (2 * this.getA());
			
		}
		else if (this.getDiscriminant() < 0)
		{
		
			real1 = -1.0 * this.getB() / (2 * this.getA());
			real2 = real1;
			
			imaginary1 = Math.sqrt(Math.abs(this.getDiscriminant())) / (2 * this.getA());
			imaginary2 = -1.0 * imaginary1;
			
		}
		
		this.pair = new ComplexPair(real1, imaginary1, real2, imaginary2);
		return this.pair;
		
	}
	
	public String getComment()
	{
	
		if (this.a == 0)
		{
		
			return "Linear equation: one real root";
			
		}
		
		StringBuilder comment = new StringBuilder();
		
		if (this.pair.bothIdentical())
		{
		
			comment.append("Double ");
			
		}
		else
		{
		
			comment.append("Two distinct ");
			
		}
		
		if (!this.pair.getPair()[0].isReal())
		{
		
			comment.append("complex ");
			
		}
		else
		{
		
			comment.append("real ");
			
		}
		
		comment.append("root");
		
		if (!this.pair.bothIdentical())
		{
		
			comment.append("s");
			
		}
		
		return comment.toString();
		
	}
	
	//@Override
	public String toString()
	{
		
		StringBuilder equation = new StringBuilder();
		
		if (this.getA() != 0) equation.append(String.format("%dx^2 + ", this.getA()));
		if (this.getB() != 0) equation.append(String.format("%dx + ", this.getB()));
		if (this.getC() != 0) equation.append(String.format("%d + ", this.getC()));		
		
		return equation.substring(0, equation.length() - 3).replace("+ -", "- ").replace("1", "");
		
	}

}