package Calculus;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Savvas Theofilou
 * credits: @petridisa
 */
public class BinaryToHexadecimalConversion {
    
    /**
     * Checks if number is binary or contains leading zeros
     * @param binary number
     * @return true if valid, false if not
     */
    public static boolean binaryIsValid(String binary){
        boolean binaryIsValid = binary.matches("[01]+") && !binary.startsWith("0");
		if (binaryIsValid) {
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Converts binary(4bits max) to hexadecimal number
     * @param binary number 
     * @return hexadecimal number
     */
    public static String binToHex(String binary){
        if ((binary.equals("0")) || (binary.equals("00")) || (binary.equals("000")) || (binary.equals("0000"))){
            return "0";
        }
        else if ((binary.equals("1")) || (binary.equals("01")) || (binary.equals("001")) || (binary.equals("0001"))){
            return "1";
        }
        else if ((binary.equals("10")) || (binary.equals("010")) || (binary.equals("0010"))){
            return "2";
        }
        else if ((binary.equals("11")) || (binary.equals("011")) || (binary.equals("0011"))){
            return "3";
        }
        else if ((binary.equals("100")) || (binary.equals("0100"))){
            return "4";
        }
        else if ((binary.equals("101")) || (binary.equals("0101"))){
            return "5";
        }
        else if ((binary.equals("110")) || (binary.equals("0110"))){
            return "6";
        }
        else if ((binary.equals("111")) || (binary.equals("0111"))){
            return "7";
        }
        else if ((binary.equals("1000"))){
            return "8";
        }
        else if ((binary.equals("1001"))){
            return "9";
        }
        else if ((binary.equals("1010"))){
            return "A";
        }
        else if ((binary.equals("1011"))){
            return "B";
        }
        else if ((binary.equals("1100"))){
            return "C";
        }
        else if ((binary.equals("1101"))){
            return "D";
        }
        else if ((binary.equals("1110"))){
            return "E";
        }
        else{
            return "F";
        }
    }
    
    /**
     * Splits binary number into parts of 4 bits 
     * @param binary number
     * @return ArrayList<String> containing 4bit numbers
     */
    private static ArrayList<String> divideByFourBits(String binary) {
        ArrayList<String> partsOfString=new ArrayList<>();
        int lengthOfBinary=binary.length();
        
        for (int i=lengthOfBinary;i>0;i-=4){
            partsOfString.add(binary.substring(Math.max(0,i-4),i));
        }
        
        return partsOfString;
    }
    
    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String binaryNumber;
        boolean restartProgram=false;
        
        System.out.print("Please input a binary number to convert: ");
        binaryNumber=scanner.next();
            
        if (!binaryIsValid(binaryNumber)){
            restartProgram=true;
        }
        else{
            restartProgram=false;
            binaryToHexadecimalConversion(binaryNumber);
        }
        
        if (restartProgram){
            System.err.println("Please provide a valid binary number. Restart the program and try again!");
            main(new String[0]);
        }
        
    }

	private static void binaryToHexadecimalConversion(String binaryNumber) {
		String hexNumber = null;
		if (binaryNumber.length()>4){
		    ArrayList<String> tempParts=divideByFourBits(binaryNumber);
		    StringBuilder tempString=new StringBuilder();
		    for (int i=tempParts.size()-1;i>=0;i--){
		        tempString.append(binToHex(tempParts.get(i)));
		    }
		    hexNumber=tempString.toString();
		}
		else{
		    hexNumber=binToHex(binaryNumber);
		}
		
		System.out.println("Binary number: "+binaryNumber + " is equal to hexadecimal number: "+ hexNumber );
	}
    
}
