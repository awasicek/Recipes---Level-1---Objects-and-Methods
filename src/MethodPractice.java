
public class MethodPractice {
	String name;
	int coolLevel;
	
	public static void main(String[] args) {
		MethodPractice mp = new MethodPractice("Joe", 5);
		System.out.println(mp.howCool());
	}
	
	MethodPractice(String name, int coolLevel) {
		this.name = name;
		this.coolLevel = coolLevel;
	}
	
	int howCool() {
		return this.coolLevel * 10;
	}
	
}
