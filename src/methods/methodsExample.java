package methods;

public class methodsExample {

	public static void main(String[] args) {
		

		System.out.println("main method started");
		
		methodOne(); 

		System.out.println("main method ended");
		
	}
		
	public static void methodOne() {
		
		
		System.out.println("Inside the methodOne - start");
		methodTwo();
		System.out.println("Inside the methodOne - ended");
			
	}
	
	public static void methodTwo() {
		
		
		System.out.println("Inside the methodTwo - start");
		methodThree();
		System.out.println("Inside the methodTwo - ended");
	
	}
	
	public static void methodThree() {
		
		
		System.out.println("Inside the methodThree");
	
	}
}
