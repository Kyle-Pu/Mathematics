package otros;
import java.util.Scanner;

public class InterceptLine {
	
	public static Object findX(double a, double c) {
		if (a == 0) {
			return null;
		} else {
			return c/a;
		}
	}
	
	public static Object findY(double b, double c) {
		if (b == 0) {
			return null;
		} else {
			return c/b;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Formula: Ax + By = C");
		System.out.print("Introduce value of A: ");
		double a = s.nextDouble();
		System.out.print("Introduce value of B: ");
		double b = s.nextDouble();
		System.out.print("Introduce value of C: ");
		double c = s.nextDouble();
		System.out.print("X intercept: (" + findX(a,c) + ",0)");
		System.out.print("Y intercept: (0," + findY(b,c) + ")");
		s.close();

	}

}
