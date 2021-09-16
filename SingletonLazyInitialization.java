public class SingletonLazy
{
    private static SingletonLazy x;
    
    private SingletonLazy() {}
    
    public static SingletonLazy getInstance() 
    {
    	if (x==null) 
    	{
    		x = new SingletonLazy();
    	}
    	return x;
    }
}public class SingletonExample 
{

	public static void main(String[] args) 
	{
		SingletonLazy x = SingletonLazy.getInstance();
		System.out.println(x);
		
		
		SingletonLazy x1 = SingletonLazy.getInstance();
		System.out.println(x);

		SingletonLazy x2 = SingletonLazy.getInstance();
		System.out.println(x);
	}

}
