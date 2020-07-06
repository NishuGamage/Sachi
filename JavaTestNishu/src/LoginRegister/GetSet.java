package LoginRegister;

public class GetSet {
	
	//calling to the database 	(get those data form Login file)
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
	
	// getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassaword() {
		return password;
	}
	
	
	// setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return firstName  + lastName;
	}
}
