package singleton;

public class Singleton {

		
		private Singleton() {}
		
	
	
   public static Singleton getInstance() {
	   Singleton single = new Singleton();
	   return single;
   }

   public void eureka () {
	   System.out.println("Ahh singleton works like that");
   }
}
