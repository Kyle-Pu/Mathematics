package GeometryGUI.Area;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class AreaTriangleComponent extends JComponent{
	private double triangleLength;
	private double triangleHeight;
	
	private int componentHeight = this.getHeight();
	private int componentWidth = this.getWidth();
	private int halfHeight = componentHeight/2;
	private int halfWidth = componentWidth/2;
	private int quarterHeight = componentHeight/4;
	private int quarterWidth = componentWidth/4;	
	private int threeQuarterWidth = 3*quarterWidth;
	private int threeQuarterHeight = 3*quarterHeight;
	private int fifthHeight = componentHeight/5;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		drawShape(g);
		g.setColor(Color.RED);
		drawDimentions(g);
		g.setColor(Color.BLUE);
		drawArea(g);

	}

	//draw the rectangle
	private void drawShape(Graphics g) {
		g.drawLine(halfWidth, quarterHeight, threeQuarterWidth, threeQuarterHeight);
		g.drawLine(threeQuarterWidth, threeQuarterHeight, quarterWidth, threeQuarterHeight);
		g.drawLine(quarterWidth, threeQuarterHeight, halfWidth, quarterHeight);
		g.drawLine(halfWidth, quarterHeight, halfWidth, threeQuarterHeight);
		
	}
	
	//draw height and length
	private void drawDimentions(Graphics g) {
		g.drawString("Height = " + triangleHeight, quarterWidth, halfHeight);
		g.drawString("Length = " + triangleLength, halfWidth, (int)(4.5*fifthHeight));
	}
	
	//draw area
	private void drawArea(Graphics g) {
		g.drawString("Area = " + AreaFormulas.triangle(triangleLength, triangleHeight), halfWidth, fifthHeight);
	}
	
	public void setTriangleLength(double triangleLength) {
		this.triangleLength = triangleLength;
	}

	public void setTriangleHeight(double triangleHeight) {
		this.triangleHeight = triangleHeight;
	}



}
