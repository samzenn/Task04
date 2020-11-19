import java.lang.reflect.Method;

public class Reflectionset2 {
	
		  public static void main(String[] args) throws Exception {

		    Reflectionapi s = new Reflectionapi();
		    
			   Method m = Reflectionapi.class.getDeclaredMethod("squareY");
		       m.setAccessible(true); 
		       m.invoke(s);
		   
		 s.squareX();
		    
		//s.squareY(); // if you uncomment this you will get a compiler error
		    
		//int x = s.x;
		     
		//int y = s.y; // if you uncomment this you will get a compiler error
		    
		System.out.println("s=" + s);
		  }
		


}
