import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DecimalToBinaryConversion {
    
   /*
    * This method converts the decimal number to the appropriate binary number
    * and returns the binary number
    */
    public static ArrayList<Integer> conversion(int decimal){
        ArrayList<Integer> binary =new ArrayList<>();
        int temp=1;
        while(decimal>0){
            binary.add(0,decimal%2);
            decimal/=2;            
        }
        
        return binary;
    }
   /*
    * This method prints the converted number
    */
    public static void print(ArrayList<Integer> convertedNum){
        for(int i:convertedNum)
            System.out.print(i);
        System.out.println("");
    }
    
    public static void main(String[] args) {
 
    try{
    Scanner scan = new Scanner (System.in);
    
    //Prompt user for a decimal number to convert to binary
    System.out.println("Please input a decimal number to convert...");
    int numToConvert = scan.nextInt();
    ArrayList <Integer> convertedNum=conversion(numToConvert);
    System.out.print("Decimal number: "+numToConvert + " is equal to binary number: ");
    print(convertedNum);
  
 
    }catch(InputMismatchException ex){
      System.err.println("Please provide only numbers (no text). Restart the program and try again!");
      main(new String[0]);
    }
    
  }   
}
