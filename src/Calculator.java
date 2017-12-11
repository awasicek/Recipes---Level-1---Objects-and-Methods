import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Create methods for add, multiply, exponent and a Runner class to test them  

// Then add Swing UI with 2 fields and buttons for each operator 

public class Calculator extends JFrame implements ActionListener {

	JPanel panel = new JPanel();
	JButton addButton = new JButton("+");
	JButton multButton = new JButton("x");
	JButton expButton = new JButton("^");
	JTextField xField = new JTextField(5);
	JTextField yField = new JTextField(5);
	JLabel answerLabel = new JLabel("    ");

	public void run()
	{
		add(panel);
		panel.add(xField);
		panel.add(yField);
		panel.add(addButton);
		panel.add(multButton);
		panel.add(expButton);
		panel.add(answerLabel);
		addButton.addActionListener(this);
		multButton.addActionListener(this);
		expButton.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public double add(double x, double y)
	{
		double result = x + y;
		return result;
	}
	
	public double multiply(double x, double y)
	{
		double result = x * y;
		return result;
	}
	
	public double exponent(double x, double y)
	{
		double result = Math.pow(x, y);
		return result;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == addButton)
		{
			double x = Double.parseDouble(xField.getText());
			double y = Double.parseDouble(yField.getText());
			String ans = String.valueOf(add(x, y));
			answerLabel.setText(ans);
			pack();
		} else if (buttonPressed == multButton)
		{
			double x = Double.parseDouble(xField.getText());
			double y = Double.parseDouble(yField.getText());
			String ans = String.valueOf(multiply(x, y));
			answerLabel.setText(ans);
			pack();
		} else if (buttonPressed == expButton)
		{
			double x = Double.parseDouble(xField.getText());
			double y = Double.parseDouble(yField.getText());
			String ans = String.valueOf(exponent(x, y));
			answerLabel.setText(ans);
			pack();
		}
	}
}
