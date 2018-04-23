import java.util.*;
public class GCD {

 public static void main(String[] s) {

  try {
   Scanner scan = new Scanner(System.in);
   //Prompt user for number to find GCD  of and store the data
   System.out.println("Please input integers to GCD of (enter two numbers with a space to separate)");
   int a = scan.nextInt();
   int b = scan.nextInt();
   System.out.println("The GCD of your first number: " + a + " and your second number: " + b + " is = " + new GCD().gcd(a, b));
  } catch (InputMismatchException ex) {
   System.err.println("Please provide only numbers (no text). Restarting the program, please try again!");
   System.out.println();
   main(new String[0]);
  }
 }


 public int gcd(int a, int b) {
  int limit = 0;
  int gcd = 1;
  if (a > b) {
   limit = a;
  } else {
   limit = b;
  }
  for (int i = (int) java.lang.Math.sqrt(limit); i >= 1; i--) {
   if (a % i == 0 && b % i == 0) {
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
}
