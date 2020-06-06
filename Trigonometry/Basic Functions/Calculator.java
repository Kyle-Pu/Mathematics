import java.util.Scanner;

public abstract class Calculator {

   public abstract void doCalculate(int userChoice);

   protected void printInvalidChoice() {
      System.out.println("Invalid Choice.\n Exiting");
   }

   public void printWelcome() {
	      System.out.println("Welcome to the trigonometry calculator!");
   }

   protected final int getChoice() {
      Scanner scan = new Scanner(System.in);

      printChoice();

      int userChoice = scan.nextInt();
      return userChoice;
   }

   protected abstract void printChoice();


}
