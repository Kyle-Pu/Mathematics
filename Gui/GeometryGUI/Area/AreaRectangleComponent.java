package GeometryGUI.Area;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class AreaRectangleComponent extends JComponent {
	private double rectangleWidth;
	private double rectangleHeight;

	private int componentHeight;
	private int componentWidth;
	private int halfHeight;
	private int halfWidth;
	private int quarterHeight;
	private int quarterWidth;
	private int fifthHeight;
	private int eightWidth;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		componentHeight = this.getHeight();
		componentWidth = this.getWidth();
		halfHeight = componentHeight / 2;
		halfWidth = componentWidth / 2;
		quarterHeight = componentHeight / 4;
		quarterWidth = componentWidth / 4;
		fifthHeight = componentHeight / 5;
		eightWidth = componentWidth / 8;

		g.setColor(Color.BLACK);
		drawShape(g);
		g.setColor(Color.RED);
		drawDimentions(g);
		g.setColor(Color.BLUE);
		drawArea(g);

	}

	// draw the rectangle
	private void drawShape(Graphics g) {
		g.drawRect(quarterWidth, quarterHeight, halfWidth, halfHeight);

	}

	// draw height and width
	private void drawDimentions(Graphics g) {
		// draw height
		g.drawString("Height = " + rectangleHeight, eightWidth, halfHeight);
		// draw width
		g.drawString("Width = " + rectangleWidth, halfWidth, fifthHeight);
	}

	// draw area
	private void drawArea(Graphics g) {
		g.drawString("Area = " + AreaFormulas.rectangle(rectangleHeight, rectangleWidth), halfWidth, halfHeight);
	}

	public void setRectangleWidth(double rectangleWidth) {
		this.rectangleWidth = rectangleWidth;
	}

	public void setRectangleHeight(double rectangleHeight) {
		this.rectangleHeight = rectangleHeight;
	}

}
