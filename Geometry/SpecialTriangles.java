import static java.lang.Math.sqrt;
import static java.lang.System.exit;
import java.util.InputMismatchException;
import java.util.Scanner;


public class SpecialTriangles {
    public static void main(String[] args) {
        
    try{
        Scanner scan = new Scanner (System.in);
    
        System.out.println("Special Triangles");
        //Prompt user to choose a special triangle 
        System.out.println("Choose what you want:\n 1:45 45 90 triangle \n 2:30 60 90 triangle");
        int choise = scan.nextInt();
        if(choise!=1 && choise!=2 )
           throw new InputMismatchException();
        switch(choise){
                case 1: triangle45();break;
                case 2: triangle6090();break;
                
        }
                
                
        
        
}
    catch (InputMismatchException ex){
        System.err.println("Please choose between 1 or 2. Restart the program and try again!");
        main(new String[0]);
    }
}

    private static void triangle45() {
        Scanner scan =new Scanner(System.in);
        //Prompt user to give the known side
        System.out.println("The known side is opposite to: \n 1:45 degrees \n 2:90 degrees");
        System.out.println("Choose 1 or 2!");
        int choise=scan.nextInt();
        if(choise!=1 && choise!=2 ){
            System.err.println("Choose only between 1 or 2"); 
            triangle45();
            exit(0);
        }
           
        //Prompt user to give the value of the known side
        System.out.println("Give the value of the known side");
        int side = scan.nextInt();
        double a=0,b=0;
        switch(choise){
            case 1:a=side;b=side*sqrt(2);break;
            case 2:a=side/sqrt(2);b=side;break;
        }
        System.out.println("The side of the triangle are "+a +" "+ a+" "+b);
        
    }

    private static void triangle6090() {
        Scanner scan =new Scanner(System.in);
        //Prompt user to give the known side
        System.out.println("The known side is opposite to: \n 1:30 degrees \n 2:60 degrees \n 3:90 degrees");
        System.out.println("Choose 1, 2 or 3!");
        int choise=scan.nextInt();
        if(choise!=1 && choise!=2 && choise !=3){
            System.err.println("Choose only between 1 or 2 or 3"); 
            triangle6090();
            exit(0);
        }
           
        //Prompt user to give the value of the known side
        System.out.println("Give the value of the known side");
        int side = scan.nextInt();
        double a=0,b=0,c=0;
        switch(choise){
            case 1:a=side;b=side*sqrt(3);c=2*side;break;
            case 2:a=side/sqrt(3);b=side;c=2*a;break;
            case 3:a=side/2;b=a*sqrt(3);c=side;
        }
        System.out.println("The side of the triangle are "+a +" "+ b+" "+c);
        
    }

}
