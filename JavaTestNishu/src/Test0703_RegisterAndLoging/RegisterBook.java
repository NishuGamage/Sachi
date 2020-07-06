package Test0703_RegisterAndLoging;

import java.util.Map;
import java.util.Scanner;

public class RegisterBook {
	
	// Register a book using hasMap and form user input
	protected Map<String, String> registerBook(Scanner scanner, Map<String, String> register){
		
		// Display message: User input of the book
		System.out.println("You choose to register a book");
		System.out.print("Enter the book name: ");
		// Accept the user input of the book name
		String bookName = scanner.nextLine();
		
		System.out.print("Enter the book number: ");
		//Accept the user input of the number
		String bookNo = scanner.nextLine();
		
		//Add the user input into the hasMap
		register.put(bookName, bookNo);
		// Simple message that the book is already added in the hasMap
		System.out.println("You hava successfully registered the book.");
		
		// Return the hashMap
		return register;
	}

}
