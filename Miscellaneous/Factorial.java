/**
 * Factorial of a positive integer n, denoted by n!, is the product of all 
 * positive integers less than or equal to n.
 * The value of 0! is 1.
 */
import java.util.InputMismatchException;
import java.util.Scanner;


public class Factorial {

	private static final int MINIMUM_NUMBER = 0;

	public static long getFactorial(long number){
	    if( number < 2 ) 
	    	return 1;
	    long factorial = number * getFactorial( number - 1 );
		return factorial;
	}
	
	public static void main(String[] args){
	    try{
	        int number = getNumber();
		    
		    printResult( number, getFactorial(number) );
	    }
	    catch (InputMismatchException exception){
	      printErrorMessage();
	      restartProgram();
	    }
	}

	private static void checkNumber(int number) {
		if( number < MINIMUM_NUMBER )
			inputError();
	}

	private static void inputError() {
		throw( new InputMismatchException() );
	}

	private static void printResult(int number, long result) {
		System.out.println("Factorial number of "+number+" is " +result);
	}

	private static void restartProgram() {
		main(new String[0]);
	}

	private static void printErrorMessage() {
		System.err.println("Please provide a positive integer number (no text, real or negative number). Restart the program and try again!");
	}
	
	private static int getNumber() {
		Scanner scan = new Scanner (System.in);

		System.out.println("Insert a positive integer number: ");
		int number = scan.nextInt();
        checkNumber(number);
		return number;
	}
}
