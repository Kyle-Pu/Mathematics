import javax.swing.*;

public  class GraphFrame extends JFrame{

  private GraphHandler handler;
  private GraphPanel panel;

  public GraphFrame(GraphHandler handler){

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(1000, 1000);
    this.add((panel = new GraphPanel(handler)));
    this.setVisible(true);
    this.handler = handler;
    
  }

  public GraphPanel getGraphPanel(){
    return panel;
  }

}
