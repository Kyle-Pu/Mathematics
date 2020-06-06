
public class Cosine extends Calculation {
   public Cosine() {
	   super();
   }
   protected double getValue() {
	   return Math.cos(convertToRadians());
   }
   protected void printValue() {
	   System.out.println( "cosine of " + angle + " is " + getValue() );
   }
}
