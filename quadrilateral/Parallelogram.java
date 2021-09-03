public class Parallelogram extends Trapezoid
{

       public Parallelogram(
                            double x1, double y1,
                            double x2, double y2,
                            double x3, double y3,
                            double x4, double y4
                        )
       {
       
              super(x1, y1, x2, y2, x3, y3, x4, y4);
       
       }
       
       // return width of parallelogram
       public double getWidth()
       {
              if (this.getPoint1().getY() == this.getPoint2().getY())
              {
              
                     return Math.abs(this.getPoint1().getX() - this.getPoint2().getX());
              
              }
              else
              {
                     
                     return Math.abs(this.getPoint2().getX() - this.getPoint3().getX());
              
              }
              
       }

       //@Override
       public String toString()
       {
       
              StringBuilder toStringMsg = new StringBuilder();
              
              toStringMsg.append("Coordinates of parallelogram are ");
              toStringMsg.append(this.returnCoordsAsString());
              toStringMsg.append("\nWidth is ");
              toStringMsg.append(String.format("%.2f",this.getWidth()));
              toStringMsg.append(" Height is ");
              toStringMsg.append(String.format("%.2f",this.getHeight()));
              toStringMsg.append(" Area is: ");
              toStringMsg.append(String.format("%.2f",this.getArea()));
              toStringMsg.append("\n");
              
              return toStringMsg.toString();
       
       }

}