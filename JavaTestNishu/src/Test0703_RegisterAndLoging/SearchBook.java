package Test0703_RegisterAndLoging;

import java.util.Map;
import java.util.Scanner;

public class SearchBook {
	
	// Search a book using user input and search in the existing data in hashMap
	protected void serchForBook(Scanner scanner, Map<String, String> registeredBooks) {
		// Display message
		System.out.println("You choose to serch for a book");
		System.out.print("Plece input a keyword ");
		// Store the input user keyword
		String keyword = scanner.nextLine();
		
		//Search in the exiting hashMap the keyword that the user inputed
		if(registeredBooks.containsKey(keyword)) {
        	// If found: return a simple message that the book  is found using the keyword
			System.out.println("The book '"+ keyword + "' is found in the library!");
		}else {
			// Display a message that book (keyword) is not found
			System.out.println("Sorry we couldn't found what you are looking for.");
		}
	}
	
	
}
