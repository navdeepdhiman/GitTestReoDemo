package overloading;

public class whyOverloading {

	public void add(int a, int b) {
	
		int c = a + b;
	
		System.out.println("The sum of two nummber is " +c);
	
	}
	
	public void add(int a, int b, int c) {
		
		int d = a + b + c;
		
		System.out.println("The sum of three number is " +d);
		
	}
	
	public void add(int a, int b, int c, int d) {
		
		int e = a + b + c + d;
		
		System.out.println("The sum of three number is " +e);	
	
	
	}
	
	public void add(int a, double b) {
		
		double c = (a + b);
		
		System.out.println("-> The sum of two number is " +c);
	}
	
}

