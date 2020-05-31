import java.awt.*;
import javax.swing.*;

//A JPanel we put inside the JFrame to contain the graph
public  class GraphPanel extends JPanel{

		private GraphHandler handler;
		private double xScale = 50; //Allows you to fit more points on screen 
		private double yScale = 10; //How many intervals of y there are
		private int xOffset = 500; //Controls where center of graph should be
		private int yOffset = 500; //This would be halfway because 500 pix / 1000 pix
		
		public GraphPanel(GraphHandler handler){
			this.handler = handler;
		}

		public void setXScale(double scale) {
			this.xScale = scale;
		}
		
		public void setYScale(double scale) {
			this.yScale = scale;
		}
		
		@Override
		public void paintComponent(Graphics graphics){
			
      		Point currentPoint = getMouseLocation();
      		int mouseX = (int) (currentPoint.getX());
      		int mouseY = (int) (currentPoint.getY());

			changeOrigin(mouseX, mouseY);
    
			Graphics2D graphics2d = (Graphics2D) graphics;
			
			graphicsInitialize(graphics2d);
			
			for(Coordinate coordinate: handler.getCoordinates()){ 
				double y = calculateY(coordinate);
				drawRectangle(graphics2d, coordinate, y);
			}
			
			drawAxisXY(graphics2d);

		}

		private void changeOrigin(int mouseX, int mouseY) {
			xOffset = (int)(mouseX-getLocationOnScreen().getX()); 
			yOffset = (int)(mouseY-getLocationOnScreen().getY());
		}

		private Point getMouseLocation() {
			return MouseInfo.getPointerInfo().getLocation();
		}

		private void drawAxisXY(Graphics2D graphics2d) {
			graphics2d.drawLine(xOffset, this.getHeight(), xOffset, 0); 
			graphics2d.drawLine(0, yOffset, this.getWidth(), yOffset);
		}

		private double calculateY(Coordinate c) {
			double y = yOffset - (yScale * c.getY()); //Figure out where to put it on screen based on scale, offset and actual coordinate
			return y;
		}

		private void drawRectangle(Graphics2D graphics2d, Coordinate c, double y) {
			graphics2d.fillRect((int)(c.getX() * xScale)+xOffset, (int)y, 5, 5);  //Draw a tiny rectangle for each point, w = 5, h = 5
		}

		private void graphicsInitialize(Graphics2D graphics2d) {
			graphics2d.setColor(Color.WHITE); //Set the paint color to white
			graphics2d.fillRect(0, 0, this.getWidth(), this.getHeight()); //Clear out the screen with black
			graphics2d.setColor(Color.BLUE); //Set paint color to blue
		}

	}
