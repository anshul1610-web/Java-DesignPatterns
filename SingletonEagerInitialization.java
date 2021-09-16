public class SingletonEagar 
{
      private static SingletonEagar instance = new SingletonEagar();
      
      private SingletonEagar() {}
      
      public static SingletonEagar getInstance() 
      {
    	   return instance;
      }
}

public class SingletonExample 
{

	public static void main(String[] args) 
	{
	
		SingletonEagar instance = SingletonEagar.getInstance();
		System.out.println(instance);
		
		SingletonEagar instance1 = SingletonEagar.getInstance();
		System.out.println(instance);
		
		SingletonEagar instance2 = SingletonEagar.getInstance();
		System.out.println(instance);
		
		SingletonEagar instance3 = SingletonEagar.getInstance();
		System.out.println(instance);

	}

}
