
public class RabbitRunner {
	public static void main(String[] args) {
		Rabbit emma = new Rabbit("Emma", "grey", 2);
		Rabbit jake = new Rabbit("Jake", "black", 1);
		System.out.println("There are now " + Rabbit.getPopulation() + " rabbits running around!");
		Rabbit hillary = new Rabbit("Hillary", "brown", 4);
		//NOTE: if the variables were not private, we could access them as per the line below
		//System.out.println("My name is " + emma.getName() + " and I am a " + emma.getColor() + " rabbit, who is " + emma.age + " years old." );
		System.out.println("My name is " + emma.getName() + " and I am a " + emma.getColor() + " rabbit, who is " + emma.getAge() + " years old." );
		emma.setColor("white");
		emma.setAge(3);
		System.out.println("My name is " + emma.getName() + " and I am a " + emma.getColor() + " rabbit, who is " + emma.getAge() + " years old." );
		// NOTE: if the getPopulation method is not static, then we can access it from an object but this is a bad practice. It makes more sense for the method
		// to be invoked from the class itself.
		// System.out.println(emma.getPopulation());
		System.out.println("There are now " + Rabbit.getPopulation() + " rabbits running around!");
	}
}
