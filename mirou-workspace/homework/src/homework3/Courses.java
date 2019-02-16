package homework3;

public class Courses implements Picture  {

	
	String []  courseName =new String[4] ;
	int moduleNumber;
	
	public Courses() {}
	public Courses(int moduleNumber ) {
		this.moduleNumber =moduleNumber;
	}
	
	
	public void getStudentPicture() {
		System.out.println("Please upload your picture");
		
	}
	
	
	public void courses() {
		
		courseName[1]="Computer Science";
		courseName[2]="Electrical Engineer";
		courseName[3]="Architectural Engineer";
		System.out.println("This are our courses:");
		for(int i=1;i<4;i++) {
		System.out.println(courseName[i]);	
		}
	}



}
