package LoginRegister;

import java.util.Scanner;

public class Login {
	
	static  GetSet getset = new GetSet();	    //getting relation with GetSet file
	
	public GetSet registerUser(Scanner scanner) {		
		System.out.print("What is your name?  ");		
		String firstName = scanner.nextLine();			// collect data(like a Container)  = asking for the data
		getset.setFirstName(firstName);					// š šsend.save@(data)šš @/ collected data send to the GetSet File
		
		System.out.print("What is your Family Name?  ");
		String lastName = scanner.nextLine();
		getset.setLastName(lastName);
		
		System.out.print("Insert username =  ");
		String userName = scanner.nextLine();
		getset.setUserName(userName);
		
		System.out.print("Insert Password =  ");
		String password = scanner.nextLine();
		getset.setPassword(password);
		
		return getset;
	}
}