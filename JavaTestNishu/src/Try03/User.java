package Try03;

public class User {
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	
	
	// getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName ;
	}
	public String getUserName() {
		return username;
	}
	public String getPassaword() {
		return password;
	}

	
	// setters
	public void setFirstName(String firstName ) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName ) {
		this.lastName = lastName;
	}
	public void setUserName(String userName ) {
		this.username = userName;
	}
	public void setPassword(String password ) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + "Wellcome to the page" ;
	}

}
