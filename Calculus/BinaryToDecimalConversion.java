package Calculus;

import java.util.*;

 class BinaryToDecimalConversion {
    public static int binaryToDecimalConversion(int binary){
        int decimal=0,digit=1;
        while(binary>0){
            decimal+=digit*(binary%10);
            binary/=10;
            digit*=2;
        }
        
        return decimal;
    }
    
    public static void main(String[] args) {
 
    try{
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Please input a binary number to convert...");
    int numToConvert = scan.nextInt();
    int convertedNum=binaryToDecimalConversion(numToConvert);
    System.out.println("Binary number: "+numToConvert + " is equal to decimal number: "+ convertedNum );
  
 
    }catch(InputMismatchException ex){
      System.err.println("Please provide only numbers (no text). Restart the program and try again!");
      main(new String[0]);
    }
    
  }   

}
 