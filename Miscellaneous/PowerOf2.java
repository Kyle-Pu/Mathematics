/*
 * This program gets a number and returns if this number is a power of 2 or not.
 * If the number is a power of 2 the program also returns the exponent.
 * This program only works for positive powers of 2.
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerOf2 {
  
    /**
     * This method checks if a number is power of 2.
     * @param num is the number to be checked.
     * @return the exponent if the number is power of 2 and -1 if not.
     */
    public static int isPower2(int num){
        int c=0;
        if(num==1)return 0;
        if(num<1)return -1;
        while(num>1){
            if(num%2==1)return -1;
            num/=2;
            c++;
         }
        if(num==1)return c;
        else return -1;
    }
    
    public static void main (String[] args){
        try{
            
            Scanner scan =new Scanner(System.in);
            
            //Prompt user for a number
            System.out.println("Give an integer number: ");
            int num=scan.nextInt();
            
            if(num<0)throw(new InputMismatchException());
            
            int power=isPower2(num);
            if (power==-1){
                System.out.println(num+" is not power of 2.");
            }
            else
            {
                System.out.println(num +" is power of 2 and equals to 2^"+power+".");
               
            }
            
        }
        
        catch (InputMismatchException ex){
             System.err.println("Please provide an integer number (no text, negative or real number). Restart the program and try again!");
             main(new String[0]);
            
        }
    }
    
}
