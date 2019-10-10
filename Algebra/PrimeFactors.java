package otros;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
	public static Scanner s = new Scanner(System.in);
	public static List<Integer> primeFactors(int numbers) {
		double n = numbers;
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i<= n/i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add((int) n);
		}
		return factors;
	}

	public static void main(String[] args) {
		try {
			while (true) {
				System.out.print("Introduce a number to get the primefactors: ");
				int primeF = s.nextInt();
				for (Integer number: primeFactors(primeF)) {
					System.out.println(number);
				}
			}
		} catch (InputMismatchException e) {
			s.close();
			System.exit(0);
		}
	}

}
