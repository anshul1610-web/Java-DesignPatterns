public class SingletonSync 
{
	private static SingletonSync x;
	
	private SingletonSync() {}
	
	public static synchronized SingletonSync getInstance()
	{
	      if (x==null)	
	      {
	    	  x = new SingletonSync();
	      }
	      return x;
	}

}
public class SingletonExample 
{

	public static void main(String[] args) 
	{
		SingletonSync x= SingletonSync.getInstance();
		System.out.println(x);
        
		SingletonSync x2= SingletonSync.getInstance();
		System.out.println(x2);

	}

}
