
public class Atan extends Calculation {
   public Atan() {
	   super();
   }
   protected double getValue() {
	   return Math.atan(convertToDouble());
   }
   protected void printValue() {
	   System.out.println("Arctangent of " + angle + " is " + getValue() + " radians");
   }
}
