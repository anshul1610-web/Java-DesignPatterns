public class Test 
{
	private static Test t;
	
    private Test() {}
    
    public static  Test getTest() 
    {
    	synchronized(Test.class)
      {   	    	
    		if(t==null)
    	 {
    		t= new Test();
    	 }
      }
    	 return t;
    }
}

public class Main 
{
  public static void main (String [] args) 
  {
	  Test t = Test.getTest();
	  System.out.println(t);
	  
	  
	  Test t1 = Test.getTest();
	  System.out.println(t1);
  }
}
