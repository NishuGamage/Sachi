package Try03;

import java.util.Scanner;

public class MainDemo {
	
	public static void main(String[] args) {
		RegisterandLogin_FiveinOne registernadlogin = new RegisterandLogin_FiveinOne();
		User user = new User();
		Scanner scanner = new Scanner(System.in);		
		
		registernadlogin.displyMessage1();
		
		while(scanner.hasNextLine()) {
			registernadlogin.userInput(scanner, user);
		}
	
	}
}