package GeometryGUI.Area;

/**
 * This class contains methods that return the area's of different shapes.
 * 
 * @author scohen40
 */
public class AreaFormulas {

	public static double rectangle(double height, double width) {
		return height * width;
	}

	public static double circle(double radius) {
		return radius * radius * Math.PI;
	}

	public static double triangle(double length, double height) {
		return 0.5 * length * height;
	}

	public static double square(double side) {
		return side * side;
	}
}