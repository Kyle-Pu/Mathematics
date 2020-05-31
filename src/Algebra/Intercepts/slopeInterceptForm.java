package Algebra.Intercepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class slopeInterceptForm extends InterceptsOfALine {

	/**
	 * Calculates the x intercept of a line in slope-intercept form.
	 */
	public static void slopeInterceptForm() {
		Scanner scan = new Scanner(System.in);
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

}
