// @author Ron Fife

import java.util.*;
import java.math.*;

// Use Pythagorean Theorem to calculate length of hypotenuse 
// from lengths of 2 legs of right triangle input from user.
public class PythagoreanCalculator {

    // Method to get user input of 2 legs of right triangle
    // and return as integers.
    public static int getIntInput(String prompt){
                Scanner input = new Scanner(System.in);
                System.out.println(prompt);
                return input.nextInt();
            }
    
    // Method to calculate length of hypotenuse 
    // and return as double
    public static double calcHypotenuse(int x , int y){
                double c = Math.sqrt((x*x)+(y*y));
                return c;
            }
    
    // main method
    public static void main(String[] args) {
        
        // Print description and prompt user input.
        System.out.println("The Pythagorean Theorem Calculator");
        System.out.println("");
        System.out.println("For a right triangle (a triangle with a 90 degree angle), "
                           + "the square of the hypotenuse (the side opposite the right angle) is "
                           + "equal to the sum of the squares of the other two sides or legs.");
        System.out.println("");
        System.out.println("The theorem is used to find the length of the hypotenuse "
                           + "from the lengths of the 2 sides, or legs, adjacent to the 90 degree angle "
                           + "This formula, a squared + b squared = c squared, only applies to right triangles");
        System.out.println("");
        System.out.println("Enter the lengths of the 2 right angle sides to find the length of the hypotenuse.");
        System.out.println("");
        
        try {
            
        // Prompt user inputs and send as arguments to getIntInput method, 
        // integers returned from GetIntInput are sent as arguments to calcHypotenuse method,
        // Print double returned from calcHypotenuse method formatted as string to 2 decimal places.
        System.out.format("The length of the hypotenuse is: %.2f%n", 
                          calcHypotenuse(getIntInput("Enter length of side a:"),getIntInput("Enter length of side b:"))); 

        } catch (InputMismatchException ex) {
            System.err.println("Please start over entering numbers only.");
            String[] arr = {""};
            main(arr);
        }
    }
}
