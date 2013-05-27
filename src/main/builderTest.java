package main;

import builder.ClubSandwichBuilder;
import builder.MySandwichBuilder;
import builder.Sandwich;
import builder.SandwichMaker;


public class builderTest {

	public static void main(String[] args) {
		
		SandwichMaker sandwichMaker1 = new SandwichMaker(new MySandwichBuilder());
		sandwichMaker1.BuildSandwich();
		Sandwich sandwich1 = sandwichMaker1.getSandwich();
		sandwich1.Display();
		
		System.out.println("");
		
		SandwichMaker sandwichMaker2 = new SandwichMaker(new ClubSandwichBuilder());
		sandwichMaker2.BuildSandwich();
		Sandwich sandwich2 = sandwichMaker2.getSandwich();
		sandwich2.Display();
		
	}

}
