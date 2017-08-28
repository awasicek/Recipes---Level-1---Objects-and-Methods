import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/*
 * Teaching note: sometimes the grid will not appear properly but this can usually be fixed by 
 * selecting the Location menu and then selecting Down.
 */

public class Gridworld {
	public static void main(String[] args) {
		// 1. Figure out how to get the World to show.
		World world = new World();
		world.show();
		
		// 2. Figure out how to add a Bug to the world (clue: you will need the Bug and
		// Location objects)
		Bug joe = new Bug();
		world.add(new Location(2, 3), joe);

		// 3. Add another bug at a random location in the world.
		Bug sally = new Bug();
		int ran1 = new Random().nextInt(8) + 1;
		int ran2 = new Random().nextInt(8) + 1;
		world.add(new Location(ran1, ran2), sally);
		
		// 4. Change the color of that bug to blue.
		sally.setColor(Color.blue);

		// 5. Make the bug face to the right.
		sally.setDirection(90);
		
		// 6. Add flowers to the left and right of the bug.
		Flower rose = new Flower(Color.red);
		Flower daisy = new Flower(Color.yellow);
		world.add(new Location(ran1, ran2 + 1), rose);
		world.add(new Location(ran1, ran2 - 1), daisy); 
		
		// 7. Fill the whole world with flowers!
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j ++) {
				// 8. [Optional] Color the flowers in rows like the American flag (red & white)
				if (i % 2 == 0) {
					world.add(new Location(i, j), new Flower(Color.red));
				} else {
					world.add(new Location(i, j), new Flower(Color.white));
				}
			}
		}
		
		// 9. [Optional] Use a new class to make an X out of bugs.
		new BugX().makeX(3, 3, world);
		new BugX().makeX(7, 8, world);

	}
}