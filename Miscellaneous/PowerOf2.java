/*
 * This program gets a number and returns if this number is a power of 2 or not.
 * If the number is a power of 2 the program also returns the exponent.
 * This program only works for positive powers of 2.
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerOf2 {
  
    private static final int MINIMUM_NUMBER = 1;
	private static final int NOTPOWER2 = -1;

    public static int isPower2(int number){
        if( lessThanMinimum(number) )
        	return NOTPOWER2;
        
        return getPower(number);
    }
    
    private static int getPower(int number) {
    	int result = 0;
        while( number > MINIMUM_NUMBER ){
            if( isOddNumber(number) )
            	return NOTPOWER2;
            number/=2;
            result++;
         }
        if(number==1)
        	return result;
        else 
        	return NOTPOWER2;
        
    }

	private static boolean lessThanMinimum(int number) {
		return number < MINIMUM_NUMBER;
	}

	private static boolean isOddNumber(int number) {
		return number%2 == 1;
	}
    
    public static void main (String[] args){
        try{
            printResult(getNumber());
        }
        
        catch (InputMismatchException exception){
             printErrorMessage();
             restartProgram();
            
        }
    }

	private static void printResult(int number) {
		if (isPower2(number) == NOTPOWER2){
		    System.out.println(number+" is not power of 2.");
		}
		else
		{
		    System.out.println(number +" is power of 2 and equals to 2^" + isPower2(number)+".");
		   
		}
	}

	private static int getNumber() {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Give an integer number: ");
		int number=scan.nextInt();
		
		checkNumber(number);
		return number;
	}

	private static void checkNumber(int number) {
		if(number<0)
			throw(new InputMismatchException());
	}

	private static void printErrorMessage() {
		System.err.println("Please provide an integer number (no text, negative or real number). Restart the program and try again!");
	}

	private static void restartProgram() {
		main(new String[0]);
	}
    
}
