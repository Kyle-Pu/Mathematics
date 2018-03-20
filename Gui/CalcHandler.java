import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class CalcHandler{

		private CalcFrame frame;
		private CalcThread thread;


		public CalcHandler(){
			frame = new CalcFrame(this);
			((Thread)(thread = new CalcThread(this))).start();

		}

		public void update(){
      PointerInfo a = MouseInfo.getPointerInfo();
      Point b = a.getLocation();
      int mouseX = (int) (b.getX());
      int mouseY = (int) (b.getY());
      //the actual code that actually does stuff!

      for(JButton j: getCalcFrame().getNumpad()){
        if(j.getModel().isPressed()){
          System.out.println(j.getText());
        }
      }
			//Paint canvas
			getCalcFrame().getCalcPanel().repaint();
		}

		public CalcFrame getCalcFrame(){
			return frame;
		}

		public CalcThread getCalcThread(){
			return thread;
		}


	}
