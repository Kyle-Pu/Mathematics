
public class Secant extends Calculation {
   public Secant() {
	   super();
   }
   protected double getValue() {
	   return 1/(Math.cos(convertToRadians()));
   }
   protected void printValue() {
	   System.out.println( "Secant of " + angle + " is " + getValue() );
   }
}
