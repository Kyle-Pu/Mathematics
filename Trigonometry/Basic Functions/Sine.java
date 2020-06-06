
public class Sine extends Calculation {
   public Sine() {
		super();
   }
   protected double getValue() {
	    return Math.sin(convertToRadians());
   }
   protected void printValue() {
	    System.out.println( "sine of " + angle + " is " + getValue() );
   }
}
