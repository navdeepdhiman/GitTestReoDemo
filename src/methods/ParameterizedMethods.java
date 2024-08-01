package methods;

public class ParameterizedMethods {
	
	
	// >>> Multiple paremeterized methods <<<<
	public static void main(String[] args) {
		
		addNumbers(10,3); //arguments
		multiplyNumbers(5,4);  //arguments
		subtractTNumbers(10,5);	//arguments
		
	}
	
	public static void addNumbers (int a, int b) {   //parameters
		
		int result = a+b;
		System.out.println(result);
		 
	}
	
	public static void multiplyNumbers (int a, int b) { //parameters
		
		
		int result = a*b;
		System.out.println(result);
		
	}
	
	public static void subtractTNumbers (int a, int b) { //parameters
		
		int result = a-b;
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		
		welcomeUser(" Pixel"); //Arguments
		
	
	}
	
	public static void welcomeUser(String name) { // parameter
		
		System.out.println("welcome" +name);
	}
	*/
}
