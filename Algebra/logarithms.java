

import java.util.InputMismatchException;
import java.util.Scanner;
import static javafx.application.Platform.exit;


public class logarithms {
    
    public static void logarithm(int base){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please input a number to get its logarithm...");
        int num=scan.nextInt();
        int temp=num,log=0;
        while(temp>0){
            temp/=base;
            log++;
        }
        if(num%base==0)log--;     
        System.out.println("The logarithm of "+ num+" with base "+base+" is "+log);
        
    }
    
public static void main(String[] args) {
    
    

    try{
        Scanner scan = new Scanner (System.in);
    
    //Prompt user for a decimal number to convert to binary
    System.out.println("Choose which base you prefer: 2 or 10 ");
    int base = scan.nextInt();
    switch (base){
        case 2 : logarithm(base);break;
        case 10: logarithm(base);break;
        default: System.out.println("Invalid Choice.\nExiting");exit();
    }    
    }
    catch (InputMismatchException ex){
      System.err.println("Please provide only numbers (no text). Restart the program and try again!");
      main(new String[0]);
    }


}
    
}
