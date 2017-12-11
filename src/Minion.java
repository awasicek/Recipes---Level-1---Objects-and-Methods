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

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
	
	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEyes() {
		return eyes;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMaster() {
		return master;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setMaster(String master) {
		this.master = master;
	}
}
