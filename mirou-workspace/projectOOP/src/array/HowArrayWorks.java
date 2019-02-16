package array;
import java.util.Scanner;
public class HowArrayWorks {
    
	public static void main(String[] args) {
		
		int [] array1 = new int [5];
		String [] array2 = new String [5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<array1.length;i++) {
			array1 [i]= input.nextInt();
		}
		
		for(int j=0; j<array1.length;j++) {
			System.out.println(array1[j]+" ");
		}
		
		for(int k=0; k<array2.length;k++) {
			array2[k]=input.nextLine();
		}
		for(int l=0; l<array2.length;l++) {
			System.out.println(array2[l]); 
		}
		
		input.close();
   array1[4]=35;
   System.out.println(array1[4]);
}
}
