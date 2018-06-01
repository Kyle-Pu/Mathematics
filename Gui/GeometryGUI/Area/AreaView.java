package GeometryGUI.Area;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AreaView extends JFrame {
	private JLabel rectangle = new JLabel("Rectangle");
	private JLabel circle = new JLabel("Circle");
	private JLabel triangle = new JLabel("Triangle");
	private JLabel square = new JLabel("Square");

	private JLabel recHeightLabel = new JLabel("Height");
	private JLabel recWidthLabel = new JLabel("Width");
	private JLabel cirRadiusLabel = new JLabel("Radius");
	private JLabel triLengthLabel = new JLabel("Length");
	private JLabel triHeightLabel = new JLabel("Height");
	private JLabel squSideLabel = new JLabel("Side");

	private JFormattedTextField recHeight = new JFormattedTextField("");
	private JFormattedTextField recWidth = new JFormattedTextField("");
	private JFormattedTextField cirRadius = new JFormattedTextField("");
	private JFormattedTextField triLength = new JFormattedTextField("");
	private JFormattedTextField triHeight = new JFormattedTextField("");
	private JFormattedTextField squSide = new JFormattedTextField("");

	private AreaRectangleComponent recPaint = new AreaRectangleComponent();
	private AreaCircleComponent cirPaint = new AreaCircleComponent();
	private AreaTriangleComponent triPaint = new AreaTriangleComponent();
	private AreaSquareComponent squPaint = new AreaSquareComponent();

	public AreaView() {
		setTitle("Geometry- Area Calculator");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// main panel declaration and layout set
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 3));
		// four input panels declaration and layout set
		JPanel recPanel = new JPanel();
		recPanel.setLayout(new GridLayout(2, 2));
		JPanel cirPanel = new JPanel();
		cirPanel.setLayout(new GridLayout(1, 2));
		JPanel triPanel = new JPanel();
		triPanel.setLayout(new GridLayout(2, 2));
		JPanel squPanel = new JPanel();
		squPanel.setLayout(new GridLayout(1, 2));

		// first row
		panel.add(rectangle);
		panel.add(recPanel);
		panel.add(recPaint);
		// second row
		panel.add(circle);
		panel.add(cirPanel);
		panel.add(cirPaint);
		// third row
		panel.add(triangle);
		panel.add(triPanel);
		panel.add(triPaint);
		// fourth row
		panel.add(square);
		panel.add(squPanel);
		panel.add(squPaint);

		// rectangle input panel
		recPanel.add(recHeightLabel);
		recPanel.add(recHeight);
		recPanel.add(recWidthLabel);
		recPanel.add(recWidth);
		recHeight.addPropertyChangeListener("value", this::rectangleRepaint);
		recWidth.addPropertyChangeListener("value", this::rectangleRepaint);

		// circle input panel
		cirPanel.add(cirRadiusLabel);
		cirPanel.add(cirRadius);
		cirRadius.addPropertyChangeListener("value", this::circleRepaint);

		// triangle input panel
		triPanel.add(triLengthLabel);
		triPanel.add(triLength);
		triPanel.add(triHeightLabel);
		triPanel.add(triHeight);
		triLength.addPropertyChangeListener("value", this::triangleRepaint);
		triHeight.addPropertyChangeListener("value", this::triangleRepaint);

		// triangle input panel
		squPanel.add(squSideLabel);
		squPanel.add(squSide);
		squSide.addPropertyChangeListener("value", this::squareRepaint);

		add(panel);
	}

	public void rectangleRepaint(PropertyChangeEvent event) {
		try {
			double height = Double.parseDouble(recHeight.getText());
			double width = Double.parseDouble(recWidth.getText());
			recPaint.setRectangleHeight(height);
			recPaint.setRectangleWidth(width);
			recPaint.repaint();
		} catch (NumberFormatException e) {
			// ignore
		}
	}

	public void circleRepaint(PropertyChangeEvent event) {
		try {
			double radius = Double.parseDouble(cirRadius.getText());
			cirPaint.setCircleRadius(radius);
			cirPaint.repaint();
		} catch (NumberFormatException e) {
			// ignore
		}
	}

	public void triangleRepaint(PropertyChangeEvent event) {
		try {
			double height = Double.parseDouble(triHeight.getText());
			double width = Double.parseDouble(triLength.getText());
			triPaint.setTriangleHeight(height);
			triPaint.setTriangleLength(width);
			triPaint.repaint();
		} catch (NumberFormatException e) {
			// ignore
		}
	}

	public void squareRepaint(PropertyChangeEvent event) {
		try {
			double side = Double.parseDouble(squSide.getText());
			squPaint.setSquareSide(side);
			squPaint.repaint();
		} catch (NumberFormatException e) {
			// ignore
		}
	}

	public static void main(String[] args) {
		new AreaView().setVisible(true);
	}
}
