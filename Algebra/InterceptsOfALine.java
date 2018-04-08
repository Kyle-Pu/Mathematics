import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculate the x and y intercepts of the equation of a line in one of four forms:
 * slope-intercept, point-slope, horizontal, or vertical.
 */
public class InterceptsOfALine {
	
	private static Scanner scan;

	public static void main(String[] args) {

		System.out.println("Welcome to the intercepts of a line calculator!");

		System.out.println("Inputs to this program can be whole numbers or decimal numbers.");
		// all inputs (other than to select equations) read as doubles

		System.out.print("\nWhich equation of a line would you like to use?"
				+ "\n1: y = m*x + b"
				+ "\n2: y - y0 = m(x - x0)"
				+ "\n3: y = b  (horizontal line)"
				+ "\n4: x = a  (vertical line)"
				+ "\n --> ");

		scan = new Scanner(System.in);
		int userChoice = scan.nextInt();

		switch(userChoice) {
		case 1: slopeInterceptForm(); break;
		case 2: pointSlopeForm(); break;
		case 3: horizontal(); break;
		case 4: vertical(); break;
		default: System.out.println("Invalid Choice.\nExiting");
		}

		scan.close();
	}

	/**
	 * Calculates the x intercept of a line in slope-intercept form.
	 */
	public static void slopeInterceptForm() {
		System.out.println("\nYou have selected form: y = m*x + b");

		boolean restart = true;

		while (restart) {
			restart = false; // reset boolean

			try {

				System.out.println("\nPlease input the slope of the line (m): ");
				double slope = scan.nextDouble();
				if (slope == 0.0) throw new ZeroSlopeException();

				System.out.println("Plase input the value of b: ");
				double b = scan.nextDouble();

				System.out.printf("\nThe equation of the line you entered is: y = %f*x + %f",slope,b);
				System.out.printf("\n\nThe y intercept is %f", b);

				double xIntercept = xIntercept(slope, b);

				System.out.printf("\nThe x intercept is %f", xIntercept);
			}
			catch(ZeroSlopeException e) {
				restart = zeroSlopeHandler();
				if (!restart) horizontal(); // user chose to calculate the slope of a horizontal line
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Please provide only numbers (no text).");
				restart = true;
			}
		} // end while
	}

	/**
	 * Calculates the intercepts of a line in point-slope form
	 */
	public static void pointSlopeForm() {
		System.out.println("\nYou have selected form: y - y0 = m(x - x0)"
						 + "\nFor this form you need a point (x0, y0).");

		boolean restart = true;

		while (restart) {
			restart = false; // reset boolean

			try {

				System.out.println("\nPlease input the slope of the line (m): ");
				double slope = scan.nextDouble();
				if (slope == 0.0) throw new ZeroSlopeException();

				System.out.println("Plase input the value of x0: ");
				double x0 = scan.nextDouble();

				System.out.println("Plase input the value of y0: ");
				double y0 = scan.nextDouble();

				System.out.printf("\nThe equation of the line you entered is: y - %f = %f(x - %f)",y0,slope,x0);

				double yIntercept = -1 * ((slope * x0) - y0);
				System.out.printf("\n\nThe y intercept is %f", yIntercept);

				double xIntercept = xIntercept(slope, yIntercept);
				System.out.printf("\nThe x intercept is %f", xIntercept);
			}
			catch(ZeroSlopeException e) {
				restart = zeroSlopeHandler();
				if (!restart) horizontal(); // user chose to calculate the slope of a horizontal line
				
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Please provide only numbers (no text).");
				restart = true;
			}

		} // end while
	}

	/**
	 * Calculates the y intercept of a horizontal line.
	 */
	public static void horizontal() {
		System.out.println("\nYou have selected form: y = b");

		boolean restart = true;

		while (restart) {
			restart = false; // reset boolean

			try {

				System.out.println("\nPlease input the value of b: ");
				double b = scan.nextDouble();

				System.out.printf("\nThe equation of the line you entered is: y = %f",b);

				System.out.printf("\n\nThe y intercept is %f\n", b);

				if (b == 0)
					System.out.println("The line is along the x-axis.");
				else 
					System.out.println("There is no x intercept.");

			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Please provide only numbers (no text).");
				restart = true;
			}

		} // end while
	}

	/**
	 * Calculates the x intercept of a vertical line.
	 */
	public static void vertical() {
		System.out.println("\nYou have selected form: x = a");

		boolean restart = true;

		while (restart) {
			restart = false; // reset boolean

			try {

				System.out.println("\nPlease input the value of a: ");
				double a = scan.nextDouble();

				System.out.printf("\nThe equation of the line you entered is: x = %f",a);

				if (a == 0)
					System.out.println("\nThe line is along the y-axis.");
				else 
					System.out.println("\nThere is no y intercept.");

				System.out.printf("The x intercept is %f", a);

			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Please provide only numbers (no text).");
				restart = true;
			}

		} // end while
	}

	/**
	 * Used to calculate x intercept of slope-intercept and point-slope forms.
	 * @param slope of the line
	 * @param b the y intercept of the line
	 * @return the x intercept of the line
	 */
	private static double xIntercept(double slope, double b) {
		if (b != 0) {
			return (-1 * b) / slope;
		}
		else {
			return b / slope;
		}
	}
	
	/**
	 * Asks users who input a slope of 0 in sloptInterceptForm() or pointSlopeForm() if they 
	 * want to calculate the intercepts of a horizontal line.
	 * @return false if should calculate slope of horizontal line; true if should keep using calling the form
	 */
	private static boolean zeroSlopeHandler() {
		boolean invalidInput = true;
		do {
			invalidInput = false;
			System.out.println("Would you like to calculate the slope of a horizontal line? (y/n): ");
			char toRestart = scan.next().charAt(0);
			if (toRestart == 'n' || toRestart == 'N') {
				return true;
			}
			else if(toRestart == 'y' || toRestart == 'Y') {
				return false;
			}
			else {
				invalidInput = true;
			}
			
		} while(invalidInput);
		return false; // default return value
	}

}
