import java.util.*;

class PrimeFactors {

	public static void main(String[] args) {

		System.out.println("Welcome to the prime factors calculator!");

		try {
			Scanner scan = new Scanner(System.in);

			// Prompt user for integer to find factors of and store the data
			System.out.println("Please input a number to factor...");
			int numToFactor = scan.nextInt();

			System.out.println("Prime factors of " + numToFactor + " are: ");

			// Pollard Rho Prime decomposition
			boolean originalNumberIsPrime = true;
			for (int i = 2; i <= Math.sqrt(numToFactor); i++) {
				if (numToFactor % i == 0) {
					//Keep dividing numToFactor by i until it is divisible
					//and print i as prime factor each time it divides numToFactor
					while(numToFactor % i == 0 ){
						numToFactor /= i;
						System.out.print(i);
						originalNumberIsPrime = false;
						if(numToFactor != 1)
							System.out.print("*");
					}
				}
			}

			if(originalNumberIsPrime) {
				System.out.println("1*" + numToFactor);
			}

			scan.close();

		} catch (InputMismatchException ex) {
			System.out.println();
			System.err.println("Please provide only numbers (no text). Also, please ensure your number is within the range of -2,147,483,648 to 2,147,483,647. Restart the program and try again!");
			main(new String[0]);
		}
	}

}
