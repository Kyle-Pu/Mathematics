import java.util.*;
import java.lang.Math;

//Creating a custom exception for when the choice is given out of range
class InputOutOfBoundsException extends Exception{
    public InputOutOfBoundsException(int n){//n is the choice given by user
        super(Integer.toString(n));
    }
}

public class CoterminalAngles
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("What are the units of angles? ");
		System.out.println("1. Degrees\n2. Radians");
		int choice;
		double angle1, angle2;
		try{
		    choice = scan.nextInt();
		    System.out.println();
		    if(choice<1 || choice>2){
		        throw new InputOutOfBoundsException(choice);//throwing custom exception if choice is out of given range
		    }
		    switch(choice){
		        case 1:
		            System.out.print("Enter first angle: ");
        		    angle1 = scan.nextDouble();
        		    System.out.print("Enter second angle: ");
        		    angle2 = scan.nextDouble();
		            if((angle1 - angle2)%360 == 0){//checking if the difference between given angles is divsible by 360 deg
		                System.out.println("Angles are coterminal");
		            }
		            else{
		                System.out.println("Angles are not coterminal");
		            }
		            break;
		        case 2:
		            System.out.println("Enter angles with precision upto at least 2 decimal places");//since pi is an irrational and non-terminating decimal number
		            System.out.print("Enter first angle: ");
        		    angle1 = scan.nextDouble();
        		    System.out.print("Enter second angle: ");
        		    angle2 = scan.nextDouble();
		            if((Math.round(Math.toDegrees(angle1) - Math.toDegrees(angle2)))%360 == 0){
		                //converting radians to degrees and checking if the rounded off difference is divisible by 360 deg
		                
		                System.out.println("Angles are coterminal");
		            }
		            else{
		                System.out.println("Angles are not coterminal");
		            }
		            break;
		    }
		}catch(InputMismatchException ex){//catching the exception thrown when given angle value is not a number
		    System.out.println("Please provide only numbers (not text). Please restart the program and try again!");
		}
		catch(InputOutOfBoundsException ex){//catching the custom exception
		    System.out.println(ex.getMessage()+" is not in range. Please restart the program and enter a choice within range.");
		}
    
	}
}
