public class Point
{

    private double xCoordinate, yCoordinate;
    
    public Point(double xCoordinate, double yCoordinate)
    {
    
        this.setXCoordinate(xCoordinate);
        this.setYCoordinate(yCoordinate);
    
    }
    
    public void setXCoordinate(double xCoordinate)
    {
    
        this.xCoordinate = xCoordinate;
    
    }
    
    public void setYCoordinate(double yCoordinate)
    {
    
        this.yCoordinate = yCoordinate;
    
    }
    
    public double getXCoordinate()
    {
    
        return this.xCoordinate();
    
    }
    
    public double getYCoordinate()
    {
    
        return this.yCoordinate;
    
    }
    
    //@Override
    public String toString()
    {
    
        return String.format(
                                "(%f,%f)",
                                this.getXCoordinate(),  
                                this.getYCoordinate()
                            );
    
    }

}