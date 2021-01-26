//github.com/binoy-d

import java.util.Scanner;

public class Heron{

	public static void main(String[] args) {

		System.out.println("Welcome to the Heron's Formula Calculator!");

		Scanner scan = new Scanner(System.in);

    //Prompt user for side lengths and store values
		System.out.print("What is the length of side 1? ");
		double a = scan.nextDouble();

		System.out.print("What is the length of side 2? ");
		double b = scan.nextDouble();

		System.out.print("What is the length of side 3? ");
		double c = scan.nextDouble();

		System.out.println("Calculating...");

    //Calculate the area
		double s = (double)(0.5*(a+b+c));
		double answer = (double)Math.sqrt(s*(s-a)*(s-b)*(s-c));

    //Print out area calculated from the Heron's formula
		System.out.println("Answer: " + answer);

    //Close the scanner to prevent any leaks
		scan.close();

	}

}
