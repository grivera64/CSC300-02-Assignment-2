public class Trapezoid extends Quadrilateral
{

    private double height;
    
    public Trapezoid(
                        double x1, double y1,
                        double x2, double y2,
                        double x3, double y3,
                        double x4, double y4
                    )
    {
    
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    
    }
    
    public double getHeight()
    {
    
        double height = 0;
        
        if (getPoint1().getY() == getPoint2().getY())
        {
        
            this.height = Math.abs(getPoint1().getY() - getPoint3().getY());
        
        }
        else
        {
        
            this.height = Math.abs(getPoint1().getY() - getPoint2().getY());
        
        }
    
        return this.height;
    
    }
    
    /* Area of Trapezoid = 0.5 * (b1 + b2) * h */
    public double getArea()
    {
    
        return 0.5 * this.getSumOfTwoSides() * this.getHeight();
    
    }
    
    public double getSumOfTwoSides()
    {
    
        if (getPoint1().getY() == getPoint2().getY())
        {
            return Math.abs(getPoint1().getX() - getPoint2().getX()) + 
                Math.abs(getPoint3().getX() - getPoint4().getX());
        }
        else if (this.getPoint1().getY() == this.getPoint3().getY())
        {
             return Math.abs(getPoint2().getX() - getPoint3().getX()) +
                Math.abs(getPoint4().getX() - getPoint1().getX());
        }

    
    }
    
    //@Override
    public String toString()
    {
    
        StringBuilder toStringMsg = new StringBuilder();
        
        toStringMsg.append("Coordinates of trapezoid are ");
        toStringMsg.append(this.returnCoordsAsString());
        toStringMsg.append("\nHeight is: ");
        toStringMsg.append(String.format("%.2f", this.getHeight()));
        toStringMsg.append(": Area is ");
        toStringMsg.append(String.format("%.2f", this.getArea()));
        toStringMsg.append("\n");
        
        return toStringMsg.toString();
    
    }

}