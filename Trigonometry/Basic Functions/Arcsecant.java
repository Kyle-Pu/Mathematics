
public class Arcsecant extends Calculation {
   public Arcsecant() {
		super();
   }
   protected double getValue() {
	    return Math.acos(1/convertToDouble());
   }
   protected void printValue() {
	    System.out.println( "arcsecant of " + angle + " is " + getValue() + " radians" );
   }
}
