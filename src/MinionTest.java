import static org.junit.Assert.*;

import org.junit.Test;

/**
 * **NOTE: Students should be able to import junit4 libraries by hovering any of the associated keywords like @Test**
 * To make these tests pass, you will need to create a Minion class with the member variables below.
 * 
 * <code>
 * 			private String name; 
 * 			private int eyes; 
 * 			private String color; 
 * 			private String master;
 * </code>
 * 
 * Create a constructor, and getters and setters for the member variables. If they’re done right, these tests will pass.
 * 
 * **/

public class MinionTest {

	//**NOTE: Do not need to create main methods to run these tests. Instead, we run this as a junit test instead of as a local java application.**
	
//	public static void main(String[] args) {
//		MinionTest mt = new MinionTest();
//		mt.run();
//	}
//	
//	public void run() {
//		testConstructor();
//		testSetters();
//	}
	
	@Test
	public void testConstructor() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");
		assertEquals("Stuart", stuart.getName());
		assertEquals(1, stuart.getEyes());
		assertEquals("yellow", stuart.getColor());

		Minion dave = new Minion("Dave", 2, "yellow", "");
		assertEquals("Dave", dave.getName());
		assertEquals(2, dave.getEyes());
		assertEquals("yellow", dave.getColor());
	}

	@Test
	public void testSetters() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");

		stuart.setMaster("T. Rex");
		assertEquals("T. Rex", stuart.getMaster());

		stuart.setMaster("Napoleon");
		assertEquals("Napoleon", stuart.getMaster());
	}

}



