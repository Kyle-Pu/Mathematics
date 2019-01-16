package binarytohexadecimalconversion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Savvas Theofilou
 * credits: @petridisa
 */
public class BinaryToHexadecimalConversion {
    
    /**
     * Checks if number is binary or contains leading zeros
     * @param myBinary binary number
     * @return true if valid, false if not
     */
    public static boolean binaryIsValid(String myBinary){
        if (myBinary.matches("[01]+") && !myBinary.startsWith("0")) {
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Converts binary(4bits max) to hexadecimal number
     * @param myBinary binary number 
     * @return hexadecimal number
     */
    public static String binToHex(String myBinary){
        if ((myBinary.equals("0")) || (myBinary.equals("00")) || (myBinary.equals("000")) || (myBinary.equals("0000"))){
            return "0";
        }
        else if ((myBinary.equals("1")) || (myBinary.equals("01")) || (myBinary.equals("001")) || (myBinary.equals("0001"))){
            return "1";
        }
        else if ((myBinary.equals("10")) || (myBinary.equals("010")) || (myBinary.equals("0010"))){
            return "2";
        }
        else if ((myBinary.equals("11")) || (myBinary.equals("011")) || (myBinary.equals("0011"))){
            return "3";
        }
        else if ((myBinary.equals("100")) || (myBinary.equals("0100"))){
            return "4";
        }
        else if ((myBinary.equals("101")) || (myBinary.equals("0101"))){
            return "5";
        }
        else if ((myBinary.equals("110")) || (myBinary.equals("0110"))){
            return "6";
        }
        else if ((myBinary.equals("111")) || (myBinary.equals("0111"))){
            return "7";
        }
        else if ((myBinary.equals("1000"))){
            return "8";
        }
        else if ((myBinary.equals("1001"))){
            return "9";
        }
        else if ((myBinary.equals("1010"))){
            return "A";
        }
        else if ((myBinary.equals("1011"))){
            return "B";
        }
        else if ((myBinary.equals("1100"))){
            return "C";
        }
        else if ((myBinary.equals("1101"))){
            return "D";
        }
        else if ((myBinary.equals("1110"))){
            return "E";
        }
        else{
            return "F";
        }
    }
    
    /**
     * Splits binary number into parts of 4 bits 
     * @param myBinary binary number
     * @return ArrayList<String> containing 4bit numbers
     */
    private static ArrayList<String> getParts(String myBinary) {
        ArrayList<String> partsOfString=new ArrayList<>();
        int lengthOfBinary=myBinary.length();
        
        for (int i=lengthOfBinary;i>0;i-=4){
            partsOfString.add(myBinary.substring(Math.max(0,i-4),i));
        }
        
        return partsOfString;
    }
    
    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        String binaryNumber;
        boolean restartProgram=false;
        
        
        //Prompt user to input a binary number
        System.out.print("Please input a binary number to convert: ");
        binaryNumber=myScanner.next();
            
        if (!binaryIsValid(binaryNumber)){
            restartProgram=true;
        }
        else{
            restartProgram=false;
            String hexNumber = null;
            if (binaryNumber.length()>4){
                ArrayList<String> tempParts=getParts(binaryNumber);
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
        
        if (restartProgram){
            System.err.println("Please provide a valid binary number. Restart the program and try again!");
            main(new String[0]);
        }
        
    }
    
}
