package Algebra.Intercepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pointSlopeForm extends InterceptsOfALine {
	
	/**
	 * Calculates the intercepts of a line in point-slope form
	 */
	public static void pointSlopeForm() {
		Scanner scan = new Scanner(System.in);
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
}
