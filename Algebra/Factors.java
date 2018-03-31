import java.util.*;

class Factors {
  public static void main(String[] args) {
    
    System.out.println("Welcome to the factors calculator!");
    
    try{
    Scanner scan = new Scanner (System.in);
    
    //Prompt user for integer to find factors of and store the data
    System.out.println("Please input a number to factor...");
    int numToFactor = scan.nextInt();
  
  
    System.out.println("Factors of " + numToFactor + " are: ");

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
}
