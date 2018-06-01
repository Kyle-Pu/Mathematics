package GeometryGUI.Area;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class AreaCircleComponent extends JComponent {
	private double circleRadius;

	private int componentHeight;
	private int componentWidth;
	private int halfHeight;
	private int halfWidth;
	private int halfPointTwoWidth;
	private int thirdWidth;
	private int thirdHeight;
	private int quarterHeight;
	private int quarterWidth;
	private int fifthHeight;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		componentHeight = this.getHeight();
		componentWidth = this.getWidth();
		halfHeight = componentHeight / 2;
		halfWidth = componentWidth / 2;
		halfPointTwoWidth = (int) (componentWidth / (2.5));
		thirdWidth = componentWidth / 3;
		thirdHeight = componentHeight / 3;
		quarterHeight = componentHeight / 4;
		quarterWidth = componentWidth / 4;
		fifthHeight = componentHeight / 5;

		g.setColor(Color.BLACK);
		drawShape(g);
		g.setColor(Color.RED);
		drawDimentions(g);
		g.setColor(Color.BLUE);
		drawArea(g);

	}

	// draw the circle and its radius
	private void drawShape(Graphics g) {
		g.drawOval(halfPointTwoWidth, quarterHeight, halfHeight, halfHeight);
	}

	// draw radius
	private void drawDimentions(Graphics g) {
		g.drawString("Radius = " + circleRadius, quarterWidth, halfHeight);
	}

	// draw area
	private void drawArea(Graphics g) {
		g.drawString("Area = " + AreaFormulas.circle(circleRadius), halfWidth, fifthHeight);
	}

	public void setCircleRadius(double circleRadius) {
		this.circleRadius = circleRadius;
	}

}
