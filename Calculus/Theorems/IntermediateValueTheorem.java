package Calculus.Theorems;

import java.util.Scanner;

public class IntermediateValueTheorem {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to the Intermediate Value Theorem Calculator!");

	    System.out.println("Is the function continuous? Yes or no?");
	    String isContinuous = sc.nextLine();
	    
	    intermediatedValueCalculator(isContinuous);
	}

	private static void intermediatedValueCalculator(String isContinuous) {
		boolean continuous = isContinuous.equalsIgnoreCase("yes");
		if(!continuous){
			System.out.println("Since your function is not continuous, Intermediate Value Theorem does NOT apply...");
		    System.exit(1);
	    }
	
		System.out.println("What is the minimum value of your function?");
		double min = sc.nextDouble();
		
		System.out.println("What is the maximum value of your function?");
		double max = sc.nextDouble();
		
		System.out.println("Enter in a number to be tested with IVT (check whether or not the function could pass through this value based on Intermediate Value Theorem...");
		double value = sc.nextDouble();
		
		System.out.println("Calculating...");
			
		if(isIntermediateValue(min, max, value)){
			System.out.println("Yes! The function DOES pass through the given value based on the Intermediate Value Therorem!");
		}else{
			System.out.println("Sorry. The function may NOT pass through the value based on the Intermediate Value Theorem...");
		}
	}

	private static boolean isIntermediateValue(double min, double max, double value) {
		return (min < value) && (max > value);
	}
}
// Comment remove, Extract variable, Extract Method