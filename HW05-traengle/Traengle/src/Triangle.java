/**
 * Triangle- calculations of the triangle with given coordinates
 * 
 * @author Klara Makek
 * @version 11.10.2022.
 *          Class 120 - HW05
 */
// starter
public class Triangle {
   // coordinate A
   private double x1;
   private double y1;
   // coordinate B
   private double x2;
   private double y2;
   // coordinate C
   private double x3;
   private double y3;

   public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
      this.x1 = x1;
      this.y1 = y1;

      this.x2 = x2;
      this.y2 = y2;

      this.x3 = x3;
      this.y3 = y3;
   }

   public double lenghtC() {
     return x2 - x1;
   }

   public double getHeight() {
      double height = y3;
      return height;
   }

   public double lenghtA() {
      return Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow(getHeight(), 2));
   }

   public double lenghtB() {
      return Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow(getHeight(), 2));
   }

   public double angleA() {
      return Math.toDegrees(Math.asin(getHeight() / lenghtB()));
   }

   public double angleB() {
      return Math.toDegrees(Math.asin(getHeight() / lenghtA()));
   }

   public double angleC() {
      return 180 - angleA() - angleB();
   }

   public double calcPerimenter() {
      return  lenghtA() + lenghtB() + lenghtC();
   }

   public double calcArea(){
      return lenghtC() * getHeight() / 2;
   }

   public String toString() {
      String txt ="Area: %.2f" +
            "\nPerimetre: %.2f" +
            "\nLength side a: %.2f"+
            "\nLength side b: %.2f"+
            "\nLength side c: %.2f"+
            "\nHeight h: %.2f"+
            "\nAngle A: %.2f"+
            "\nAngle B: %.2f"+
            "\nAngle C: %.2f";
      
            return String.format(txt, calcArea(), calcPerimenter(), lenghtA(), lenghtB(), lenghtC(), getHeight(), angleA(), angleB(), angleC());

   }
}
