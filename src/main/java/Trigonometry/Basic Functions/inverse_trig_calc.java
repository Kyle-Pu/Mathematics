import java.util.Scanner;

public class inverse_trig_calc {

    public static void main(String[] args) {

        System.out.println("Welcome to the trigonometry calculator!");
        System.out.println("\nThis is the inverese trigonometry calculator");
        Scanner scan = new Scanner(System.in);

        //Prompt user for which trigonometry function
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

        int userChoice = scan.nextInt();


        switch(userChoice){

            case 1: cotangent(); break;
            case 2: secant(); break;
            case 3: cosecant(); break;
            case 4: coth(); break;
            case 5: sech(); break;
            case 6: cosech(); break;
            case 7: acot(); break;
            case 8: asec(); break;
            case 9: acosec(); break;


            default: System.out.println("Invalid Choice.\n Exiting");
        }

    }

    public static double cotangent(){

        // Ask for user input
        System.out.print("Enter an angle in degrees: ");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);

        // Assign the user to String variable
        String s = scan.nextLine();

        // close the scanner object
        scan.close();

        // convert the string input to double
        double value = Double.parseDouble(s);
        // convert the value to radians
        double valueRadians = Math.toRadians(value);

        // get the cot of the angle
        double cotValue = 1/(Math.tan(valueRadians));
        System.out.println("Cotangent of" + s + " is " + cotValue);
        return cotValue;
    }

    public static double secant(){

        // Ask for user input
        System.out.print("Enter an angle in degrees: ");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);

        // Assign the user to String variable
        String s = scan.nextLine();

        // close the scanner object
        scan.close();

        // convert the string input to double
        double value = Double.parseDouble(s);
        // convert the value to radians
        double valueRadians = Math.toRadians(value);

        // get the secant of the angle
        double secantValue = 1/(Math.cos(valueRadians));
        System.out.println("Secant of " + s + " is " + secantValue);
        return secantValue;


    }

    public static double cosecant(){

        // Ask for user input
        System.out.print("Enter a number : ");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);

        // Assign the user to String variable
        String s = scan.nextLine();

        // close the scanner object
        scan.close();

        // convert the string input to double
        double value = Double.parseDouble(s);
        // convert the value to radians
        double valueRadians = Math.toRadians(value);

        // get the cosecant of the angle
        double cosecValue = 1/(Math.sin(valueRadians));
        System.out.println("Cosecant of " + s + " is " + cosecValue);
        return cosecValue;
    }

    public static double coth(){
        // Ask for user input
        System.out.print("Enter a number : ");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);

        // Assign the user to String variable
        String s = scan.nextLine(); //changed from s to input for clear reading

        // close the scanner object
        scan.close();

        // convert the string input to double
        double value = Double.parseDouble(s);

        // get the coth of the angle
        double cothValue = 1/(Math.tanh(value));
        System.out.println("Coth of " + s + " is " + cothValue);
        return cothValue;
    }

    public static double sech(){

        // Ask for user input
        System.out.print("Enter your number: ");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);

        // Assign the user to String variable
        String input = scan.nextLine();

        // close the scanner object
        scan.close();

        // convert the string input to double
        double value = Double.parseDouble(input);

        // get the sech of the angle
        double sechValue = 1/(Math.cosh(value));
        System.out.println("Sech of " + input + " is " + sechValue);
        return sechValue;
    }


    public static double cosech(){

        // Ask for user input
        System.out.print("Enter your number: ");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);

        // Assign the user to String variable
        String input = scan.nextLine();

        // close the scanner object
        scan.close();

        // convert the string input to double
        double value = Double.parseDouble(input);

        // get the cosech of the angle
        double cosechValue = 1/(Math.sinh(value));
        System.out.println("Cosech of " + input + " is " + cosechValue);
        return cosechValue;
    }

    public static double acot(){

        // Ask for user input
        System.out.print("Enter your number: ");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);

        // Assign the user to String variable
        String s = scan.nextLine();

        // close the scanner object
        scan.close();

        // get the arccot of the angle
        // here 1.570795 is the value for pi/2 (i.e) 3.14159/2
        double acotValue = 1.570795 -  (Math.atan(Double.parseDouble(s)));
        System.out.println("Arccot of " + s + " is " + acotValue + " radians");
        return acotValue;
    }

    public static double asec(){

        // Ask for user input
        System.out.print("Enter your number ");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);

        // Assign the user to String variable
        String s = scan.nextLine();

        // close the scanner object
        scan.close();

        // get the arcsecant of the user input
        double asecValue = Math.acos(1/Double.parseDouble(s));
        System.out.println("Arcsecant of " + s + " is " + asecValue + " radians");
        return asecValue;
    }

    public static double acosec(){

        // Ask for user input
        System.out.print("Enter your number: ");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);

        // Assign the user to String variable
        String s = scan.nextLine();

        // close the scanner object
        scan.close();

        // get the arccosec of the user input
        double acosecValue = Math.asin(1/Double.parseDouble(s));
        System.out.println("Arccosec of " + s + " is " + acosecValue + " radians");
        return acosecValue;
    }
}
