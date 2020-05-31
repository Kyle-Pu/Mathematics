package Algebra.Factors;
import java.util.*;

class Factors {
	static int numToFactor;
  public static void main(String[] args) {
    try{
    new Factors().prepare();
    //Algorithm to check for factors (starting from 1 to the inputed number, if 'i' divides into the numToFactor without a remainder, it is a factor of numToFactor)
    for(int i = 1; i <= numToFactor; i++){
      if(numToFactor % i == 0){
        System.out.print(i + " ");
      }
    }
  
    }catch(InputMismatchException ex){
      System.err.println("Please provide only numbers (no text). Restart the program and try again!");
      main(new String[0]);
    }
    
  }
  public void prepare() {
	  System.out.println("Welcome to the factors calculator!");
	  Scanner scan = new Scanner (System.in);
	    
    //Prompt user for integer to find factors of and store the data
    System.out.println("Please input a number to factor...");
    numToFactor = scan.nextInt();
  
  
    System.out.println("Factors of " + numToFactor + " are: ");

  }
}
