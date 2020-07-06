package Try02;

import java.util.Scanner;

public class LoginImpl {
	
		static User user = new User();	//calling to the GetSet page
		static Wellcomepage wellcome = new Wellcomepage();
		
		// Search a  user input and search in the existing data in hashMap
		protected void logintothepage(Scanner scanner, User user) {
				
			// Display message
			System.out.println("Login to the Page");
			System.out.print("Enter username = ");
			String userName = scanner.nextLine();
			System.out.print(user.getUserName());
			
			System.out.print(" Enter the password = ");
			String  password = scanner.nextLine();
			System.out.print(user.getPassaword());
		 
			//Search in the exiting hashMap the keyword that the user inputed
			if(!user.getUserName().contains(userName)) {
	        	// If found: return a simple message that the user  is found using the keyword
				System.out.println(" User dose not exist");
			}else if(user.getUserName().contains(userName)) {
				if(!user.getPassaword().contains(password)) {
					System.out.println(" Password is incorrect.");
				} else {
					wellcome.displayMessage(user);
				}	
			}else {
				// Display a message that user (keyword) is not found
				System.out.println("We dont find what you are looking for");
//				//call to the wellcome page
//				Wellcomepage.displayMessage(user);
				
			}
		}
	}
