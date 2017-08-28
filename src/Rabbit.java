// OVERVIEW: Goal is to teach STATIC, PRIVATE, and GETTERS/SETTERS.
// (1) make an animal class with 3 characteristics for each object (2 strings, 1 int) -- this time we are going to make them PRIVATE!
// (2) make a runner, create 3-4 different rabbits, and syso out some information to make sure its working
// (3) make getters and setters
// (4) add a static population variable

public class Rabbit {
	
	// NOTE: PRIVATE means that the variable is only visible within the class (so we can't do rabbitObj.name). To access private fields (member variables)
	// we need to make getter and setter methods
	private String name, color;
	private int age;
	//NOTE: STATIC means that there is only 1. In the case of static variables, this means that there is only one populationCount (unlike name, color, or age, 
	// where each rabbit object has its own name, color, and age).  
	private static int populationCount = 0;

	public Rabbit(String name, String color, int age) {
		System.out.println("Making (instantiating) a rabbit object!");
		this.name = name;
		this.color = color;
		this.age = age;
		populationCount++;
	}
	
	//GETTERS -- Don't take any information, just get information and return it to you. Doesn't change an object's variables.
	String getName() {
		return this.name;
	}
	
	String getColor() {
		return this.color;
	}
	
	int getAge() {
		return this.age;
	}
	
	static int getPopulation() {
		return populationCount;
	}
	
	//SETTERS -- Require information so that a change can be made to an object's variable. Does not return any information.
	void setName(String name){
		this.name = name;
	}
	
	void setColor(String color){
		this.color = color;
	}
	
	void setAge(int age){
		this.age = age;
	}

}
