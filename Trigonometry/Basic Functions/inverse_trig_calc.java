import java.util.Scanner;

public class inverse_trig_calc {

	public static void main(String[] args) {

		printWelcome();
        doCalculate(getChoice());
        
	}
	
	private static void doCalculate(int userChoice) {
		
		switch(userChoice){
		
			case 1: cotangent(); break;
			case 2: secant(); break;
			case 3: cosecant(); break;
			case 4: coth(); break;
			case 5: sech(); break;
			case 6: cosech(); break;
			case 7: arccot(); break;
			case 8: arcsecant(); break;
			case 9: arccosec(); break;
			
			default: printInvalidChoice();
		}
	}

	private static void printInvalidChoice() {
		System.out.println("Invalid Choice.\n Exiting");
	}

	private static void printWelcome() {
		System.out.println("Welcome to the trigonometry calculator!");
		System.out.println("\nThis is the inverese trigonometry calculator");
	}

	private static int getChoice() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What inverse trigonometry function do you want to use? :"
				+ "\n 1 Cotangent"
				+ "\n 2 Secant"
				+ "\n 3 Cosec"
				+ "\n 4 Coth"
				+ "\n 5 Sech"
				+ "\n 6 Cosech"
				+ "\n 7 Arccot"
				+ "\n 8 Arcsecant"
				+ "\n 9 Arccosec\n");

		int userChoice = scan.nextInt();
		scan.close();
		return userChoice;
	}
	
	public static double cotangent(){
		String angle = getAngle();
		System.out.println( "Cotangent of " + angle + " is " + getCotangentValue(angle) );
		return getCotangentValue(angle);
	}

	private static double getCotangentValue(String angle) {
		return 1/(Math.tan(convertToRadians(angle)));
	}

    private static double convertToRadians(String angle) {
        return Math.toRadians(convertToDouble(angle));
    }

	private static double convertToDouble(String angle) {
        return Double.parseDouble(angle);
	}

    private static String getAngle() {
        System.out.print("Enter an angle in degrees: ");
        Scanner scan = new Scanner(System.in);
        String angle = scan.nextLine();
        scan.close();
        return angle;
    }

    public static double secant(){

        String angle = getAngle();
        System.out.println("secant of " + angle + " is " + getSecantValue(angle));
        return getSecantValue(angle);
    }

    private static double getSecantValue(String angle) {
        return 1/(Math.cos(convertToRadians(angle)));
    }

    public static double cosecant(){
       
    	String angle = getAngle();
        System.out.println("cosecant of " + angle + " is " + getCosecantValue(angle));
        return getCosecantValue(angle);
    }

    private static double getCosecantValue(String angle) {
        return 1/(Math.sin(convertToRadians(angle)));
    }

    public static double coth(){
       
        String angle = getAngle();
        System.out.println("coth of " + angle + " is " + getCothValue(angle));
        return getCothValue(angle);
    }

    private static double getCothValue(String angle) {
        return 1/(Math.tanh(convertToDouble(angle)));
    }

    public static double sech(){

        String angle = getAngle();
        System.out.println("sech of " + angle + " is " + getSechValue(angle));
        return getSechValue(angle);
    }

    private static double getSechValue(String angle) {
        return 1/(Math.cosh(convertToDouble(angle)));
    }


    public static double cosech(){

        String angle = getAngle();
        System.out.println("cosech of " + angle + " is " + getCosechValue(angle));
        return getCosechValue(angle);
    }

    private static double getCosechValue(String angle) {
	    return 1/(Math.sinh(convertToDouble(angle)));
    }

    public static double arccot(){

    	String angle = getAngle();
    	System.out.println("arccot of " + angle + " is " + getArccotValue(angle) + " radians");
    	return getArccotValue(angle);
    }
    
    private static double getArccotValue(String angle) {
    	return 1.570795 - (Math.atan(convertToDouble(angle)));
    }

    public static double arcsecant(){
    	String angle = getAngle();
        System.out.println("Arcsecant of " + angle + " is " + getArcsecantValue(angle) + " radians");
        return getArcsecantValue(angle);
    }

    private static double getArcsecantValue(String angle) {
    	return Math.acos(1/convertToDouble(angle));
    }

    public static double arccosec(){

    	String angle = getAngle();
        System.out.println("Arccosec of " + angle + " is " + getArccosecValue(angle) + " radians");
        return getArccosecValue(angle);
    }

    private static double getArccosecValue(String angle) {
	   return Math.asin(1/convertToDouble(angle));
   }
}