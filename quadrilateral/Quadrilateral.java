public class Quadrilateral
{

       private Point point1, point2, point3, point4;
       
       public Quadrilateral(
                                   double x1, double y1,
                                   double x2, double y2,
                                   double x3, double y3, double x4, double y4
                            )
       {
       
              this.point1 = new Point(x1, y1);
              this.point2 = new Point(x2, x2);
              this.point3 = new Point(x3, x3);
              this.point4 = new Point(x4, x4);
              
       }
       
       public Point getPoint1()
       {
       
              return this.point1;
       
       }
       
       public Point getPoint2()
       {
       
              return this.point2;
       
       }
       
       public Point getPoint3()
       {
       
              return this.point3;
       
       }
       
       public Point getPoint4()
       {
       
              return this.point4;
       
       }
       
       public String returnCoordsAsString()
       {
       
              return String.format(
                                          "%s, %s, %s, %s", 
                                          this.getPoint1();,
                                          this.getPoint2();
                                          this.getPoint3();
                                          this.getPoint4();
                                   );
       
       }
       
       //@Override
       public String toString()
       {
       
              return String.format("Coordinates of quadrilateral are %s ", this.returnCoordsAsString();
       
       }

}