package Algebra.Slope;
import java.util.*;

public class SlopeOfALine {
	static double x1;
	static double x2;
	static double y1;
	static double y2;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            //Prompt user for point values
        	prepare();
            String answer = "";
            if(x2 - x1 == 0d){
                answer = "This is a vertical line with no slope, also known as an Infinity Slope or Undefined Slope";
            }else {
                //Calculate the slope of a line
                double slope = (y2 - y1) / (x2 - x1);
                answer = "The slope of your line is "+slope;
            }
            printEnd(answer);
            
        } catch (InputMismatchException ex) {
            System.err.println("Please provide only numbers (not text). Please restart the program and try again!");
            main(new String[0]);
        }

    }
    
    public static void prepare() {
        System.out.println("Welcome to the Slope of a Line Calculator!");
    	//The First Point
        System.out.print("What is the value of the 'x' coordinate of your first point?  ");
        x1 = scan.nextDouble();

        System.out.print("What is the value of the 'y' coordinate of your first point?  ");
        y1 = scan.nextDouble();

        //The Second Point
        System.out.print("What is the value of the 'x' coordinate of your second point?  ");
        x2 = scan.nextDouble();

        System.out.print("What is the value of the 'y' coordinate of your second point?  ");
        y2 = scan.nextDouble();


        System.out.println("\nCalculating...");
    }
    
    public static void printEnd(String answer) {
    	//Print out the slope value
        System.out.println("\n--------------");
        System.out.println(answer);
        System.out.println("--------------");
        //Close the scanner to prevent any leaks
        scan.close();
    }
}
