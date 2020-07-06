package Try01;

import java.util.Scanner;

public class Output {
											
	static Login login = new Login();		//calling to the Login page
	static GetSet getset = new GetSet();	//calling to the GetSet page
	static Name name = new Name();
	
	public static void main(String[] args) { //ššš Main method
		
		try(Scanner scanner = new Scanner (System.in)){		// insert data
			
			getset = login.registerUser(scanner);
			
			System.out.print("Enter username = ");
			String userName = scanner.nextLine();
			
			System.out.print("Enter password = ");
			String  password = scanner.nextLine();
			
			if(!getset.getUserName().contains(userName)) {
				System.out.println("User dose not exist");
			}else {
				System.out.println("User dose exist");
			}
		}
	}
	

}