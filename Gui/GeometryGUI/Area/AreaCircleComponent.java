package GeometryGUI.Area;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class AreaCircleComponent extends JComponent{
	private double radius;
	
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
		int w = this.getWidth();
		int h = this.getHeight();
		g.drawOval( this.getWidth()/4, this.getHeight()/4 , this.getWidth()/2, this.getHeight()/2);	
		g.drawLine(this.getWidth()/4, this.getHeight()/2, this.getWidth()/2, this.getHeight()/2);
	}
	
	//draw radius
	private void drawDimentions(Graphics g) {
		g.drawString("Radius = " + radius, this.getWidth()/4, (this.getHeight()/2));
	}
	
	//draw area
	private void drawArea(Graphics g) {
		g.drawString("Area = " + AreaFormulas.circle(radius), this.getWidth()/2, (this.getHeight()/5));
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}


}
