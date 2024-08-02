package initializewithmethods;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Car hamz = new Car();  
		
		hamz.company = "Honda";
		hamz.model   = "Amaze";
		hamz.mileage = 13.0;
		hamz.price = 120000.0;
		hamz.color = "White";
		
		hamz.startCar();
		hamz.stopCar();
		hamz.carDetails();
	
				
	}
	
	
}
