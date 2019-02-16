package homework3;

import java.util.Scanner;

public class StudentInformation {
	
	private String stName = null;
	private String stDateOfBirth =null;
	private String address =null;
	
	  Scanner input = new Scanner(System.in);
	
	
	public String getStName() {
		return stName;
	}
	public void setStName() {		
		
		System.out.println("Enter a name: ");
		stName=input.nextLine();
	}
	public String getStDateOfBirth() {
		return stDateOfBirth;
	}
	public void setStDateOfBirth() {
	
		System.out.println("Enter the date of birth: ");
		stDateOfBirth=input.nextLine();
	}
	public String getAddress() {
		return address;
	}
	public void setAddress() {
		
		System.out.println("Enter the Address: ");
		address=input.nextLine();
	}
	
  
}
