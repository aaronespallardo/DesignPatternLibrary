package builder;

import java.util.List;

public class Sandwich {

	//attr
	private BreadType breadType;
	private boolean isToasted;
	private CheeseType cheeseType;
	private MeatType meatType;
	private boolean hasMustard;
	private boolean hasMayo;
	private List<String> vegetables;
	
	// setter and getter
	public BreadType getBreadType() {
		return breadType;
	}
	public void setBreadType(BreadType breadType) {
		this.breadType = breadType;
	}
	public boolean isToasted() {
		return isToasted;
	}
	public void setToasted(boolean isToasted) {
		this.isToasted = isToasted;
	}
	public CheeseType getCheeseType() {
		return cheeseType;
	}
	public void setCheeseType(CheeseType cheeseType) {
		this.cheeseType = cheeseType;
	}
	public MeatType getMeatType() {
		return meatType;
	}
	public void setMeatType(MeatType meatType) {
		this.meatType = meatType;
	}
	public boolean HasMustard() {
		return hasMustard;
	}
	public void setHasMustard(boolean hasMustard) {
		this.hasMustard = hasMustard;
	}
	public boolean HasMayo() {
		return hasMayo;
	}
	public void HasMayo(boolean hasMayo) {
		this.hasMayo = hasMayo;
	}
	public List<String> getVegetables() {
		return vegetables;
	}
	public void setVegetables(List<String> vegetables) {
		this.vegetables = vegetables;
	}
	
	public void Display(){
		
		System.out.println("Bread : " + breadType);
		System.out.println("Toasted?: " + isToasted );
		System.out.println("Cheese: " + cheeseType);
		System.out.println("Meat: " + meatType);
		System.out.println("Has Mustard: " + hasMustard);
		System.out.println("Has Mayo: " + hasMayo);
		System.out.println("vegetables");
		for (String vegies : vegetables) {
			System.out.println(vegies);
		}
		
		
		
	}
	
	public enum MeatType{
		TURKEY,
		HAM,
		CHICKEN,
		SALAMI
	}
	public enum CheeseType{
		AMERICAN,
		SWISS,
		CHEDDAR,
		PROVOLENE
	}
	public enum BreadType{
		WHITE,
		WHEAT	
	}
	

	
	
	
	
}
