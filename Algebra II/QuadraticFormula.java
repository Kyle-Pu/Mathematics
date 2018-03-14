import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {

		System.out.println("Welcome to the Quadratic Formula Calculator!");

		Scanner scan = new Scanner(System.in);

    //Prompt user for coefficients in polynomial and store values
		System.out.print("What is the value of 'a' of your polynomial in the form of ax^2 + bx + c?");
		double a = scan.nextDouble();

		System.out.print("What is the value of 'b' of your polynomial? ");
		double b = scan.nextDouble();

		System.out.print("What is the value of 'c' of your polynomial? ");
		double c = scan.nextDouble();

		System.out.println("Calculating...");

    //Calculate both forms of the quadratic formula (plus or minus in the numerator)
		double answer1 = (double) (((b) + Math.sqrt(b * b - 4*a*c))) / (2 * a);
		double answer2 = (double) (((b) - Math.sqrt(b * b - 4*a*c))) / (2 * a);

    //Print out zeroes calculated from the quadratic formula
		if(!Double.isNan(answer1)){
			System.out.println("Answer 1: " + answer1);	
		}else{
			System.out.println("imaginary answer");
		}
		if(!Double.isNan(answer2)){
			System.out.println("Answer 2: " + answer2);	
		}else{
			System.out.println("imaginary answer");
		}

    //Close the scanner to prevent any leaks
		scan.close();

	}

}
