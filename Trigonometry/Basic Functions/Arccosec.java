
public class Arccosec extends Calculation {
   public Arccosec() {
		super();
   }
   protected double getValue() {
	    return Math.asin(1/convertToDouble());
   }
   protected void printValue() {
	    System.out.println( "arccosec of " + angle + " is " + getValue() + " radians" );
   }
}
