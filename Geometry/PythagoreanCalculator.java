/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pythagoreancalculator;
import java.util.*;
import java.math.*;

/**
 *
 * @author Ron Fife
 */
public class PythagoreanCalculator {

    public static int getIntInput(String prompt){
                Scanner input = new Scanner(System.in);
                System.out.println(prompt);
                return input.nextInt();
            }
    
            public static double calc(int x , int y){
                double c = Math.sqrt((x*x)+(y*y));
                return c;
            }
    public static void main(String[] args) {
        
        System.out.println("The Pythagorean Theorem Calculator");
        System.out.println("The square of the hypotenuse (the side opposite the right angle) is "
                           + "is equal to the sum of the squares of the other two sides.");
        System.out.println("Enter the lengths of the 2 right angle sides to find the length of the hypotenuse.");
        try {
        System.out.format("%.2f%n", calc(getIntInput("Enter length of side a:"),getIntInput("Enter length of side b:"))); 

        } catch (InputMismatchException ex) {
            System.err.println("Please start over entering numbers only.");
            System.exit(0);
        }
    }
}