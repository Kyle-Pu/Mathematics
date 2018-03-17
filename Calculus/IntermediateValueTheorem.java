import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to the Intermediate Value Theorem Calculator!");

		Scanner scan = new Scanner(System.in);

    //Prompt user about whether the function is continuous or not
    System.out.println("Is the function continuous? Yes or no?");
    String isContinuous = scan.nextLine();
    //Convert entered data to lowercase to avoid testing for case-sensitive material
    isContinuous = isContinuous.toLowerCase();
    
    if(!isContinuous.equals("yes")){
      System.out.println("Since your function is not continuous, Intermediate Value Theorem does NOT apply...");
      System.exit(1);
    }

    //Prompt user for the minimum value of the function
	System.out.println("What is the minimum value of your function?");
	double min = scan.nextDouble();
	
	 //Prompt user for the maximum value of the function
	System.out.println("What is the maximum value of your function?");
	double max = scan.nextDouble();
	
	//Prompt user for value to be tested. Store this data.
	System.out.println("Enter in a number to be tested with IVT (check whether or not the function could pass through this value based on Intermediate Value Theorem...");
	double value = scan.nextDouble();
	
	System.out.println("Calculating...");
		
    //Check if the function could pass through the given value based on Intermediate Value Therorem and print out results
	if((min < value) && (max > value)){
	  System.out.println("Yes! The function DOES pass through the given value based on the Intermediate Value Therorem!");
	}else{
	  System.out.println("Sorry. The function may NOT pass through the value based on the Intermediate Value Theorem...");
	}
  
  //Close the scanner to prevent any leaks
  scan.close();
  
	}

}
