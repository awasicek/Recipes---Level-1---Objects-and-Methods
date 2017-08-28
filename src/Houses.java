import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	public static void main(String[] args) {

		// 1. have the tortoise start in the bottom left corner
		Robot turtle = new Robot();
		turtle.setSpeed(150);
		turtle.penDown();
		turtle.setX(50);
		turtle.setY(900);
		turtle.hide();
		// [optional] Set the scene to night time by setting the background to
		// black using Tortoise.getBackgroundWindow().setColor
		Robot.setWindowColor(Color.black);

		// 2. draw a house of height 100 with grass after it. This shape: |**|_
		// 3. extract the piece of code that draws the house into a method. Draw
		// 10 houses.

		for (int i = 0; i < 10; i++) {
			// 4. Change the method to take int height as a parameter. Draw 9
			// houses of different heights
			// generally, generating numbers from min to max (including both):
			// random.nextInt(max-min+1)+min
			// int randomHeight = new Random().nextInt(100-60+1)+60;
			int randomSize = new Random().nextInt(3) + 1;

			String randomHeight = "small";
			if (randomSize == 1) {
				randomHeight = "small";
			} else if (randomSize == 2) {
				randomHeight = "medium";
			} else if (randomSize == 3) {
				randomHeight = "large";
			}

			Color housePaint = Color.blue;
			int randomHouseColor = new Random().nextInt(5) + 1;
			switch (randomHouseColor) {
			case 1:
				housePaint = Color.blue;
				break;
			case 2:
				housePaint = Color.red;
				break;
			case 3:
				housePaint = Color.yellow;
				break;
			case 4:
				housePaint = Color.orange;
				break;
			case 5:
				housePaint = Color.cyan;
				break;
			}

			int randomPointyOrFlat = new Random().nextInt(2) + 1;
			// 9. make large houses have flat roofs
			if (randomPointyOrFlat == 1 || randomSize == 3) {
				drawHouseFlatRoof(turtle, randomHeight, housePaint);
			} else if (randomPointyOrFlat == 2) {
				drawHousePointyRoof(turtle, randomHeight, housePaint);
			}

			drawGrass(turtle);
		}

	}

	// 5. Make the method take a String instead of a height.
	//
	// “small” 60
	// “medium” 120
	// “large” 250

	public static void drawHouseFlatRoof(Robot bob, String height, Color houseColor) {
		bob.setPenColor(houseColor);
		int heightInt = 60;
		if (height.equals("small")) {
			heightInt = 60;
		} else if (height.equals("medium")) {
			heightInt = 120;
		} else if (height.equals("large")) {
			heightInt = 150;
		}
		bob.move(heightInt);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(heightInt);
	}

	// 7. Give the houses peaked roofs
	// 8. Extract that roof code into a method “drawPointyRoof” and create a new
	// method: “drawFlatRoof”.

	public static void drawHousePointyRoof(Robot bob, String height, Color houseColor) {
		bob.setPenColor(houseColor);
		int heightInt = 60;
		if (height.equals("small")) {
			heightInt = 60;
		} else if (height.equals("medium")) {
			heightInt = 120;
		} else if (height.equals("large")) {
			heightInt = 150;
		}
		bob.move(heightInt);
		bob.turn(45);
		bob.move(30);
		bob.turn(90);
		bob.move(30);
		bob.turn(45);
		bob.move(heightInt);
	}

	public static void drawGrass(Robot bob) {
		bob.turn(-90);
		bob.setPenColor(Color.green);
		bob.move(50);
		bob.turn(-90);
	}

}
