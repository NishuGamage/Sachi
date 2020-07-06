package test0702;

import java.util.Scanner;

public class MyLogin {
	
	static Login login = new Login();  // calling to the anther program files
	static myregister myregister = new myregister();
	
	public static void main(String [] args) { //Åö
	
		try(Scanner scanner = new Scanner(System.in)){   //insert data
			
			myregister = login.registerUser(scanner);
			
			System.out.print("Enter username =");
			String userName = scanner.nextLine();
			
			System.out.print("Enter password=");
			String password = scanner.nextLine();
		
			if(!myregister.getUsername().contains(userName)) {
				System.out.println("User does not exist");
			} else {
				System.out.println("User does exist");
			}
//			
//			if ("Nishu".contentEquals(userName) && "pass".contentEquals(password)) {
//				System.out.println("Wellcome !"+ (myregister.toString()));
//			}else {
//				System.out.println("In valid UserName of password");
//			}			
		}		
	}
}
