/*
	A simple java program to return the mean of inputted numbers
*/

import java.util.*;

public class mean {
	public static void main(String[] args)  {
		//input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter each number you would like to take the mean of, clicking enter after each number. When you are finished, please type \"done\" and then hit enter.");
		ArrayList<Double> numbers = new ArrayList<Double>();
		//checking type, collecting all numbers into arraylist
		while(true){
			if (scan.hasNextDouble())
				numbers.add(scan.nextDouble());
			else if(scan.nextLine().toLowerCase().equals("done"))
				break;
			else{
				System.out.println("This program only accepts numbers, or the word \"done\"");
			}
		}
		//taking sum
		double sum = 0;
		for(Double number : numbers)
			sum += number;
		//finding mean and printing
		double mean = sum / numbers.size();
		System.out.println("The mean of your numbers is " + mean);
	}
}
