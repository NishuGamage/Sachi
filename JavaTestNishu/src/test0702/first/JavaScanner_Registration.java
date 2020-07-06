package test0702.first;

import java.util.Scanner;

public class JavaScanner_Registration {
	
	static register register = new register();
	
	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.print("Enter firstName=>");  // what user see
			String firstName = scanner.nextLine();   // user input
			register.setFirstName(firstName);
			
			System.out.print("Enter lastName=>");
			String lastName = scanner.nextLine();
			register.setLastName(lastName);
			
			System.out.print("Enter userName=>");
			String userName  = scanner.nextLine();
			register.setUserName(userName);
			
			System.out.print("Enter password=>");
			String password = scanner.nextLine();
			register.setPassword(password);
			
			System.out.print("Enter EmailId=>");
			String emailId = scanner.nextLine();
			register.setEmailId(emailId);
			
			System.out.print("Enter phoneNo=>");
			long phoneNo = scanner.nextLong();
			register.setPhoneNo(phoneNo);
			
			System.out.println(register.toString());		
		}
	}
}
