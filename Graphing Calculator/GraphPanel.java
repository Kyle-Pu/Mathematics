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
		//How we actually draw the points and lines
		public void paintComponent(Graphics g){
			
			//Get the mouse location and store x and y to mouseX and mouseY
			PointerInfo a = MouseInfo.getPointerInfo();
      			Point b = a.getLocation();
      			int mouseX = (int) (b.getX());
      			int mouseY = (int) (b.getY());

			xOffset = (int)(mouseX-getLocationOnScreen().getX()); //Change location of the origin based on position of mouse
			yOffset = (int)(mouseY-getLocationOnScreen().getY());;
    
			//Create a graphics component
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(Color.WHITE); //Set the paint color to white
			g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); //Clear out the screen with black
			g2d.setColor(Color.BLUE); //Set paint color to blue
			
			for(Coordinate c: handler.getCoordinates()){  //For each coordinate in the coordinate list from the handler
				double y = yOffset - (yScale * c.getY()); //Figure out where to put it on screen based on scale, offset and actual coordinate
				g2d.fillRect((int)(c.getX() * xScale)+xOffset, (int)y, 5, 5);  //Draw a tiny rectangle for each point, w = 5, h = 5
			}
			
			g2d.drawLine(xOffset, this.getHeight(), xOffset, 0);  //Draw the x and y axis
			g2d.drawLine(0, yOffset, this.getWidth(), yOffset);

		}

	}
