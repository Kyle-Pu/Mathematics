import static java.lang.Math.sqrt;
import java.util.InputMismatchException;
import java.util.Scanner;

public class fibonacci {
    
    public static boolean isFibo(int n){
        double root1=sqrt(5*n*n-4);
        double root2=sqrt(5*n*n+4);
        if(root1%1==0 || root2%1==0)return true;  
        return false;
    }
    
    public static void main(String[] args) {
    
   try{
        Scanner scan = new Scanner (System.in);
        //Prompt user for a number 
        System.out.println("Give a positive integer number: ");
        int num=scan.nextInt(); 
        if(num<0)throw new InputMismatchException();
        if(isFibo(num))System.out.println(num+" is a Fibonacci number!");
        else System.out.println(num+" is not a Fibonacci number!");
        
     }
    catch (InputMismatchException ex){
      System.err.println("Please provide only positive integer numbers (no text or negative numbers). Restart the program and try again!");
      main(new String[0]);
    }
}

}
