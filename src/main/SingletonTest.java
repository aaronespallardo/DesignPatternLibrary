package main;

import singleton.Singleton;

public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Singleton firstObj = Singleton.getInstance();
		Singleton secondObj = Singleton.getInstance();
		Singleton thirdObj = Singleton.getInstance();
		
		System.out.println(firstObj.getCheckInstance());
		System.out.println(secondObj.getCheckInstance());
		System.out.println(thirdObj.getCheckInstance());
		
		System.out.println(firstObj.getCounter());
		System.out.println(secondObj.getCounter());
		System.out.println(thirdObj.getCounter());
		
		
		firstObj.increaseCount();
		System.out.println("first: " + firstObj.getCounter());
		System.out.println("second: " + secondObj.getCounter());
		System.out.println("third: " + thirdObj.getCounter());
		thirdObj.increaseCount(5);
		System.out.println("first: " + firstObj.getCounter());
		System.out.println("second: " + secondObj.getCounter());
		System.out.println("third: " + thirdObj.getCounter());
		

	}

}
