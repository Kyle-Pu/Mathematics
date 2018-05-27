package GeometryGUI.Area;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class AreaTriangleComponent extends JComponent{
	private double length;
	private double height;

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
		int w = this.getWidth();
		int h = this.getHeight();
		g.drawLine(w/2, h/4, 3*(w/4), 3*(h/4));
		g.drawLine(3*(w/4), 3*(h/4), w/4, 3*(h/4));
		g.drawLine(w/4, 3*(h/4), w/2, h/4);
		g.drawLine(w/2, h/4, w/2, 3*(h/4));
		
	}
	
	//draw height and length
	private void drawDimentions(Graphics g) {
		g.drawString("Height = " + height, this.getWidth()/4, (this.getHeight()/2));
		g.drawString("Length = " + length, this.getWidth()/2, (int)(4.5*(this.getHeight()/5)));
	}
	
	//draw area
	private void drawArea(Graphics g) {
		g.drawString("Area = " + AreaFormulas.triangle(length, height), this.getWidth()/2, (this.getHeight()/5));
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	public void setHeight(double height) {
		this.height = height;
	}



}
