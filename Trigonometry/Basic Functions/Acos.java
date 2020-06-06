
public class Acos extends Calculation {
   public Acos() {
	   super();
   }
   protected double getValue() {
	   return Math.acos(convertToDouble());
   }
   protected void printValue() {
	   System.out.println("Arccosine of " + angle + " is " + getValue() + " radians");
   }
}
