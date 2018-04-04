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

			/*
			 * Algorithm to check for prime factors (starting from 1 to the inputed number, if 'i'
			 * divides into the numToFactor without a remainder and isPrime returns true, 'i' is a prime factor of
			 * numToFactor)
			 */
			for (int i = 2; i <= numToFactor; i++) {
				if ((numToFactor % i == 0) && (isPrime(i))) {
					//Keep dividing numToFactoe by i until it is divisible
					//and print i as prime factor each time it divides numToFactor 
					while(numToFactor % i == 0 ){
						numToFactor /= i;
						System.out.print(i);
						if(numToFactor != 1)
							System.out.print("*");
					}
				}
			}

			scan.close();
			
		} catch (InputMismatchException ex) {
			System.out.println();
			System.err.println("Please provide only numbers (no text). Also, please ensure your number is within the range of -2,147,483,648 to 2,147,483,647Restart the program and try again!");
			main(new String[0]);
		}

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}

}
