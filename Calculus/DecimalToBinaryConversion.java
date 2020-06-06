package Calculus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DecimalToBinaryConversion extends CalculusMain {
	
    public static ArrayList<Integer> decimalToBinary(int decimal){
        ArrayList<Integer> binary =new ArrayList<>();
        while(decimal>0){
            binary.add(0,decimal%2);
            decimal/=2;            
        }
        return binary;
    }
    
    public static void printBinary(ArrayList<Integer> binary){
        for(int i:binary)
            System.out.print(i);
        System.out.println("");
    }

	@Override
	protected void calculus() {
		Scanner scan = new Scanner (System.in);
	    
	    System.out.println("Please input a decimal number to convert...");
	    int numToConvert = scan.nextInt();
	    ArrayList <Integer> convertedNum = decimalToBinary(numToConvert);
	    System.out.print("Decimal number: "+numToConvert + " is equal to binary number: ");
	    printBinary(convertedNum);
	    scan.close();
	}

	@Override
	protected void error() {
		System.err.println("Please provide only numbers (no text). Restart the program and try again!");
	    main(new String[0]);
	}   
}