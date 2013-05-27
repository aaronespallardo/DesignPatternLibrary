package builder;

public abstract class SandwichBuilder {

	protected Sandwich sandwich;
	
	public Sandwich getNewSandwich(){
		
		return sandwich;
		
	}
	
	public void CreateNewSandwich(){
		
		sandwich = new Sandwich();
		
	}
	
	public abstract void PrepareBread();
	public abstract void ApplyMeatAndCheese();
	public abstract void ApplyVegetables();
	public abstract void AddCondiments();
	
}
