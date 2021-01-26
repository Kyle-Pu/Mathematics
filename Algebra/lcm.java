
import java.util.InputMismatchException;
import java.util.Scanner;


public class lcm {

    
    public static int lcm(int a,int b){
       int temp=b;
        while(temp%a!=0){
           
           temp+=b;
       }
        return temp;
    }

public static void main(String[] args){
    
    
    try{
        Scanner scan=new Scanner(System.in);
    //Prompt user to give two integer numbers:
        System.out.println("Give two positive integer numbers!");
    int a=scan.nextInt();
    int b=scan.nextInt();
    if(a<0 || b<0)throw(new InputMismatchException());
    int lcm=lcm(a,b);
        System.out.println("Least Common Multiple of "+a+" and "+b+" is: "+lcm);
        
    
    }catch (InputMismatchException ex){
        System.err.println("Please give two positive integer numbers. Restart the program and try again!");
        main(new String[0]);
    }
}    
}
