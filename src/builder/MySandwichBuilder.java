package builder;

import java.util.ArrayList;

import builder.Sandwich.BreadType;
import builder.Sandwich.CheeseType;
import builder.Sandwich.MeatType;

public class MySandwichBuilder extends SandwichBuilder{


	public void AddCondiments() {
		
		sandwich.HasMayo(true);
		sandwich.setToasted(true);
		sandwich.setHasMustard(true);
		
	}

	public void ApplyVegetables() {
		
		ArrayList<String> vegetables = new ArrayList<String>(){{
			add("Tomato");
			add("Onion");
		}};
		sandwich.setVegetables(vegetables);
		
	}

	public void ApplyMeatAndCheese() {
		
		sandwich.setMeatType(MeatType.CHICKEN);
		sandwich.setCheeseType(CheeseType.CHEDDAR);
		
	}

	public void PrepareBread() {
		
		sandwich.setBreadType(BreadType.WHEAT);
		
	}
	
	
}
