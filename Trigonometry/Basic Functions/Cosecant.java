
public class Cosecant extends Calculation {
   public Cosecant() {
	   super();
   }
   protected double getValue() {
	   return 1/(Math.sin(convertToRadians()));
   }
   protected void printValue() {
	   System.out.println( "Cosecant of " + angle + " is " + getValue() );
   }
}
