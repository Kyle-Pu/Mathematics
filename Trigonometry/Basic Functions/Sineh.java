
public class Sineh extends Calculation {
   public Sineh() {
	   super();
   }
   protected double getValue() {
	   return Math.sinh(convertToRadians());
   }
   protected void printValue() {
	   System.out.println( "sinh of " + angle + " is " + getValue() );
   }
}
