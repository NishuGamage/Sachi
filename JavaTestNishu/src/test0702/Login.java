package test0702;

import java.util.Scanner;

public class Login {
	
	static myregister myregister = new myregister();
	
	public myregister registerUser(Scanner scanner) {
		System.out.print("Enter your First Name=");
		String firstName = scanner.nextLine();
		myregister.setFirstName(firstName);
		
		System.out.print("Enter your Last Name=");
		String lastName = scanner.nextLine();
		myregister.setLastName(lastName);
		
		System.out.print("Insert username =");
		String userName = scanner.nextLine();
		myregister.setUsername(userName);
		
		System.out.print("Insert password=");
		String password = scanner.nextLine();
		myregister.setPassword(password);
		
		return myregister;
	}
	

}
