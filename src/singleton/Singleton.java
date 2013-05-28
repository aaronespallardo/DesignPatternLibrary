package singleton;

public class Singleton
{

	private static Singleton Instance;
	private int counter;
	private int checkInstance;
	
	private Singleton()
	{
		this.counter = 0;
		this.checkInstance = (int) (Math.random()*100000);
	}
	
	public int getCheckInstance()
	{
		return this.checkInstance;
	}
	
	public int getCounter()
	{
		return this.counter;	
	}
	
	public void increaseCount(int i)
	{
		this.counter += i;
	}
	
	public void increaseCount()
	{
		this.counter++;
	}
	
	
	
	public static Singleton getInstance()
	{
		if(Instance==null) Instance = new Singleton();
		return Instance;
	}
	
	
	
	
}
