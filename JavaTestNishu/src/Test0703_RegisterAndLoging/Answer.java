package Test0703_RegisterAndLoging;

import java.util.Map;
import java.util.Scanner;

public class Answer {
	//Declaration
	// Registration of book class instantiation
	RegisterBook bookRegister = new RegisterBook();
	// Search for a book class instantiation
	SearchBook searchBook = new SearchBook();
	// Message display class instantiation
	ChoiceMessage choiceMessage = new ChoiceMessage();
	
	// For user input choices and put it in map
	protected void userInput(Scanner scanner, Map<String, String> registeredBooks) {
		//Accept user input 
		String userChoice = scanner.nextLine();
		
		switch (userChoice) {
			// Register a book 
			case "r":
				bookRegister.registerBook(scanner, registeredBooks);            
				//Display again the choices
				choiceMessage.displyMessage();
				break;
			// Search for a book
			case "s":
				searchBook.serchForBook(scanner, registeredBooks);
               	//Display again the choices
				choiceMessage.displyMessage();
				break;
			// Quit the system
			case "q":
				System.exit(0);
				break;
			// if the choices is not in the selection
			default:
				System.out.println("The input choice is not in out list. try again");
				// Display gain  the choice
				choiceMessage.displyMessage();			
		}
	}
}