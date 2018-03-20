//github.com/binoy-d

import java.util.Scanner;

public class Area{

	public static void main(String[] args) {

		System.out.println("Welcome to the Area Calculator!");
		Scanner scan = new Scanner(System.in);
    //Prompt user for which shape to calculate the area of
		System.out.println("What would you like to calculate the area of?\nrectangle = 1\ncircle = 2");
		int a = scan.nextInt();

    double area = -1;
    //Calculate the area based on selection
    if(a == 1){
      area = rectangle();
    }else if(a == 2){
      area = circle();
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
		System.out.println("What is the height of the rectangle?");
		double h = scan.nextDouble();
    //Prompt user for  width
		System.out.println("What is the width of the rectangle?");
		double w = scan.nextDouble();
    return h*w;
  }
  public static double circle(){
    Scanner scan = new Scanner(System.in);
    //Prompt user for radius
		System.out.println("What is the radius of the circle?");
		double r = scan.nextDouble();
    return r*r*3.141592;
  }

}
