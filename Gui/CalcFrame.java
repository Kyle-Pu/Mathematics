import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public  class CalcFrame extends JFrame{

  private CalcHandler handler;
  private CalcPanel panel;
  public ArrayList<JButton> numpad;

  public CalcFrame(CalcHandler handler){
    numpad = new ArrayList<JButton>();
    numpad.add(new JButton("1"));
    numpad.add(new JButton("2"));
    numpad.add(new JButton("3"));
    numpad.add(new JButton("4"));
    numpad.add(new JButton("5"));
    numpad.add(new JButton("6"));
    numpad.add(new JButton("7"));
    numpad.add(new JButton("8"));
    numpad.add(new JButton("9"));
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(1000, 1000);
    this.add((panel = new CalcPanel(handler)));
    panel.setLayout(new GridLayout(3,3));
    for(JButton b: numpad){
      panel.add(b);
    }
    this.setVisible(true);
    this.handler = handler;
  }

  public CalcPanel getCalcPanel(){
    return panel;
  }
  public ArrayList<JButton> getNumpad(){
    return numpad;
  }
}
