
public class Cotangent extends Calculation {
   public Cotangent() {
	   super();
   }
   protected double getValue() {
	   return 1/(Math.tan(convertToRadians()));
   }
   protected void printValue() {
	   System.out.println( "Cotangent of " + angle + " is " + getValue() );
   }
}
