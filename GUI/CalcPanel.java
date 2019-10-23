import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public  class CalcPanel extends JPanel{

		private CalcHandler handler;


		public CalcPanel(CalcHandler handler){
			this.handler = handler;
		}


		@Override
		public void paintComponent(Graphics g){
      //set up graphics
			Graphics2D g2d = (Graphics2D) g;

      /*get mouse info
			PointerInfo a = MouseInfo.getPointerInfo();
      Point b = a.getLocation();
      int mouseX = (int) (b.getX());
      int mouseY = (int) (b.getY());
      System.out.println("("+mouseX+","+mouseY+")");
      */
      //clear
			g2d.setColor(Color.BLACK);
			g2d.fillRect(0, 0, this.getWidth(), this.getHeight());

		}

	}
