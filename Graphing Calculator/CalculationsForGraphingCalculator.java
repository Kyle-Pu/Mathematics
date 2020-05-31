import java.util.Scanner;

public class CalculationsForGraphingCalculator {

	public static void main(String[] args) {

		printDirections();


		String formula = getFormula();
		String revisedFormula = formula;
		
		double leftBound = getLeftBound();

		double rightBound = getRightBound();

		double step = getStep();
		
		for (double i = leftBound; i <= rightBound; i += step) {

			String input = Double.toString(i);
			revisedFormula = formula.replaceAll("x", input);
			System.out.println(input + "     |     " + evaluate(revisedFormula));
			
		}
		

	}

	private static String getFormula() {
		Scanner scan = new Scanner(System.in);
		String formula = scan.nextLine();
		return formula;
	}

	private static double getStep() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Step of your function (the increments at which the function is evaluated at: ");
		double step = scan.nextDouble();

		System.out.println("     x     " + "          y");
		System.out.println("_____________________________");
		return step;
	}

	private static double getRightBound() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Right bound of your domain? ");
		double rightBound = scan.nextDouble();

		System.out.println();
		return rightBound;
	}

	private static double getLeftBound() {
		Scanner scan = new Scanner(System.in);
		System.out.println();

		System.out.print("Left bound of your domain? ");
		double leftBound = scan.nextDouble();

		System.out.println();
		return leftBound;
	}

	private static void printDirections() {
		System.out.println(
				"Welcome to the data points calculator! This program creates a table of values based on a given formula.");
		System.out.println();
		System.out.print("Please insert your equation in terms of x. Separate each term with a space (Ex: x^2 + 2*x + 3   You MUST include all signs (2x should be 2*x)): y = ");
	}
	
	//Author: https://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form
	private static double evaluate(final String mathExpression) {
	    return new Object() {
	        int position = -1, aChar;

	        void nextChar() {
	            aChar = getNextChar(mathExpression);
	        }

			private int getNextChar(final String mathExpression) {
				return (++position < mathExpression.length()) ? mathExpression.charAt(position) : -1;
			}

	        boolean eat(int charToEat) {
	            while (aChar == ' ') nextChar();
	            if (aChar == charToEat) {
	                nextChar();
	                return true;
	            }
	            return false;
	        }

	        double parse() {
	            nextChar();
	            double result = parseExpression();
	            if (position < mathExpression.length())
					unexpectedCharError();
	            return result;
	        }

	        // Grammar:
	        // expression = term | expression `+` term | expression `-` term
	        // term = factor | term `*` factor | term `/` factor
	        // factor = `+` factor | `-` factor | `(` expression `)`
	        //        | number | functionName factor | factor `^` factor

	        double parseExpression() {
	            double result = parseTerm();
	            for (;;) {
	                if      (eat('+')) result += parseTerm(); // addition
	                else if (eat('-')) result -= parseTerm(); // subtraction
	                else return result;
	            }
	        }

	        double parseTerm() {
	            double result = parseFactor();
	            for (;;) {
	                if      (eat('*')) result *= parseFactor(); // multiplication
	                else if (eat('/')) result /= parseFactor(); // division
	                else return result;
	            }
	        }

	        double parseFactor() {
	        	boolean isUnaryPlus=eat('+');
	        	boolean isUnaryMinus=eat('-');
	        	
	            if (isUnaryPlus) return parseFactor();
	            if (isUnaryMinus) return -parseFactor(); 

	            double result;
	            int startPos = this.position;
	            boolean isParentheses = eat('(');
	            boolean isNumbers = (aChar >= '0' && aChar <= '9') || aChar == '.';
	            boolean isFunctions = aChar >= 'a' && aChar <= 'z';
	            boolean isExponentiation = eat('^');
	            
	            if (isParentheses) { 
	                result = parseExpression();
	                eat(')');
	            } else if (isNumbers) {
	                while (isNumbers) nextChar();
	                result = changeToDouble(getSubString(mathExpression, startPos));
	            } else if (isFunctions) {
	                while (isFunctions) nextChar();
	                String function = getSubString(mathExpression, startPos);
	                result = parseFactor();
	                if (function.equals("sqrt")) result = Math.sqrt(result);
	                else if (function.equals("sin")) result = Math.sin(changeToRadians(result));
	                else if (function.equals("cos")) result = Math.cos(changeToRadians(result));
	                else if (function.equals("tan")) result = Math.tan(changeToRadians(result));
	                else throw new RuntimeException("Unknown function: " + function);
	            } else {
	                throw new RuntimeException("Unexpected: " + (char)aChar);
	            }

	            if (isExponentiation) result = getExponentiation(result); 

	            return result;
	        }

			private double changeToRadians(double result) {
				return Math.toRadians(result);
			}

			private String getSubString(final String mathExpression, int startPos) {
				return mathExpression.substring(startPos, this.position);
			}

			private double changeToDouble(final String Expression) {
				return Double.parseDouble(Expression);
			}

			private double getExponentiation(double result) {
				return Math.pow(result, parseFactor());
			}

			private void unexpectedCharError() {
				throw new RuntimeException("Unexpected: " + (char)aChar);
			}
	    }.parse();
	}
	
}
