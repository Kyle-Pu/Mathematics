import java.util.*;

public class QuadraticFormula {

	public static void main(String[] args) {

		System.out.println("Welcome to the Quadratic Formula Calculator!");

		Scanner scan = new Scanner(System.in);

		// Prompt user for coefficients in polynomial and store values
		System.out.print("What is the value of 'a' of your polynomial in the form of ax^2 + bx + c? ");
		double a = scan.nextDouble();

		System.out.print("What is the value of 'b' of your polynomial? ");
		double b = scan.nextDouble();

		System.out.print("What is the value of 'c' of your polynomial? ");
		double c = scan.nextDouble();

		System.out.println("Calculating...");

		// Calculate both forms of the quadratic formula (plus or minus in the
		// numerator)
		double answer1 = (double) (((b) + Math.sqrt(b * b - 4 * a * c))) / (2 * a);
		double answer2 = (double) (((b) - Math.sqrt(b * b - 4 * a * c))) / (2 * a);

		// Print out zeroes calculated from the quadratic formula
		if (!Double.isNaN(answer1)) {
			System.out.println("Answer 1: " + answer1);
		} else {
			System.out.println("Imaginary solution...");
		}
		if (!Double.isNaN(answer2)) {
			System.out.println("Answer 2: " + answer2);
		} else {
			System.out.println("Imaginary solution...");
		}

		System.out.println();

		// Restart the program is user would like to

		System.out.println(
				"Thank you for using our calculator! If you would like to restart this program, enter in the 'Y' key with your keyboard and hit \"Enter\"!");
		scan.nextLine();

		String restart = scan.nextLine();

		if (restart.toLowerCase().equals("y")) {
			main(new String[0]);
		}

		// Close the scanner to prevent any leaks
		scan.close();

	}

}
