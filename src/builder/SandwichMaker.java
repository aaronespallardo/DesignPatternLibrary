package builder;

public class SandwichMaker {

	
	public final SandwichBuilder builder;
	
	public SandwichMaker(SandwichBuilder builder){
		
		this.builder = builder;
		
		
	}
	
	public void BuildSandwich(){
		
		builder.CreateNewSandwich();
		builder.PrepareBread();
		builder.ApplyMeatAndCheese();
		builder.ApplyVegetables();
		builder.AddCondiments();
		
	}
	
	public Sandwich getSandwich(){ 
		return builder.getNewSandwich();
	}
	
	
}
