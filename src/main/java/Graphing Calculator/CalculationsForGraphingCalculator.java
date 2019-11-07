import java.util.Scanner;

public class CalculationsForGraphingCalculator {

	public static void main(String[] args) {

		System.out.println(
				"Welcome to the data points calculator! This program creates a table of values based on a given formula.");
		System.out.println();
		System.out.print("Please insert your equation in terms of x. Separate each term with a space (Ex: x^2 + 2*x + 3   You MUST include all signs (2x should be 2*x)): y = ");

		Scanner scan = new Scanner(System.in);
		String formula = scan.nextLine();
		String revisedFormula = formula;
		
		System.out.println();

		System.out.print("Left bound of your domain? ");
		double leftBound = scan.nextDouble();

		System.out.println();

		System.out.print("Right bound of your domain? ");
		double rightBound = scan.nextDouble();

		System.out.println();

		System.out.print("Step of your function (the increments at which the function is evaluated at: ");
		double step = scan.nextDouble();

		System.out.println("     x     " + "          y");
		System.out.println("_____________________________");
		
		for (double i = leftBound; i <= rightBound; i += step) {

			String input = Double.toString(i);
			revisedFormula = formula.replaceAll("x", input);
			System.out.println(input + "     |     " + eval(revisedFormula));
			
		}
		
		scan.close();

	}

	//https://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form
	public static double eval(final String str) {
	    return new Object() {
	        int pos = -1, ch;

	        void nextChar() {
	            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
	        }

	        boolean eat(int charToEat) {
	            while (ch == ' ') nextChar();
	            if (ch == charToEat) {
	                nextChar();
	                return true;
	            }
	            return false;
	        }

	        double parse() {
	            nextChar();
	            double x = parseExpression();
	            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
	            return x;
	        }

	        // Grammar:
	        // expression = term | expression `+` term | expression `-` term
	        // term = factor | term `*` factor | term `/` factor
	        // factor = `+` factor | `-` factor | `(` expression `)`
	        //        | number | functionName factor | factor `^` factor

	        double parseExpression() {
	            double x = parseTerm();
	            for (;;) {
	                if      (eat('+')) x += parseTerm(); // addition
	                else if (eat('-')) x -= parseTerm(); // subtraction
	                else return x;
	            }
	        }

	        double parseTerm() {
	            double x = parseFactor();
	            for (;;) {
	                if      (eat('*')) x *= parseFactor(); // multiplication
	                else if (eat('/')) x /= parseFactor(); // division
	                else return x;
	            }
	        }

	        double parseFactor() {
	            if (eat('+')) return parseFactor(); // unary plus
	            if (eat('-')) return -parseFactor(); // unary minus

	            double x;
	            int startPos = this.pos;
	            if (eat('(')) { // parentheses
	                x = parseExpression();
	                eat(')');
	            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
	                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
	                x = Double.parseDouble(str.substring(startPos, this.pos));
	            } else if (ch >= 'a' && ch <= 'z') { // functions
	                while (ch >= 'a' && ch <= 'z') nextChar();
	                String func = str.substring(startPos, this.pos);
	                x = parseFactor();
	                if (func.equals("sqrt")) x = Math.sqrt(x);
	                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
	                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
	                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
	                else throw new RuntimeException("Unknown function: " + func);
	            } else {
	                throw new RuntimeException("Unexpected: " + (char)ch);
	            }

	            if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

	            return x;
	        }
	    }.parse();
	}
	
}
