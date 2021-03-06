
public abstract class Person {
	private String firstName;
	private String lastName;
	private String email;
	
	public Person(){
		//constructor
		firstName = "";
		lastName = "";
		email = "";
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getlarstName(){
		return lastName;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}

	@Override
	public String toString(){
		return "Name: " + firstName + " " + lastName + "\nEmail: " + email;
	}
	
	public abstract String getDisplayText();
}
