public class Car {
	// static variables
	static int noOfTyres;
	
	//instance variables (state)
	String model;
	String make;
	
	// instance methods (behavior)
	void move(){
		System.out.println("Car is moving");
		System.out.println("Its model is " + model +", from "+ make);
	}
	
	static void start(){
		System.out.println("Car starts, it has tyres="+noOfTyres);
	}


}