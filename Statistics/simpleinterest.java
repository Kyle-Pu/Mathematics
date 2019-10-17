// finding simple interest 
// contributed by @shubham-ahuja13
import java.util.Scanner;

public class simpleinterest
{
    public static void main( String[] args)
{
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter Principle");
    int p=scn.nextInt();
    System.out.println("Enter Rate");
    int r=scn.nextInt();
    System.out.println("Enter Time");
    int t=scn.nextInt();
    int si=(p*r*t)/100;
    System.out.println("Simple interest is " +si );
    scn.close();
 }
} 
