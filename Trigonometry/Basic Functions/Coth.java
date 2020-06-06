
public class Coth extends Calculation {
   public Coth() {
	   super();
   }
   protected double getValue() {
	   return 1/(Math.tanh(convertToDouble()));
   }
   protected void printValue() {
	   System.out.println( "coth of " + angle + " is " + getValue() );
   }
}
