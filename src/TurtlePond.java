import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TurtlePond implements KeyEventDispatcher {

	// 1. Set a location for the cookie
	int cookieX = 100;
	int cookieY = 50;

	// 2. Choose the speed you want the Tortoise to go at
	int speed = 5;
	
	void setup() {
		// 3. Edit this intro message to your own style
		JOptionPane.showMessageDialog(null, "Move the turtle with the arrow keys to find the hidden cookie.\nYou'll get warmer the closer you get.\n\nHurry or she'll die of hunger!");
		
		// 4. For debugging purposes, show the cookie. The user won’t see this.
		showCookie();
	}

	private void goUp() {
		Tortoise.move(speed);
	}

	private void goDown() {
		Tortoise.move(-speed);
	}

	private void goLeft() {
		// 5. make the tortoise move left at the specified speed (3 lines of code)
		Tortoise.turn(-90);
		Tortoise.move(speed);
		Tortoise.turn(90); // so oriented in same direction as before
	}

	private void goRight() {
		// 6. use the speed variable to make the tortoise move right
		Tortoise.turn(90);
		Tortoise.move(speed);
		Tortoise.turn(-90);
	}

	private void checkForFood() throws Exception {
		
		// 11. If more than 20 seconds have elapsed, tell them the turtle died of hunger!
		//System.out.println("x: " + Tortoise.getX() + ", y: " + Tortoise.getY());
		if (getTimeElapsed() > 20) {
			JOptionPane.showMessageDialog(null, "Too slow. The turtle died of hunger.");
			System.exit(0);
		}
		
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		double x = tortoiseLocationX - cookieX;
		double y = tortoiseLocationY - cookieY;
		
		double distance = Math.sqrt(x*x + y*y); // distance is based on pythaogrean theorem a^2 + b^2 = c^2
		
		if (distance > 100)
		{
			setBackgroundColor(Color.LIGHT_GRAY);
		}
		else if (distance <= 100 && distance > 50) 	// 7. If the Tortoise is within 100 pixels of the food, set the background color to yellow

		{
			setBackgroundColor(Color.yellow);
		}
		else if (distance <= 50 && distance > 20) 	// 8. If the Tortoise is within 50 pixels of the food, set the background color to orange
		{
			setBackgroundColor(Color.orange);
		}
		else if (distance <= 20 && distance > 5) 	// 9. If the Tortoise is within 20 pixels of the food, set the background color to red
		{
			setBackgroundColor(Color.red);
		} 
		else // 10. If the Tortoise is within 5 pixels of the cookie, make a pop-up to tell them they found it
		{
			JOptionPane.showMessageDialog(null, "You found the cookie!");
			System.exit(0);
		}

		// 12. If the Tortoise crosses it's own path, tell them they failed and move them back to the beginning
		if (wasHereBefore(tortoiseLocationX, tortoiseLocationY))
		{
			JOptionPane.showMessageDialog(null, "Oops, you backtracked and lost your way back to the beginning.");
			Tortoise.penUp();
			Tortoise.setX(320);
			Tortoise.setY(235);
			Tortoise.penDown();
		}
	}
	
	private long getTimeElapsed() {
		 Date currentTime = new Date();
		 return (currentTime.getTime() - startTime.getTime())/1000;
	}

	private void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void showCookie() {
		Tortoise.getBackgroundWindow().addPaintable(new Paintable() {
			public void paint(Graphics2D g, JPanel caller) {
				g.drawOval(cookieX, cookieY, 10, 10);
			}
		});
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	private Point getFirstLocation() {
		return previousLocations.get(0);
	}

	/*********************** don't worry about the stuff under here ******************/

	Date startTime = new Date();

	public static void main(String[] args) {
		TurtlePond feeder = new TurtlePond();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(PenColors.Purples.DarkMagenta);
		Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.SlateGray);
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
}



