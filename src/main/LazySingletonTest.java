package main;

import singleton.LazySingleton;
import singleton.Singleton;

public class LazySingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		LazySingleton firstObj = LazySingleton.getInstance();
		LazySingleton secondObj = LazySingleton.getInstance();
		LazySingleton thirdObj = LazySingleton.getInstance();
		
		
		System.out.println("first obj: " + firstObj.getCheckInstance());
		System.out.println("second obj: " + secondObj.getCheckInstance());
		System.out.println("third obj: " + thirdObj.getCheckInstance());
		
	}

}
