package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class CalcHandler{

	private CalcFrame frame;
	private CalcThread thread;


	public CalcHandler(){
		frame = new CalcFrame(this);
		((Thread)(thread = new CalcThread(this))).start();
		Action enter = new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e){
	        System.out.println( getCalcFrame().getInputBox().getText());
	        getCalcFrame().getInputBox().setText("");
			}
		};
		getCalcFrame().getInputBox().addActionListener(enter);
	}

	public void update(){
		PointerInfo mouserPointerInfo = MouseInfo.getPointerInfo();
		Point mousePointerLocation = mouserPointerInfo.getLocation();
		int mouseX = (int) (mousePointerLocation.getX());
		int mouseY = (int) (mousePointerLocation.getY());
			
		paintCanvas();
	}

	private void paintCanvas() {
		getCalcFrame().getCalcPanel().repaint();
	}

	public CalcFrame getCalcFrame(){
		return frame;
	}

	public CalcThread getCalcThread(){
		return thread;
	}
}

//remove unused import