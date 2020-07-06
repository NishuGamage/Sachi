package Test0703_RegisterAndLoging;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class MainDemo {
	
	public static void main(String[] args) {
		ChoiceMessage choiceMessage = new ChoiceMessage();
		Answer answer = new Answer();
		Scanner scanner = new Scanner(System.in);
		Map<String, String> registeredBooks = new ConcurrentHashMap<>();
		
		choiceMessage.displyMessage();
		
		while(scanner.hasNextLine()) {
			answer.userInput(scanner, registeredBooks);
		}
	}
}