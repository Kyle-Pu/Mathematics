package Algebra;

import java.util.InputMismatchException;
import java.util.Scanner;


public class lcm {
	static int a;
	static int b;
    public static int lcm(int a,int b){
       int temp=b;
        while(temp%a!=0){
           
           temp+=b;
       }
        return temp;
    }
    
public static void main(String[] args){
    try{
	    new lcm().prepare();
		int lcm=lcm(a,b);
	    System.out.println("Least Common Multiple of "+a+" and "+b+" is: "+lcm);
	    
    }catch (InputMismatchException ex){
        System.err.println("Please give two positive integer numbers. Restart the program and try again!");
        main(new String[0]);
    }
}    

public void prepare() {
	Scanner scan=new Scanner(System.in);
    //Prompt user to give two integer numbers:
        System.out.println("Give two positive integer numbers!");
    a=scan.nextInt();
    b=scan.nextInt();
    if(a<0 || b<0)throw(new InputMismatchException());
}

}
