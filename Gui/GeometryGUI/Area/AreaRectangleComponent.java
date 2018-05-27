package GeometryGUI.Area;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class AreaRectangleComponent extends JComponent{
	private double rectangleWidth;
	private double rectangleHeight;

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
		g.drawRect(this.getWidth()/4, (this.getHeight()/4), this.getWidth()/2, this.getHeight()/2);	
		
	}
	
	//draw height and width
		private void drawDimentions(Graphics g) {
			//draw height
			g.drawString("Height = " + rectangleHeight, this.getWidth()/8, (this.getHeight()/2));
			//draw width
			g.drawString("Width = " + rectangleWidth, this.getWidth()/2, (this.getHeight()/5));
		}
	
	//draw area
	private void drawArea(Graphics g) {
		g.drawString("Area = " + AreaFormulas.rectangle(rectangleHeight, rectangleWidth), this.getWidth()/2, (this.getHeight()/2));
	}
	
	public void setRectangleWidth(double rectangleWidth) {
		this.rectangleWidth = rectangleWidth;
	}

	public void setRectangleHeight(double rectangleHeight) {
		this.rectangleHeight = rectangleHeight;
	}


}
