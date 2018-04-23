import java.util.*;
class nearInt {

 public static void main(String[] s) {
  System.out.println("Welcome to the Square Root Calculator!");
  try {
   Scanner scan = new Scanner(System.in);
   System.out.println();
   //Prompt user for number to find square root of and store the data
   System.out.println("Please input a number to find square root of...");
   double numToSrt = Double.parseDouble(scan.next());
	//FInd the nearest Integer of the Square root by rounding up
   double sqRt = Math.sqrt(numToSrt);
   
   System.out.println();
   System.out.println("Square root of " + numToSrt + " is: " + sqRt);
   System.out.println("Nearest integer of the square root is: " + Math.round(sqRt));
   System.out.println("....");
    System.out.println("Do you want an explanation of how it was computed? ");
	System.out.println("Yes/No");
	boolean expDone = false;
	while(!expDone){
		Scanner scan_2 = new Scanner(System.in);
	
	   String you = scan_2.nextLine();
      if(you.equalsIgnoreCase("no")){
       expDone = true;
      }else if (you.equalsIgnoreCase("yes")){
        expDone = true;
	      
		System.out.println();
		System.out.println("First we calculate square root of the number and after that we round the number to get the nearest Integer!");
      }else{
        System.out.println("Sorry, try again (yes/no)...");
	  }
	}
	
  } catch (InputMismatchException ex) {
   System.err.println("Please provide only numbers (no text). Restarting the program, Please try again!");
   main(new String[0]);
  }
 }
}
