import java.util.Scanner;

public class trig_calc extends Calculator {

    public void runCalc() {

        printWelcome();
        doCalculate(getChoice());

    }

    public void doCalculate(int userChoice) {
      
      switch(userChoice){

            case 1: new Sine().calculate(); break;
            case 2: new Cosine().calculate(); break;
            case 3: new Tan().calculate(); break;
            case 4: new Sineh().calculate(); break;
            case 5: new Cosh().calculate(); break;
            case 6: new Tanh().calculate(); break;
            case 7: new Asine().calculate(); break;
            case 8: new Acos().calculate(); break;
            case 9: new Atan().calculate(); break;
  
            default: printInvalidChoice();
        }
   }





   protected void printChoice() {
	      System.out.println("What trigonometry function do you want to use? :"
	                + "\n 1 Sine"
	                + "\n 2 Cosine"
	                + "\n 3 Tan"
	                + "\n 4 Sineh"
	                + "\n 5 Cosh"
	                + "\n 6 Tanh"
	                + "\n 7 Arcsine"
	                + "\n 8 Arccosine"
	                + "\n 9 Arctan\n");
   }

}
