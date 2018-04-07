import java.util.Scanner;

public class Distance{

	public static void main(String[] args) {

		System.out.println("Welcome to the Distance Calculator!");
		Scanner scan = new Scanner(System.in);

			//Initialise the variables
		
		double x_1 = 0.0;
		double y_1 = 0.0;
		double x_2 = 0.0;
		double y_2 = 0.0;
			//Prompt user for which shape to calculate the area of
		System.out.println("Enter the co-ordinates of the two points. If your two points are (x1,y1) and (x2,y2) then enter them like so: x1 y1 x2 y2");
		
		try{
			x_1 = scan.nextDouble();
			y_1 = scan.nextDouble();
			x_2 = scan.nextDouble();
			y_2 = scan.nextDouble();
			double distance = calculateDistance(x_1, y_1, x_2, y_2);
			System.out.println("Calculating...");
    			//Print out area calculated
			System.out.println("Distance: " + distance);
		}
		catch(Exception e){
			System.out.println("Please enter only number in the following format: x1 y1 x2 y2. Eg 10 13 23 24");
		}
		finally{
			//Close the scanner to prevent any leaks
			scan.close();
		}

	}

	public static double calculateDistance(double x_1, double y_1, double x_2, double y_2){
		double distance = Math.sqrt(Math.pow((x_2 - x_1), 2) + Math.pow((y_2 - y_1), 2));
    		return distance;
  	}
}
