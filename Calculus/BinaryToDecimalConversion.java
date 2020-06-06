package Calculus;

import java.util.*;

 class BinaryToDecimalConversion extends CalculusMain{
    public static int binaryToDecimalConversion(int binary){
        int decimal=0,digit=1;
        while(binary>0){
            decimal+=digit*(binary%10);
            binary/=10;
            digit*=2;
        }
        
        return decimal;
    }


    protected void error() {
		System.err.println("Please provide only numbers (no text). Restart the program and try again!");
		  main(new String[0]);
	}

	protected void calculus() {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please input a binary number to convert...");
		int numToConvert = scan.nextInt();
		int convertedNum=binaryToDecimalConversion(numToConvert);
		System.out.println("Binary number: "+numToConvert + " is equal to decimal number: "+ convertedNum );
	}   

}
 