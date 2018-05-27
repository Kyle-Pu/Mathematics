
public class Rectangle {
	private double height;
	private double width;
	private double area;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = AreaFormulas.rectangle(height, width);
	}
	
}
