import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Create a frame & make it visible
		JFrame frame = new JFrame("Land of Turtles");
		frame.setVisible(true);
		// 2. Add the panel to the frame
		frame.add(panel);
		frame.pack();
		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle
		Turtle turt = new Turtle();
		// 5. Add the turtle to the panel
		panel.addTurtle(turt);
		// 6. Put 50 Turtles on the beach
		for (int i = 0; i < 50; i++)
		{
			Turtle newTurt = new Turtle();
			int ranX = new Random().nextInt(frame.getWidth());
			int ranY = new Random().nextInt(frame.getHeight());
			newTurt.setX(ranX);
			newTurt.setY(ranY);
			panel.addTurtle(newTurt);
		}
	}
}
