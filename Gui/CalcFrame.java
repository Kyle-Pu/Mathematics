import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public  class CalcFrame extends JFrame{

  private CalcHandler handler;
  private CalcPanel panel;
  public ArrayList<JButton> numpad;
  public JTextField inputBox;
  public CalcFrame(CalcHandler handler){

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(1000, 1000);
    this.add((panel = new CalcPanel(handler)));
    inputBox = new JTextField(20);
    inputBox.addActionListener(this);
    panel.add(inputBox);
    this.setVisible(true);
    this.handler = handler;
  }

  public CalcPanel getCalcPanel(){
    return panel;
  }
  public JTextField getInputBox(){
    return inputBox;
  }
}
