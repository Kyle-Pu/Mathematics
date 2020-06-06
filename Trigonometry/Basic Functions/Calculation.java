import java.util.Scanner;

public abstract class Calculation {
	protected String angle;
	
    private void getAngle() {
        System.out.print("Enter an angle in degrees: ");
        Scanner scan = new Scanner(System.in);
        String angle = scan.nextLine();
        scan.close();
        this.angle = angle;
    }
	
	public Calculation() {
		getAngle();
	}
	public double convertToRadians() {
		return Math.toRadians(convertToDouble());
    }

    public double convertToDouble() {
    	return Double.parseDouble(angle);
    }
	public double calculate(){
		printValue();
	    return getValue();
	}
	protected abstract void printValue();
	protected abstract double getValue();
	


	   
}
