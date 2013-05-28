package singleton;

public class LazySingleton {
	
	private int checkInstance;
	
	private LazySingleton()
	{
		this.checkInstance = (int) (Math.random()*100000);
	}
	
	public int getCheckInstance()
	{
		return this.checkInstance;
	}
	
	public static LazySingleton getInstance()
	{
		return Nested.instance;
	}
	
	
	private static class Nested
	{
		private Nested()
		{
			
		}
		
		static final LazySingleton instance = new LazySingleton();
		
	}
	
	
	
	
}
