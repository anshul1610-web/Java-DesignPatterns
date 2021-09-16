public class SingletonBlock 
{
     private static SingletonBlock x;
     
     private SingletonBlock() {}
     
     
     public static SingletonBlock getInstance()
     {
    	 if(x==null) 
    	 {	 
    	     synchronized(SingletonBlock.class)
    	     {
    	    	if(x==null) 
    	    	{
    	    		x = new SingletonBlock();
    	    	} 	    
    	     } 
    	 }
    	 return x;
     }
}
public class SingletonExample 
{

	public static void main(String[] args) 
	{
		SingletonBlock x = SingletonBlock.getInstance();
		System.out.println(x);
		
		SingletonBlock x1 = SingletonBlock.getInstance();
		System.out.println(x1);

	}

}
