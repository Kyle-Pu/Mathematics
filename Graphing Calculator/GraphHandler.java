import java.util.ArrayList;
import java.util.Scanner;

//This class is the "main" of our program. It calculates all the data points and calls 
public class GraphHandler {

	private GraphFrame frame; //The frame
	private GraphThread thread; //The thread we are running this on
	private ArrayList<Coordinate> coordinates; //A list of each coordinate to graph
	
	//Construct objects, start the thread, run the graphing function
	public GraphHandler() {
		coordinates = new ArrayList<Coordinate>();
		frame = new GraphFrame(this);
		function();
		((Thread) (thread = new GraphThread(this))).start();
	}

	//Fills the coordinates ArrayList with points based on a function
	public void function(){
		
		System.out.println(
				"Welcome to our graphing calcalculator!");
		System.out.println();
		System.out.println("Diections: When multiplying terms, always use the multiplication (*). Ex: 2x^2 should be 2*x^2");
		System.out.println();
		System.out.print("Please insert your equation in terms of x. Separate each term with a space (Ex: x^2 + 2*x + 3  \n You MUST include all signs (2x should be 2*x)): \ny = ");

		Scanner scan = new Scanner(System.in);
		
		String formula = scan.nextLine(); //The formula
		String revisedFormula = formula; //For swapping in new input values each iteration to calculate coordinates
		
		System.out.println();

		System.out.print("Left bound of your domain? ");
		double leftBound = scan.nextDouble();
		System.out.println();

		System.out.print("Right bound of your domain? ");
		double rightBound = scan.nextDouble();
		System.out.println();

		System.out.print("Step of your function (the increments at which the function is evaluated at: ");
		double step = scan.nextDouble();
		scan.close();
		
		//Algorithm to calculate coordinates
		for (double i = leftBound; i <= rightBound; i += step) {
					String input = Double.toString(i); //Take the input at the given point based on left bound, right bound, and step of the function
					revisedFormula = formula.replaceAll("x", "(" + input + ")"); //Take the original formula and replace all occurrences of 'x' with the input //Take the original formula and replace all occurrences of 'x' with the input
					coordinates.add(new Coordinate(i, eval(revisedFormula))); // Add a new coordinate to the coordinates ArrayList with data points
			}
		
		scale(leftBound, rightBound);
		
		}

	
	public void scale(double leftBound, double rightBound) {
		getGraphFrame().getGraphPanel().setXScale(rightBound - leftBound + 20);
	}
	
	
	//The thread will run this update function which repaints the GraphPanel
	public void update() {
		// Paint canvas
		getGraphFrame().getGraphPanel().repaint();
	}
	
	//Author: https://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form
		private static double eval(final String str) {
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

	public GraphFrame getGraphFrame() {
		return frame;
	}

	public GraphThread getGraphThread() {
		return thread;
	}

	public ArrayList<Coordinate> getCoordinates() {
		return coordinates;
	}

}
