

public class Singleton
{
	private static Singleton instance;
	
	private Singleton()
	{
		System.out.println("Instance has been created");
	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			synchronized(Singleton.class)
			{
				if(instance == null)
				{
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public static void main(String Agr[])
	{
		Thread t1 = new Thread(new Runnable(){
			public void run()
			{
				Singleton obj = Singleton.getInstance();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run()
			{
				Singleton obj = Singleton.getInstance();
			}
		});
		
		t1.start();
		t2.start();
	}
}