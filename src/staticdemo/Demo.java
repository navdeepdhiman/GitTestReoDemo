package staticdemo;

public class Demo {

	public static void main(String[] args) {
		
		Car.wheels= 5;
		
		Car hamz = new Car("Honda", "Amaze", 900000, 14.12, "Grey" );

		hamz.startCar();
		hamz.stopCar();
		hamz.carDetails();

		Car msvdi = new Car("Maruti", "Swift VDI", 800000, 24.77, "Red" );

		msvdi.startCar();
		msvdi.stopCar();
		msvdi.carDetails();

		Car hi20 = new Car("Hyundai", "i20", 1200000, 12.34, "White");

		hi20.startCar();
		hi20.stopCar();
		hi20.carDetails();

	}

}