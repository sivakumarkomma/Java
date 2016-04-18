

interface Vehicle{
	
	default public void printMethod(){
		System.out.println("I am vehicle");
	}
}

interface FourWheeler{
	
	default public void printMethod()
	{
		System.out.println("I am four wheeler");
	}
}


 class Car implements  FourWheeler,Vehicle {
	    public void printMethod(){
	    	Vehicle.super.printMethod();
	      //System.out.println("I am a four wheeler car vehicle!");
	   }
	}

public class DefaultExample {

	
	 public static void main(String args[])
	 {
		 Car car = new Car();
		 car.printMethod();
		 Vehicle v = new Car();
		 v.printMethod();
	 }
}
