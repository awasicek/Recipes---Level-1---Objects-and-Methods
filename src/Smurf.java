/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if(this.name == "Papa") {
		return "red hat";
		} else {
			return "white hat";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if(this.name == "Smurfette") {
			return "girl";
		} else {
		return "boy";
		}
	}
	
	public static void main(String[] args) {
		// making Handy Smurf
		Smurf handySmurf = new Smurf("Handy");
		// making Handy Smurf eat
		handySmurf.eat();
		// printing out Handy Smurf's name
		System.out.println(handySmurf.getName());
		// making Papa Smurf
		Smurf papaSmurf = new Smurf("Papa");
		// printing Papa Smurf's name
		System.out.println(papaSmurf.getName());
		// printing out Papa Smurf's hat color
		System.out.println("Papa Smurf has a " + papaSmurf.getHatColor());
		// printing out Papa Smurf's gender
		System.out.println("Papa Smurf is a " + papaSmurf.isGirlOrBoy());
		// making Smurfette
		Smurf smurfette = new Smurf("Smurfette");
		// printing Smurfette's name
		System.out.println(smurfette.getName());
		// printing out Smurfette's hat color
		System.out.println("Smurfette has a " + smurfette.getHatColor());
		// printing out Smurfette's gender
		System.out.println("Smurfette is a " + smurfette.isGirlOrBoy());
	}

}



