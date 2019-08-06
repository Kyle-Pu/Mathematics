/*
* This program calculates the distance between two 3 dimensional points
* @author ars153
* @version 5.8.19
*/

import java.util.Scanner;

public class threedimdistance
{
  public static void main(String[] agrs)
  {
    Scanner sc = new Scanner(System.in); //Declaring scanner

    System.out.println("Please enter two 3 dimensional points with the format x1 y1 z1 x2 y2 z2: "); //Prompting the user for coordinates

    double x1, y1, z1, x2, y2, z2; //Declaring the points

    boolean not_acceptable = true; //This determines whether the user gave acceptable input

    while (not_acceptable){

      //This loop will keep trying until acceptable input has been given

      try
      {
        //Getting values from the user, only doubles are accepted

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        z1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        z2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2)); //Calculating the distance between the points

        System.out.println("The distance between the two coordinates is " + distance + " units."); //Printing the distance
        not_acceptable = false; //Stop the program
      }

      catch(Exception e)
      {
        System.out.println("Please try again and only use numbers."); //Disregard invalid entries
        sc.next(); //Throw invalid entry away 
      }
  }
  }
}
