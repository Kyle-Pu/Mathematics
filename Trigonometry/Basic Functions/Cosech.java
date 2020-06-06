
public class Cosech extends Calculation {
   public Cosech() {
	   super();
   }
   protected double getValue() {
	   return 1/(Math.sinh(convertToDouble()));
   }
   protected void printValue() {
	   System.out.println( "cosech of " + angle + " is " + getValue() );
   }
}
