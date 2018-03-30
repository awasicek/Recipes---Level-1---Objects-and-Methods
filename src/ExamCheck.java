import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExamCheck implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton Yellow = new JButton();
JButton Red = new JButton();
JButton Blue = new JButton();
JButton Green = new JButton();

	public static void main(String[] args) {
		ExamCheck run = new ExamCheck();
		run.run();
		
	}
	void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(Yellow);
		panel.add(Red);
		panel.add(Blue);
		panel.add(Green);
		Yellow.addActionListener(this);
		Red.addActionListener(this);
		Blue.addActionListener(this);
		Green.addActionListener(this);
		Yellow.setBackground(Color.YELLOW);
		Red.setBackground(Color.RED);
		Blue.setBackground(Color.BLUE);
		Green.setBackground(Color.GREEN);
		Yellow.setOpaque(true);
		Red.setOpaque(true);
		Blue.setOpaque(true);
		Green.setOpaque(true);
		frame.setTitle("Color Teacher");
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==Yellow) {
			speak("yellow");
		}else if(buttonPressed==Red) {
			speak("red");
		}else if(buttonPressed==Blue) {
			speak("blue");
		}else {
			speak("green");
		}
			
		
		
	}
	
	 void speak(String words) {
	
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}
	
