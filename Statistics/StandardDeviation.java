import java.util.Scanner;

// @author Noor Buchi

public class StandardDeviation
{
  public static double calculateArithmeticMean(double[] timings) {
    double runningTotal = 0.0;
    // Done: Make sure that you understand how this for loop works
    for (int i = 0; i < timings.length; i++) {
      runningTotal = runningTotal + timings[i];
    }
    // Done: Make sure that you understand how casting works in Java
    return runningTotal / (double)timings.length;
  }

  /**
   * Calculates the variance of double values in an array.
   *
   * @param timings the list of double values from timing an algorithm
   */
  public static double calculateVariance(double[] timings) {
    double arithmeticMean = calculateArithmeticMean(timings);
    double runningTotal = 0.0;
    // Done: Add for loop and correct computation here
    //Adds to the runningTotal according to the variance
    for (int i = 0; i < timings.length; i++) {
      runningTotal = runningTotal + Math.pow(timings[i] - arithmeticMean, 2);
    }
    return runningTotal / ((double)timings.length - 1);
  }

  /**
   * Calculates the standard deviation of double values in an array.
   *
   * @param timings the list of double values from timing an algorithm
   */
  public static double calculateStandardDeviation(double[] timings) {
    // Done: use a static method in Math to calculate the standard deviation
    double variance = calculateVariance(timings);
    return Math.sqrt(variance); //uses Math.sqrt method to take square root
  }

  public static double[] convertTodouble(String[] stringArr) {
    double[] numericArr = new double[stringArr.length];
    for (int i = 0; i < stringArr.length; i++) {
      numericArr[i] = Double.valueOf(stringArr[i]);
    }
    return numericArr;
  }

  public static void main( String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter values separated by comma:");
    String input = scan.nextLine();
    String numbers[] = input.split(",");
    double[] numArr = convertTodouble(numbers);
    scan.close();
    System.out.println("Calculating the arithmatic mean...");
    System.out.println(calculateArithmeticMean(numArr));
    System.out.println("...Arithmatic mean calculated");
    System.out.println("Calculating the sample variance...");
    System.out.println(calculateVariance(numArr));
    System.out.println("...Variance calculated");
    System.out.println("Calculating the sample standard deviation...");
    System.out.println(calculateStandardDeviation(numArr));
    System.out.println("...Standard Deviation calculated");
 }

}
