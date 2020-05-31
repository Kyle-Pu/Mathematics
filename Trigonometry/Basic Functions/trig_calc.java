import java.util.Scanner;

public class trig_calc {

    public static void main(String[] args) {

        printWelcome();
        doCalculate(getChoice());

    }

   private static void doCalculate(int userChoice) {
      
      switch(userChoice){

            case 1: sine(); break;
            case 2: cosine(); break;
            case 3: tan(); break;
            case 4: sineh(); break;
            case 5: cosh(); break;
            case 6: tanh(); break;
            case 7: asine(); break;
            case 8: acos(); break;
            case 9: atan(); break;

            default: printInvalidChoice();
        }
   }

   private static void printInvalidChoice() {
      System.out.println("Invalid Choice.\n Exiting");
   }

   private static void printWelcome() {
      System.out.println("Welcome to the trigonometry calculator!");
   }

   private static int getChoice() {
      Scanner scan = new Scanner(System.in);

      System.out.println("What trigonometry function do you want to use? :"
                + "\n 1   Sine"
                + "\n 2   Cosine"
                + "\n 3 Tan"
                + "\n 4 Sineh"
                + "\n 5 Cosh"
                + "\n 6 Tanh"
                + "\n 7 Arcsine"
                + "\n 8 Arccosine"
                + "\n 9 Arctan\n");

        int userChoice = scan.nextInt();
        scan.close();
      return userChoice;
   }

    public static double sine(){
       String angle = getAngle();
        System.out.println( "sine of " + angle + " is " + getSineValue(angle) );
        return getSineValue(angle);
    }

   private static double getSineValue(String angle) {
      return Math.sin(convertToRadians(angle));
   }

   private static double convertToRadians(String angle) {
      return Math.toRadians(convertToDouble(angle));
   }

   private static double convertToDouble(String angle) {
      return Double.parseDouble(angle);
   }

   private static String getAngle() {
      System.out.print("Enter an angle in degrees: ");
        Scanner scan = new Scanner(System.in);
        String angle = scan.nextLine();
        scan.close();
      return angle;
   }

    public static double cosine(){

        String angle = getAngle();
        System.out.println("cosine of " + angle + " is " + getCosineValue(angle));
        return getCosineValue(angle);
    }

   private static double getCosineValue(String angle) {
      return Math.cos(convertToRadians(angle));
   }

    public static double tan(){
       
       String angle = getAngle();
        System.out.println("tan of " + angle + " is " + getTanValue(angle));
        return getTanValue(angle);
    }

   private static double getTanValue(String angle) {
      return Math.tan(convertToRadians(angle));
   }

    public static double sineh(){
       
       String angle = getAngle();
        System.out.println("sinh of " + angle + " is " + getSinehValue(angle));
        return getSinehValue(angle);
    }

   private static double getSinehValue(String angle) {
      return Math.sinh(convertToRadians(angle));
   }

    public static double cosh(){

       String angle = getAngle();
        System.out.println("cosinh of " + angle + " is " + getcoshValue(angle));
        return getcoshValue(angle);
    }

   private static double getcoshValue(String angle) {
      return Math.cosh(convertToRadians(angle));
   }


    public static double tanh(){

       String angle = getAngle();
        System.out.println("tanh of " + angle + " is " + getTanhValue(angle));
        return getTanhValue(angle);
    }

   private static double getTanhValue(String angle) {
      return Math.tanh(convertToRadians(angle));
   }

    public static double asine(){

       String angle = getAngle();
        System.out.println("Arcsine of " + angle + " is " + getAsineValue(angle) + " radians");
        return getAsineValue(angle);
    }

   private static double getAsineValue(String angle) {
      return Math.asin(convertToDouble(angle));
   }

    public static double acos(){

       String angle = getAngle();
        System.out.println("Arccosine of " + angle + " is " + getAcosValue(angle) + " radians");
        return getAcosValue(angle);
    }

   private static double getAcosValue(String angle) {
      return Math.acos(convertToDouble(angle));
   }

    public static double atan(){

       String angle = getAngle();
        System.out.println("Arctangent of " + angle + " is " + getAtanValue(angle) + " radians");
        return getAtanValue(angle);
    }

   private static double getAtanValue(String angle) {
      return Math.atan(convertToDouble(angle));
   }
}