public class Point
{

    private double xCoordinate, yCoordinate;
    
    public Point(double xCoordinate, double yCoordinate)
    {
    
        this.setX(xCoordinate);
        this.setY(yCoordinate);
    
    }
    
    public void setX(double xCoordinate)
    {
    
        this.xCoordinate = xCoordinate;
    
    }
    
    public void setY(double yCoordinate)
    {
    
        this.yCoordinate = yCoordinate;
    
    }
    
    public double getX()
    {
    
        return this.xCoordinate;
    
    }
    
    public double getY()
    {
    
        return this.yCoordinate;
    
    }
    
    //@Override
    public String toString()
    {
    
        return String.format(
                                "(%f,%f)",
                                this.getX(),  
                                this.getY()
                            );
    
    }

}