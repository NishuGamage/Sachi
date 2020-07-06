package Try02;

import java.util.Scanner;

public class AnswerImpl {
		//Declaration
		// Registration of book class instantiation
//		User user = new User();
		// Search for a book class instantiation
		RegisterUserImpl register = new RegisterUserImpl();
		//Login to the page
		LoginImpl loginPage = new LoginImpl();
		// Message display class instantiation
		ChoiceMessageImpl choiceMessage = new ChoiceMessageImpl();
		
		
		// For user input choices and put it in map
		protected void userInput(Scanner scanner, User user) {
			//Accept user input 
			String userChoice = scanner.nextLine();
									//ChoiceMessage choiceMessage = new ChoiceMessage();
			switch (userChoice) {
				// Register a book 
				case "R":
					register.registerUser(scanner, user);            
					//Display again the choices
					choiceMessage.displyMessage();
					break;
				case "L":
					loginPage.logintothepage(scanner, user);
//					LogintothePage.Logintothepage(scanner, registeredBooks);
	               	//Display again the choices
					choiceMessage.displyMessage();
					break;
				// Quit the system
				case "Q":
					System.exit(0);
					break;
				// if the choices is not in the selection
				default:
					System.out.println("The input choice is not in out list. try again");
					// Display gain  the choice
					choiceMessage.displyMessage();			
			}
		}

		public static void displyMessage() {
			// TODO Auto-generated method stub
			
		}	
}
