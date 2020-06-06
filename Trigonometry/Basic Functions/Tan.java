
public class Tan extends Calculation {
   public Tan() {
	   super();
   }
   protected double getValue() {
	   return Math.tan(convertToRadians());
   }
   protected void printValue() {
	   System.out.println( "tan of " + angle + " is " + getValue() );
   }
}
