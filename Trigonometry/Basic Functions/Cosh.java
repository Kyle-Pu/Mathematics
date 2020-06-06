
public class Cosh extends Calculation {
   public Cosh() {
	   super();
   }
   protected double getValue() {
	   return Math.cosh(convertToRadians());
   }
   protected void printValue() {
	   System.out.println( "cosinh of " + angle + " is " + getValue() );
   }
}
