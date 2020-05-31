package Algebra;
import java.util.*;
public class GCD {
 static int a;
 static int b;
 public static void main(String[] args){
  int gcd;
  try {
   new GCD().prepare();
    gcd = new GCD().gcd(a, b);
   System.out.println(gcd);
  } catch (InputMismatchException ex) {
   System.err.println("Please provide only numbers (no text). Restarting the program, please try again!");
   System.out.println();
  }
 }
 
 public void prepare() {
	 Scanner scan = new Scanner(System.in);
	   //Prompt user for number to find GCD  of and store the data
	   System.out.println("Please input integers to GCD of (enter two numbers with a space to separate)");
	   a = scan.nextInt();
	   b = scan.nextInt();
	   System.out.print("The GCD of your first number: " + a + " and your second number: " + b + " is = ");
 }

 public int gcd(int a, int b) {
	 int limit = 0;
	 int gcd = 1;
	 if (a > b) {
		 limit = a;
	 } else {
		 limit = b;
	 }
	 gcd = findGcd(a,b,limit);
	 return gcd;
}
 
public int findGcd(int a, int b, int limit) {
	 int gcd = 1;
	 for (int i = (int) java.lang.Math.sqrt(limit); i >= 1; i--) {
		 if (zeroElement(a,b,i)) {
			 gcd = i;
			 for (int j = 2; i * j <= limit; j++) {
				 if (a % (i * j) == 0 && b % (i * j) == 0) {
					 gcd = i * j;
				 }
			 }
			 break;
		 }
	 }
	 return gcd;
 }
 
public boolean zeroElement(int a, int b, int i) {
		if (a % i == 0 && b % i == 0)
			return true;
		else
			return false;
}
}
