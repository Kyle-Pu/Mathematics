package Calculus.Limits;


//calculate the limit of a polyinomial

import java.util.Scanner;

public class Polynomial {


    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println("find limit as x approaches: \n1) a number \n2) infinity");
            String last_input = sc.nextLine();

            if (last_input.equalsIgnoreCase("1")) {
                System.out.println("Please enter your numbers (ax^2 + bx + c) as: a,b,c,x ");

                //get the user input
                String input = sc.nextLine();
                int a = 0;
                int b = 0;
                int c = 0;
                int x = 0;

                //split the input
                String[] split = input.split(",");
                a += Integer.parseInt(split[0]);
                b += Integer.parseInt(split[1]);
                c += Integer.parseInt(split[2]);
                x += Integer.parseInt(split[3]);

                int limitAsXApproachesNumber = ((a * (x * x)) + (b * x)) + c;
                System.out.println("The limit is: " + limitAsXApproachesNumber);
            } else if (last_input.equalsIgnoreCase("2")) {
                LimitAtInfinity();
            }

        } catch (Exception e) {
            System.out.println("Please use the proper format");
        }

    }

    public static void LimitAtInfinity() {
        //this method finds the limit when x is a number (not infinity)
        try {


            System.out.println("Please enter your numbers (ax^2 + bx + c) as: a,b,c  ");

            //get the user input
            String input = sc.nextLine();
            int a = 0;
            int b = 0;
            int c = 0;
            int x = 0;

            //split the input
            String[] split = input.split(",");
            a += Integer.parseInt(split[0]);
            b += Integer.parseInt(split[1]);
            c += Integer.parseInt(split[2]);


            //covering all possible inputs

            if (a == 0 && b == 0) {
                System.out.println("The limit is: " + c + " at both +∞ and -∞");
            } else if (a == 0) {
                if (b > 0) {
                    System.out.println("There is no limit, as x approaches +∞ the answer is: +∞ , as x approaches -∞ the answer is: -∞ ");
                } else {
                    System.out.println("There is no limit, as x approaches +∞ the answer is: -∞ , as x approaches -∞ the answer is: +∞ ");

                }

            } else if (a > 0) {
                System.out.println("There is no limit, as x approaches +∞ the answer is: +∞ , as x approaches -∞ the answer is: -∞ ");

            } else {
                System.out.println("There is no limit, as x approaches +∞ the answer is: -∞ , as x approaches -∞ the answer is: +∞ ");

            }

        } catch (Exception e) {
            System.out.println("Please use the proper format");
        }
    }
}

