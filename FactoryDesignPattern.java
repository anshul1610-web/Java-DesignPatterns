
public class Bike extends Vehicle
{
  int Wheel;
  Bike(int Wheel)
  {
	this.Wheel = Wheel;  
  }
  
  public int getWheel() 
  {
	  return this.Wheel;
  }
}

public class Car extends Vehicle
{
	int Wheel;
	
	Car(int Wheel)
	{
		this.Wheel=Wheel;
	}
   public int getWheel()
   {
	   return this.Wheel;
   }
}

abstract  class Vehicle 
{
   public abstract int  getWheel();
   
   public String toString()
  {
	   return "Wheel "+ this.getWheel();
   }
	
	
}

public class FactoryInstance
{
   public static Vehicle getInstance(String type,int Wheel)
   {
	   if(type=="car") 
	   {
		   return new Car(Wheel);
	   }
	   else if(type=="bike")
	   {
		 return  new Bike(Wheel);
	   }
	   else 
	   
		   return null;
	   
	   
	   
   }
}

public class Main 
{

	public static void main(String[] args)
	{
		Vehicle car = FactoryInstance.getInstance("car", 4);
		System.out.println(car);
		
		Vehicle bike = FactoryInstance.getInstance("bike", 2);
		System.out.println(bike);

	}

}
