import java.util.Scanner;

public class inverse {
	
	public static void main(String[] args){
		
		System.out.println("Welcome to the inverse trigonometry calculator!");
		Scanner scan = new Scanner(System.in);
		
		//Prompt user for which trigonometry function
		System.out.println("What trigonometry function do you want to use? :"
				+ "\n 1 Cosecant"
				+ "\n 2 Secant"
				+ "\n 3 Cotangent\n");
		
		int userChoice = scan.nextInt();
		
		switch(userChoice){
		
		case 1: cosec(); break;
		case 2: sec();   break;
		case 3: cot();   break;
		
		
		default: System.out.println("Invalid Choice. \n Exiting!");
		}
		
	}

	public static double cosec(){
		
		//Ask for user input
		System.out.print("Enter an angle in degrees: ");
		
		//use scanner to read the console input 
		Scanner scan = new Scanner(System.in);
		
		//Assign the user to String variable
		String s = scan.nextLine();
		
		//close the scanner object
		scan.close();
		
		//convert the string input to double
		double value = Double.parseDouble(s);
		//convert the value to radians
		double valueRadians = Math.toRadians(value);
		
		Math.sin(valueRadians);
		
		//get the cosec of the angle
		double cosecValue = 1.0/Math.sin(valueRadians);
		System.out.println("cosec of " + s + " is: " + cosecValue);
		return cosecValue;
		
	
	}
public static double sec(){
	
	//Ask for user input
			System.out.print("Enter an angle in degrees: ");
			
			//use scanner to read the console input 
			Scanner scan = new Scanner(System.in);
			
			//Assign the user to String variable
			String s = scan.nextLine();
			
			//close the scanner object
			scan.close();
			
			//convert the string input to double
			double value = Double.parseDouble(s);
			//convert the value to radians
			double valueRadians = Math.toRadians(value);
			
			Math.cos(valueRadians);
			
			//get the sec of the angle
			double secValue = 1.0/Math.cos(valueRadians);
			System.out.println("sec of " + s + " is: " + secValue);
			return secValue;
}

public static double cot(){
	
	//Ask for user input
			System.out.print("Enter an angle in degrees: ");
			
			//use scanner to read the console input 
			Scanner scan = new Scanner(System.in);
			
			//Assign the user to String variable
			String s = scan.nextLine();
			
			//close the scanner object
			scan.close();
			
			//convert the string input to double
			double value = Double.parseDouble(s);
			//convert the value to radians
			double valueRadians = Math.toRadians(value);
			
			Math.tan(valueRadians);
			
			//get the cot of the angle
			double cotValue = 1.0/Math.tan(valueRadians);
			System.out.println("cot of " + s + " is: " + cotValue);
			return cotValue;
}
}
