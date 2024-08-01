package flowcontrol;

public class CharacterSwitchExample {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		
		case 'A':
			System.out.println("Grade A is excellent");
			break;
			
		case 'B':
			System.out.println("Grade B is Very Good");
			break;
			
		case 'C' :
			System.out.println("Grade C is Good");
			break;
			
		default:
			System.out.println("Failed to attempt");
		
		}

	}

}
