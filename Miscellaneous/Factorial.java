/**
 * Factorial of a positive integer n, denoted by n!, is the product of all 
 * positive integers less than or equal to n.
 * The value of 0! is 1.
 */
import java.util.InputMismatchException;
import java.util.Scanner;


public class Factorial {

public static long facto(long num){
    if(num<2)return 1;
    return num*facto(num-1);
}
    
    
public static void main(String[] args){
    try{
        Scanner scan = new Scanner (System.in);
    
    //Prompt user for a number to calculte its factorial number
    System.out.println("Insert a positive integer number: ");
    int num = scan.nextInt();
    if(num<0)throw(new InputMismatchException());
    long F=facto(num);
        System.out.println("Factorial number of "+num+" is " +F);
    }
    catch (InputMismatchException ex){
      System.err.println("Please provide a positive integer number (no text, real or negative number). Restart the program and try again!");
      main(new String[0]);
    }
}
}
