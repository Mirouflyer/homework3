package abstraction;

import java.util.Scanner;

public class Plane extends AirPlaneShow {


	public void fly() {
		
    System.out.println("The plane must have a special wings");
		
	}

	
	public void propultionType() {
	System.out.println("The plane must have at least one reactror ");	
		
	}


	public void planeType() {
	System.out.println("");	
		
	}

	
	public void pilotTest() {
	System.out.println("");	
		
	}
	
	public void location( ) {
		String []location = new String[5];
		Scanner input = new Scanner(System.in);
	   for(int i=0; i<location.length;++i) {
		   location [i] = input.nextLine();
	   }
	   
	   for(int j=0; j<location.length;++j) {
		   System.out.println(location[j]);
	   }
	   input.close();

}
}
