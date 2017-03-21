
public class Customer extends Person{
	private String custNum;
	
	public Customer(){
		//constructor
		super();
		//call constructor from Person superclass
		custNum = "";		
	}
	
	public void setCustNum(String custNum){
		this.custNum = custNum;
	}
	
	public String getCustNum(){
		return custNum;
	}
	
	@Override
	public String getDisplayText(){
		return super.toString() + "\nCustomer number: " + custNum;
		}
}
