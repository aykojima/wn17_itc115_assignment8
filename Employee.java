
public class Employee extends Person{
	private String ssn;
	
	public Employee(){
		//constructor
		super();
		//call constructor from Person superclass
		ssn = "";		
	}
	
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	
	public String getSsn(){
		return ssn;
	}
	
	@Override
	public String getDisplayText(){
		return super.toString() + "\nSocial security number: " + ssn;
		}
}
