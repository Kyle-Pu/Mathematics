package Calculus.Limits;

import java.util.Scanner;

public class LimitOfAPolynomial {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("Find limit as x approaches: \n1) A number \n2) Infinity");
			String select = sc.nextLine();
			
			if (select.equalsIgnoreCase("1")) {
				LimitAtPoint();
				
			} else if (select.equalsIgnoreCase("2")) {
				LimitAtInfinity();
			}
			
		} catch (Exception e) {
    	  formatError();
		}
	}

	private static void formatError() {
		System.out.println("Please use the proper format... Try again!");
    	  System.out.println();
    	  String[] a = new String[5];
    	  main(a);
	}

	public static void LimitAtPoint() {
		System.out.println("Please enter your numbers (ax^2 + bx + c) as: a,b,c,x (separate each value with commas, no spaces)");
		  String input = sc.nextLine();
	
		  String[] split = input.split(",");
		  int a = Integer.parseInt(split[0]);
		  int b = Integer.parseInt(split[1]);
		  int c = Integer.parseInt(split[2]);
		  int x = Integer.parseInt(split[3]);
	
		  int limitAsXApproachesNumber = ((a * (x * x)) + (b * x)) + c;
		  System.out.println("The limit is: " + limitAsXApproachesNumber);
	}
	
	public static void LimitAtInfinity() {
	      try {
	          System.out.println("Please enter your numbers (ax^2 + bx + c) as: a,b,c  ");
	          
	          String input = sc.nextLine();
	          
	          String[] split = input.split(",");
	          int a = Integer.parseInt(split[0]);
	          int b = Integer.parseInt(split[1]);
	          int c = Integer.parseInt(split[2]);
	
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
