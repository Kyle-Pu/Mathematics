
import java.util.InputMismatchException;
import java.util.Scanner;


public class perimetry {
    
    public static Scanner scan= new Scanner(System.in);
    
    public static int square(){
        System.out.println("Give the length of the side of the square: ");
        int side=scan.nextInt();
        //Perimetry of square is 4 times the side
        return side*4;
    }
    public static int rectangle(){
        System.out.println("Give the length of the height of the rectangle: ");
        int height=scan.nextInt();
        System.out.println("Give the length of the width of the rectangle: ");
        int width=scan.nextInt();
        //Perimetry of rectangle is 2 times the sum of height and width
        return (height+width)*2;
    }
    public static double circle(){
        System.out.println("Give the length of the radius: ");
        int radius=scan.nextInt();
        //Perimetry of circle is 2pr
        return radius*3.14*2;
    }
    public static int triangle(){
        System.out.println("Give the length of side1 of the triangle ");
        int a=scan.nextInt();
        System.out.println("Give the length of side2 of the triangle ");
        int b=scan.nextInt();
        System.out.println("Give the length of side3 of the triangle ");
        int c=scan.nextInt();
        //perimetry of triangle is the sum of the 3 sides
        return a+b+c;
    }
    
    
    public static void main(String[] args){
        try{
       
        
        //Prompt user for which shape to calculate the perimeter of
        System.out.println("Which shape do you choose: \n 1.Square \n 2.Rectangle \n 3.Circle \n 4.Triangle");
        System.out.println("Choose 1, 2, 3 or 4!");
        int n=scan.nextInt();
        String shape;
        int per=0;
        double p=0;
        //If user give a number different to 1,2,3,4 the program should end with an error message
        if(n>4||n<1)throw(new InputMismatchException());
        switch(n){
            case 1:per=square();shape="square";break;
            case 2:per=rectangle();shape="rectangle";break;
            case 3:p=circle();shape="circle";break;
            case 4:per=triangle();shape="triangle";break;
            default: throw(new InputMismatchException());
        }
       
            
            System.out.print("Perimeter of "+shape+ " is ");
            //perimetry of circle is a double number 
            if(n==3)System.out.println(p);
            else System.out.println(per);
        }catch (InputMismatchException ex){
        System.err.println("Please give numbers as it is prompted. Restart the program and try again!");
       }
    }
}
