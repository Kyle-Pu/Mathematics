package GeometryGUI.Area;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class AreaSquareComponent extends JComponent {
	private double squareSide;

	private int componentHeight;
	private int componentWidth;
	private int halfHeight;
	private int halfWidth;
	private int halfPointTwoWidth;
	private int quarterHeight;
	private int fifthHeight;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		componentHeight = this.getHeight();
		componentWidth = this.getWidth();
		halfHeight = componentHeight / 2;
		halfWidth = componentWidth / 2;
		halfPointTwoWidth = (int) (componentWidth / (2.5));
		quarterHeight = componentHeight / 4;
		fifthHeight = componentHeight / 5;

		g.setColor(Color.BLACK);
		drawShape(g);
		g.setColor(Color.RED);
		drawDimentions(g);
		g.setColor(Color.BLUE);
		drawArea(g);

	}

	// draw the rectangle
	private void drawShape(Graphics g) {
		g.drawRect(halfPointTwoWidth, quarterHeight, halfHeight, halfHeight);

	}

	// draw side
	private void drawDimentions(Graphics g) {
		g.drawString("Side = " + squareSide, halfWidth, fifthHeight);
	}

	// draw area
	private void drawArea(Graphics g) {
		g.drawString("Area = " + AreaFormulas.square(squareSide), halfWidth, halfHeight);
	}

	public void setSquareSide(double squareSide) {
		this.squareSide = squareSide;
	}

}
