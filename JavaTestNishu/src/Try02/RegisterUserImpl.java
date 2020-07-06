package Try02;


import java.util.Scanner;

public class RegisterUserImpl {
	
	User user = new User();
	Wellcomepage wellcome = new Wellcomepage();
	
	// Register a book using hasMap and form user input
	protected User registerUser(Scanner scanner, User user){
		
				
		// Display message: User input of the book
		System.out.println("You choose to register a user");
		
		System.out.print("What is your name?  ");		
		String firstName = scanner.nextLine();			// collect data(like a Container)  = asking for the data
		user.setFirstName(firstName);					// š šsend.save@(data)šš @/ collected data send to the GetSet File
		
		System.out.print("What is your Family Name?  ");
		String lastName = scanner.nextLine();
		user.setLastName(lastName);
		
		
		System.out.print("Enter the username: ");
		// Accept the user input of the book name
		String username = scanner.nextLine();
		user.setUserName(username);
		
		System.out.print("Enter the password: ");
		//Accept the user input of the number
		String password = scanner.nextLine();
		
		//Add the user input into the hasMap
		user.setPassword(password);
		// Simple message that the book is already added in the hasMap
		System.out.println("You hava successfully registered the user.");
		
		
		// Return the hashMap
		return user;
	}

}
