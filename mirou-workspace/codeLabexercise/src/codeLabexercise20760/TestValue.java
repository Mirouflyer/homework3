package codeLabexercise20760;

public class TestValue {

	public static void main(String[] args) {

	Value cal = new Value(4);
	cal.getValue();
	cal.setValue(45);
	
    cal.wasModified();
		
		int v = 20 ;
		++v;
		System.out.println(++v);
		
		String firstName = "Samir";
		String familyName = "Ait Ouatrab";
		
		System.out.println(firstName+"\n"+familyName);//In order to print in new line we use "\n".
		
		
	    String a =	"CRAZY!\n\\\t\\\\\\\\\\n. . . .\\ \\\r\007'\\'\"TOOMUCH!";
	    int b = a.length();
	    System.out.println(b); 
		
	}
	
}