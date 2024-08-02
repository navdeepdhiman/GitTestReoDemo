package initializewithmethods;

public class Car {

	 String company;
	 String model;
	 Double mileage;
	 Double price;
	 String color;
	 
	 public void startCar() {
		 
		 System.out.println("car from the company " +company+ " having " +model+ " model has started" );
		 
		 
	 }
	 
	public void stopCar() {
		
		System.out.println("Car from the company " +company+ " having " +model+ " model has stopped");

	}
	
	public void carDetails() {
		
		System.out.println("Company of the car is:" +company );
		System.out.println("Model of the car is:" +model );
		System.out.println("Mileage of the car is:" +mileage );
		System.out.println("price of the car is:" +price );
		System.out.println("Color of the car is:" +color );
		
			}
	
}
