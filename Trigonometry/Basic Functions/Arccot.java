
public class Arccot extends Calculation {
   public Arccot() {
		super();
   }
   protected double getValue() {
	   	return 1.570795 - (Math.atan(convertToDouble()));
   }
   protected void printValue() {
	   System.out.println( "arccot of " + angle + " is " + getValue() + " radians" );
   }
}
