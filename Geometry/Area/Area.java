//github.com/binoy-d

import java.util.Scanner;

public class Area{

	public static void main(String[] args) {

		System.out.println("Welcome to the Area Calculator!");
		Scanner scan = new Scanner(System.in);

    		//Prompt user for which shape to calculate the area of
		System.out.println("What would you like to calculate the area of?" +
		"\n 1	Rectangle" +
		"\n 2	Circle" +
		"\n 3	Triangle" +
		"\n 4	Square"+
		"\n 5	Parallelogram\n"	);

		int userChoice = scan.nextInt();

		double area = -1;

    		//Calculate the area based on user's choice
		switch(userChoice){
			case 1 : area = rectangle(); break;
			case 2 : area = circle(); break;
			case 3 : area = triangle(); break;
			case 4 : area = square(); break;
			case 5 : area = parallelogram(); break;
			default: System.out.println("Invalid Choice.\n Exiting");
		}

		System.out.println("Calculating...");

    		//Print out area calculated
		System.out.println("Area: " + area);
    		//Close the scanner to prevent any leaks
		scan.close();

	}

	public static double rectangle(){
		Scanner scan = new Scanner(System.in);
		//Prompt user for  height
		System.out.println("What is the height of the rectangle?\t");
		double h = scan.nextDouble();
		//Prompt user for  width
		System.out.println("What is the width of the rectangle?\t");
		double w = scan.nextDouble();
    		return h*w;
  	}

 	public static double circle(){

		Scanner scan = new Scanner(System.in);
		//Prompt user for radius
		System.out.println("What is the radius of the circle?\t");
		double r = scan.nextDouble();
		return r*r*3.141592;
	}

	public static double triangle(){

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of Base of Triangle:\t");
		double length = scan.nextDouble();

		System.out.println("What is the length of Height of Triangle:\t");
		double height = scan.nextDouble();

		return 0.5 * length * height;
	}

	public static double square(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of side of the Square:\t");
		double side = scan.nextDouble();

		return side * side;
	}

	public static double parallelogram(){

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of Base of the Parallelogram:\t");
		double base = scan.nextDouble();

		System.out.println("What is the length of Height of the Parallelogram:\t");
		double height = scan.nextDouble();

		return base * height;
	}

}
