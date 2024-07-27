package flowcontrol;

public class SwitchStatements {

	public static void main(String[] args) {

		String foodItem = "Pepsi";
		
		switch(foodItem) {
		
		case "Pizza":
			System.out.println("Here is your Pizza");
			break;
			
		case "Burger":
			System.out.println("Herer is Your Burger");
			break;
			
		case "Pepsi":
			System.out.println("Here is your Pepsi");
			break;
			
		default:
			System.out.println("we only serve Pizza/Burger/pepsi");
			break;
		}
		
	}

}
