package constructors;

public class Demo {
	
	public static void main(String[] args) {
		
		Car hamz = new Car("Honda","Amaze",9.5,14.12,"Grey");
		
		hamz.startCar();
		hamz.stopCar();
		hamz.carDetails();
		
		Car msvdi = new Car("Maruti","Swift VDI",8.3,23.64,"Red");
		
		msvdi.startCar();
		msvdi.stopCar();
		msvdi.carDetails();
		
		Car hyi20 = new Car("Hyundai","i20",12.8,10.11,"White");
				
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.carDetails();
		
		
	}

}