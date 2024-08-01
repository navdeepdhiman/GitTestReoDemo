package staticagain;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
	ClassOne cOne= new ClassOne();
	
	cOne.a = 5;
	ClassOne.b = 6;
		
		System.out.println(cOne.a);
		System.out.println(ClassOne.b);
	
//		# To call the methods
		
		cOne.sampleOne();
		ClassOne.sampletwo();
		
	}

}
