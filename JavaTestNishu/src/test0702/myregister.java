package test0702;

public class myregister {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	
	// getters
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	
	//setters
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
//	@Override
//	public String toString() {
//		return firstName  + lastName;
//	}
}
