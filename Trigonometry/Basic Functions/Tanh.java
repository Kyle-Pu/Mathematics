
public class Tanh extends Calculation {
   public Tanh() {
	   super();
   }
   protected double getValue() {
       return Math.tanh(convertToRadians());
   }
   protected void printValue() {
	   System.out.println( "tanh of " + angle + " is " + getValue() );
   }
}
