package Try03;

import java.util.Scanner;

public class RegisterandLogin_FiveinOne {
		
		//ÅöÅöÅöÅ@First screen
	
		// Display message when the system will be load
		public void displyMessage1() {
			System.out.println("Do you want to Register a user or Login");
			System.out.println("[R] Register  \n[L] Login \n[Q] Quit ");
			System.out.print("Enter your choice ");
		}
		
		// choices
		protected void userInput(Scanner scanner, User user) {
			//Accept user input
			String userChoice = scanner.nextLine();
			//choiceMessage choiceMessage = new ChoiceMessage();
			switch (userChoice) {
			//Register user [R]
			case "R":
				registerUser(scanner, user);
				displyMessage1();
				break;
			// login user
			case"L":
				login(scanner, user);
				displyMessage1();
				break;
			// Quit the system
			case "Q":
				System.exit(0);
				break;
			// if the choice is not in the selection
			default:
				System.out.println("The input choice is not in out list. try again");
				displyMessage1();
			}
		}
		
		// [R] Register 
		protected User registerUser(Scanner scanner, User user) {
			
			//Display message: User input of the book
			System.out.println("Your choose to register a user");
			
			System.out.println("What is your name? ");
			String firstName =scanner.nextLine();
			user.setFirstName(firstName);
			
			System.out.println("What is your Family Name? ");
			String lastName = scanner.nextLine();
			user.setLastName(lastName);
			
			System.out.print("Enter the username: ");
			//Accept the user input of the book name
			String username = scanner.nextLine();
			user.setUserName(username);
			
			System.out.print("Enter the password:");
			//Accept the user of the number
			String password = scanner.nextLine();
			
			//Accept the user input into the hasMap
			user.setPassword(password);
			// Simple message that the book is already added in the hasMap
			System.out.println(" You hava successfully registered the user");
			
			//Return the hasMap
			return user;
		}
		
		// [L] Login
		protected void login(Scanner scanner, User user) {
			
			// Display message
			System.out.println("Login to the Page");
			System.out.println("Enter the username = ");
			String username = scanner.nextLine();
			System.out.print(user.getUserName());
			
			System.out.print("Enter the password = ");
			String password  = scanner.nextLine();
			System.out.print(user.getPassaword());
			
			//Search in the exiting hasMap the keyword that the user inputed
			if(!user.getUserName().contains(username)) {
				//if found : return a simple message that the user is found using the keyword
				System.out.println(" User dose not exist");
			}else if (user.getUserName().contains(username)) {		
				System.out.println(" Wellcome to the page");
			}else if (user.getFirstName().contains(username)) {
				if(!user.getPassaword().contains(password)) {
					System.out.print(" Password is incorrect.");
				}else {
					//display a message that user (keyword) is not found
					System.out.println("We dont find waht you are lokking for");
					
				}				
			}			
		}
}