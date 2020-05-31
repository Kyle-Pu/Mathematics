import static java.lang.Math.sqrt;
import java.util.InputMismatchException;
import java.util.Scanner;

public class fibonacci {
    
    public static boolean isFibonacci(int number){
        boolean isFibo = (getRoot1(number)%1==0) || (getRoot2(number)%1==0);
		return isFibo;
    }

	private static double getRoot2(int number) {
		return sqrt(5*number*number+4);
	}

	private static double getRoot1(int number) {
		return sqrt(5*number*number-4);
	}
    
    public static void main(String[] args) {
    
   try{
        printResult(getNumber());
        
     }
    catch (InputMismatchException exception){
      printErrorMessage();
      restartProgram();
    }
}

	private static int getNumber() {
		Scanner scan = new Scanner (System.in);
        System.out.println("Give a positive integer number: ");
        int number=scan.nextInt(); 
        checkNumber(number);
		return number;
	}

	private static void checkNumber(int number) {
		if(number<0)
        	throw new InputMismatchException();
	}

	private static void printResult(int number) {
		if(isFibonacci(number))
        	System.out.println(number + " is a Fibonacci number!");
        else 
        	System.out.println(number + " is not a Fibonacci number!");
	}

	private static void restartProgram() {
		main(new String[0]);
	}

	private static void printErrorMessage() {
		System.err.println("Please provide only positive integer numbers (no text or negative numbers). Restart the program and try again!");
	}

}
