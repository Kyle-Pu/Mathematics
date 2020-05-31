package Algebra;
import java.util.Scanner;

public class Inverse {
	static int userChoice;
	static double value;
	static String s;
	public static void main(String[] args){
		new Inverse().prepare();
		double valueRadians = Math.toRadians(value);
		double result = 0;		
		switch(userChoice){
		
		case 1: result = cosec(valueRadians); break;
		case 2: result = sec(valueRadians);   break;
		case 3: result = cot(valueRadians);   break;
		
		default: System.out.println("Invalid Choice. \n Exiting!");
		}
		System.out.println( s + " is: " + result);
	}
	
	public void prepare() {
		System.out.println("Welcome to the inverse trigonometry calculator!");
		Scanner scan = new Scanner(System.in);
		
		//Prompt user for which trigonometry function
		System.out.println("What trigonometry function do you want to use? :"
				+ "\n 1 Cosecant"
				+ "\n 2 Secant"
				+ "\n 3 Cotangent\n");
		userChoice = scan.nextInt();
		//Ask for user input
		System.out.print("Enter an angle in degrees: ");
		//use scanner to read the console input 
		scan = new Scanner(System.in);
		//Assign the user to String variable
		s = scan.nextLine();
		//close the scanner object
		scan.close();
		//convert the string input to double
		value = Double.parseDouble(s);
		//convert the value to radians
	}

	public static double cosec(double valueRadians){
		
		Math.sin(valueRadians);
		
		//get the cosec of the angle
		double cosecValue = 1.0/Math.sin(valueRadians);
		System.out.println("cosec of ");
		return cosecValue;
		
	
	}
	public static double sec(double valueRadians){
				
		Math.cos(valueRadians);
		
		//get the sec of the angle
		double secValue = 1.0/Math.cos(valueRadians);
		System.out.println("sec of ");
		return secValue;
	}

	public static double cot(double valueRadians){
			
		Math.tan(valueRadians);
		
		//get the cot of the angle
		double cotValue = 1.0/Math.tan(valueRadians);
		System.out.println("cot of ");
		return cotValue;
	}
}
