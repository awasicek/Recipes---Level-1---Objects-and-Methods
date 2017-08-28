
public class Taco {
	private String meat, sauce;
	public Taco(String meatName, String sauceName) {
		this.meat = meatName;
		this.sauce = sauceName;
	}
	
	public String getMeat() {
		return(meat);
	}
	
	public String getSauce() {
		return(sauce);
	}
	
	public void setMeat(String newMeat) {
		this.meat = newMeat;
	}
	
	public void setSauce(String newSauce) {
		this.sauce = newSauce;
	}
}
