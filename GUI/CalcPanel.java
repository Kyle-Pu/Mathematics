package GUI;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public  class CalcPanel extends JPanel{
	private CalcHandler handler;

	public CalcPanel(CalcHandler handler){
		this.handler = handler;
	}
	
	@Override
	public void paintComponent(Graphics graphics){
		Graphics2D graphics2D = (Graphics2D) graphics;

      /*get mouse info
			PointerInfo a = MouseInfo.getPointerInfo();
      Point b = a.getLocation();
      int mouseX = (int) (b.getX());
      int mouseY = (int) (b.getY());
      System.out.println("("+mouseX+","+mouseY+")");
      */
      //clear
		graphics2D.setColor(Color.BLACK);
		graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}
