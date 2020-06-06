
public class Sech extends Calculation {
   public Sech() {
	   super();
   }
   protected double getValue() {
	   return 1/(Math.cosh(convertToDouble()));
   }
   protected void printValue() {
	   System.out.println( "Sech of " + angle + " is " + getValue() );
   }
}
