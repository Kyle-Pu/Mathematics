import java.util.Scanner;

public class inverse_trig_calc extends Calculator{
	
    public void runCalc() {

        printWelcome();
        doCalculate(getChoice());

    }

    public void doCalculate(int userChoice) {
      
      switch(userChoice){

		      case 1: new Cotangent().calculate(); break;
		      case 2: new Secant().calculate(); break;
		      case 3: new Cosecant().calculate(); break;
		      case 4: new Coth().calculate(); break;
		      case 5: new Sech().calculate(); break;
		      case 6: new Cosech().calculate(); break;
		      case 7: new Arccot().calculate(); break;
		      case 8: new Arcsecant().calculate(); break;
		      case 9: new Arccosec().calculate(); break;
	      
              default: printInvalidChoice();
        }
   }


   public void printWelcome() {
		System.out.println("Welcome to the trigonometry calculator!");
		System.out.println("\nThis is the inverese trigonometry calculator");
   }


   protected void printChoice() {
		System.out.println("What inverse trigonometry function do you want to use? :"
				+ "\n 1 Cotangent"
				+ "\n 2 Secant"
				+ "\n 3 Cosec"
				+ "\n 4 Coth"
				+ "\n 5 Sech"
				+ "\n 6 Cosech"
				+ "\n 7 Arccot"
				+ "\n 8 Arcsecant"
				+ "\n 9 Arccosec\n");
   }

}
