import java.util.Scanner;

	public class PersonApp {
		
		public static void main (String args[]){
			 
			 Person p;
			 Scanner sc = new Scanner(System.in);
			 //display welcome message
			 System.out.println("Welcome to the Person Tester application");
			 System.out.println("");
			 
			 String choice = "y"; 
			 while (choice.equalsIgnoreCase("y")){
				 //ask customer or employee
				 System.out.println("Create customer or employee? (c/e): ");
				 String ce = sc.nextLine();
				 //customer
				 if (ce.equalsIgnoreCase("c")){
					 Customer cstmr = new Customer();
					 System.out.println("Enter first name: ");
					 String firstName = sc.nextLine();
					 cstmr.setFirstName(firstName);
					 
					 System.out.println("Enter last name: ");
					 String lastName = sc.nextLine();
					 cstmr.setLastName(lastName);
					 				 
					 System.out.println("Enter email address: ");
					 String email = sc.nextLine();
					 cstmr.setEmail(email);
					 				 
					 System.out.println("Customer number: ");
					 String custNum = sc.nextLine();
					 cstmr.setCustNum(custNum);
					 p = cstmr; //set person object equal to customer object
					 
					System.out.println("You entered: \n" + p.getDisplayText());
				 //employee
				  }else if(ce.equalsIgnoreCase("e")){
					 Employee e = new Employee();
					 System.out.println("Enter first name: ");
					 String firstName = sc.nextLine();
					 e.setFirstName(firstName);
					 				 
					 System.out.println("Enter last name: ");
					 String lastName = sc.nextLine();
					 e.setLastName(lastName);
					 				 
					 System.out.println("Enter email address: ");
					 String email = sc.nextLine();
					 e.setEmail(email);
					 
					 System.out.println("Social Security Number: ");
					 String ssn = sc.nextLine();
					 e.setSsn(ssn);
				 
				 p = e;//set person object equal to employee object								 
				 System.out.println("You entered: \n" + p.getDisplayText());
			 }			 
			 //see if user wants to continue
			 System.out.println("Continue? (y/n): ");
			 choice = sc.nextLine();
			 
			 }//end of while loop			 
			sc.close();
		}//end of main class
		
		
		/*Below I have console from CH8 plus other methods I tried
		 
			*public static Person getCustomerInfo(String firstName, String  lastName, String email, String custNum){
			 *Customer cstmr = new Customer();
			 *Person p;
			 *cstmr.setFirstName(firstName);
			 *cstmr.setLastName(lastName);
			 *cstmr.setEmail(email);
			 *cstmr.setCustNum(custNum);
			 *p = cstmr;	
			 *return p;
		 *}
		
		public static void print(String s) {
	        System.out.println("You entered: \n" + s);
	    }
	    /*private static Scanner sc = new Scanner(System.in);
	   
	    public static void displayLine() {
	        System.out.println();
	    }

	    public static void displayLine(String s) {
	        System.out.println(s);
	    }

	    public static String getString(String prompt) {
	        System.out.print(prompt);
	        String s = sc.nextLine();
	        return s;
	    }

	    public static int getInt(String prompt) {
	        int i = 0;
	        while (true) {
	            System.out.print(prompt);
	            try {
	                i = Integer.parseInt(sc.nextLine());
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println("Error! Invalid integer. Try again.");
	            }
	        }
	        return i;
	    }	    */
}//end of PersonApp class
