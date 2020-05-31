// finding simple interest 
// contributed by @shubham-ahuja13
import java.util.Scanner;

public class simpleinterest
{
    public static void main(String[] args){
	    
	    printSimpleinterest( getSimpleInterest( getPrinciple(), getRate(), getTime() ) );
	    
	    }

	private static void printSimpleinterest(int simpleinterest) {
		System.out.println( "Simple interest is " + simpleinterest );
	}

    private static int getSimpleInterest(int principle, int rate, int time) {
		int simpleinterest=(principle*rate*time)/100;
		return simpleinterest;
	}

	private static int getTime() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Time");
		int time=scn.nextInt();
		return time;
	}

	private static int getRate() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Rate");
		int rate=scn.nextInt();
		return rate;
	}

	private static int getPrinciple() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Principle");
		int principle=scn.nextInt();
		return principle;
	}
} 
