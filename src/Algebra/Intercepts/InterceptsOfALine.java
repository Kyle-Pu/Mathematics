package Algebra.Intercepts;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculate the x and y intercepts of the equation of a line in one of four forms:
 * slope-intercept, point-slope, horizontal, or vertical.
 */
public class InterceptsOfALine {
	static int userChoice;
	private static Scanner scan;

	public static void main(String[] args) {
		new InterceptsOfALine().prepare();
		switch(userChoice) {
		case 1: slopeInterceptForm slope = new slopeInterceptForm();
				slope.slopeInterceptForm(); break;
		case 2: pointSlopeForm point = new pointSlopeForm();
				point.pointSlopeForm(); break;
		case 3: horizontal(); break;
		case 4: vertical(); break;
		default: System.out.println("Invalid Choice.\nExiting");
		}
		scan.close();
	}
	
	public void prepare() {
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
		userChoice = scan.nextInt();
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
	protected static double xIntercept(double slope, double b) {
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
	protected static boolean zeroSlopeHandler() {
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
