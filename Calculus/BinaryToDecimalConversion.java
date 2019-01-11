import java.util.*;

 class BinaryToDecimalConversion {

   /*
    * This method converts the binary number to the appropriate decimal number
    * and returns the decimal number
    */
    public static int conversion(int binary){
        int decimal=0,temp=1;
        while(binary>0){
            decimal+=temp*(binary%10);
            binary/=10;
            temp*=2;
        }
        
        return decimal;
    }
    
    public static void main(String[] args) {
 
    try{
    Scanner scan = new Scanner (System.in);
    
    //Prompt user for binary number to convert to decimal
    System.out.println("Please input a binary number to convert...");
    int numToConvert = scan.nextInt();
    int convertedNum=conversion(numToConvert);
    System.out.println("Binary number: "+numToConvert + " is equal to decimal number: "+ convertedNum );
  
 
    }catch(InputMismatchException ex){
      System.err.println("Please provide only numbers (no text). Restart the program and try again!");
      main(new String[0]);
    }
    
  }   

}
    

