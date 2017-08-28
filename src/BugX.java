import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class BugX {
	public void makeX(int row, int col, World world) {
		
		if (row > 8 || col > 8 || row < 1 || col < 1) {
			System.out.println("Error making bug X.  Please enter rows and columns with values between 1 and 8");
		} else {
			//center bug
			world.add(new Location(row, col), new Bug());
			// row above bugs
			world.add(new Location(row + 1, col - 1), new Bug());
			world.add(new Location(row + 1, col + 1), new Bug());
			// row below
			world.add(new Location(row - 1, col - 1), new Bug());
			world.add(new Location(row - 1, col + 1), new Bug());
		}
	}
}
