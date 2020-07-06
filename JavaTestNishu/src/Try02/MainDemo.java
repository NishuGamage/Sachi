package Try02;

import java.util.Scanner;

public class MainDemo {
	
	public static void main(String[] args) {
		ChoiceMessageImpl choiceMessage = new ChoiceMessageImpl();
		AnswerImpl  answer = new AnswerImpl();
		User user = new User();
		Scanner scanner = new Scanner(System.in);
				
		choiceMessage.displyMessage();
		
		while(scanner.hasNextLine()) {
			answer.userInput(scanner, user);
		}
	}
}