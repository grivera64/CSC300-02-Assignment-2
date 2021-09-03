public class Square extends Parallelogram
{

          public Square(
                              double x1, double y1,
                              double x2, double y2,
                              double x3, double y3,
                              double x4, double y4
                         )
          {
          
               super(x1, y1, x2, y2, x3, y3, x4, y4);
          
          }
          
          //@Override
          public String toString()
          {
          
               StringBuilder toStringMsg = new StringBuilder();
               
               toStringMsg.append("Coordinates of square are ");
               toStringMsg.append(this.returnCoordsAsString());
               toStringMsg.append("\nSide is ");
               toStringMsg.append(this.getWidth());
               toStringMsg.append(" Area is: ");
               toStringMsg.append(this.getArea());
               toStringMsg.append("\n");
               
               return toStringMsg.toString();
          
          }

}