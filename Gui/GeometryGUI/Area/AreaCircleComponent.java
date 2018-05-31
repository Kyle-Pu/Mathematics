package GeometryGUI.Area;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class AreaCircleComponent extends JComponent{
	private double circleRadius;
	
	private int componentHeight = this.getHeight();
	private int componentWidth = this.getWidth();
	private int halfHeight = componentHeight/2;
	private int halfWidth = componentWidth/2;
	private int quarterHeight = componentHeight/4;
	private int quarterWidth = componentWidth/4;	
	private int fifthWidth = componentWidth/5;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		drawShape(g);
		g.setColor(Color.RED);
		drawDimentions(g);
		g.setColor(Color.BLUE);
		drawArea(g);

	}

	//draw the circle and its radius
	private void drawShape(Graphics g) {
		g.drawOval( quarterWidth, quarterHeight, halfWidth, halfHeight);	
		g.drawLine(quarterWidth, halfHeight, halfWidth, halfHeight);
	}
	
	//draw radius
	private void drawDimentions(Graphics g) {
		g.drawString("Radius = " + circleRadius, quarterWidth, halfHeight);
	}
	
	//draw area
	private void drawArea(Graphics g) {
		g.drawString("Area = " + AreaFormulas.circle(circleRadius), halfWidth, fifthWidth);
	}
	
	public void setCircleRadius(double circleRadius) {
		this.circleRadius = circleRadius;
	}


}
