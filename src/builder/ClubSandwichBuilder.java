package builder;

import java.util.ArrayList;

import builder.Sandwich.BreadType;
import builder.Sandwich.CheeseType;
import builder.Sandwich.MeatType;

public class ClubSandwichBuilder extends SandwichBuilder{

	
	public void AddCondiments() {
		
		sandwich.HasMayo(false);
		sandwich.setToasted(false);
		sandwich.setHasMustard(true);
		
	}

	public void ApplyVegetables() {
		
		ArrayList<String> vegetables = new ArrayList<String>(){{
			add("Pickles");
			add("Lettuce");
		}};
		sandwich.setVegetables(vegetables);
		
	}

	public void ApplyMeatAndCheese() {
		
		sandwich.setMeatType(MeatType.HAM);
		sandwich.setCheeseType(CheeseType.AMERICAN);
		
	}

	public void PrepareBread() {
		
		sandwich.setBreadType(BreadType.WHITE);
		
	}
	
	
}
