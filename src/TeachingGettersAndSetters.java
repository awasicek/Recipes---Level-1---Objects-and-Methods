// This is the runner for teaching getters and setters
public class TeachingGettersAndSetters {
	public static void main(String[] args) {
		Taco myTaco = new Taco("beef", "salsa");
		System.out.println(myTaco);
		// Below will not work because the variables are set to private! So we need getters and setters.
		// System.out.println(myTaco.meat);
		System.out.println("My taco's meat is " + myTaco.getMeat() + " the sauce is " + myTaco.getSauce() + ".");
		myTaco.setMeat("chicken");
		myTaco.setSauce("verde");
		System.out.println("My taco's meat is " + myTaco.getMeat() + " the sauce is " + myTaco.getSauce() + ".");

	}
}

//Teach:
//1. Revise how to make a class (e.g. Taco), add member variables (meat, sauce).
//2. Show how to create getters and setters for the variables (this will be new).

//Coding exercise for students:
//1. Make a Person class with 2 member variables: name and superpower
//2. Add getters and setters for name and superpower
//3. Make a Runner class to create people, set their superpowers and call their toString method 
//4. Show syso of objects is useless. Override the toString() method for Person “<name> has mad <superpower> skills”