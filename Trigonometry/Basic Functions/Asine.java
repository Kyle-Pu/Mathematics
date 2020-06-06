
public class Asine extends Calculation {
   public Asine() {
	   super();
   }
   protected double getValue() {
	   return Math.asin(convertToDouble());
   }
   protected void printValue() {
	   System.out.println("Arcsine of " + angle + " is " + getValue() + " radians");
   }
}
