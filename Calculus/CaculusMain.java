package Calculus;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class CalculusMain {
	public void main(String[] args) {
		try{
		    calculus();
		}
		catch(InputMismatchException ex){
			error();
		}
	}
	protected abstract void error();
	protected abstract void calculus();
}
