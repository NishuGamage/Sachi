package Try01;

import java.util.Scanner;

public class Name {
	
	static GetSet getSet = new GetSet();
	
	public GetSet registerUser(Scanner scanner) {
		
		System.out.print("What is your name?  ");		
		String firstName = scanner.nextLine();			// collect data(like a Container)  = asking for the data
		getSet.setFirstName(firstName);					// �� ��send.save�@(data)���� �@/ collected data send to the GetSet File
		
		System.out.print("What is your Family Name?  ");
		String lastName = scanner.nextLine();
		getSet.setLastName(lastName);
		
		return getSet;
		
	}

}
