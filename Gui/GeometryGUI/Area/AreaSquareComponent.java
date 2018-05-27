package GeometryGUI.Area;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class AreaSquareComponent extends JComponent{
	private double side;

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
		g.drawRect((int) (this.getWidth()/(2.5)), this.getHeight()/4, this.getHeight()/2, this.getHeight()/2);	
		
	}
	
	//draw side
		private void drawDimentions(Graphics g) {
			g.drawString("Side = " + side, this.getWidth()/2, (this.getHeight()/5));
		}
	
	//draw area
	private void drawArea(Graphics g) {
		g.drawString("Area = " + AreaFormulas.square(side), this.getWidth()/2, (this.getHeight()/2));
	}
	
	public void setSide(double side) {
		this.side = side;
	}



}
