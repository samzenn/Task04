import java.lang.reflect.Method;

/*
 * In this example have call to the illusive private method setA,
 * it demonstrate rules that learn in encapsulation in object oriented programming can be broken
 */

public class Reflectionset10 {

	public static void main(String[] args) throws Exception {
	    Reflectionapi Mclass = new Reflectionapi();
	    
	Method m = Mclass.getClass().getDeclaredMethod("setA", long.class);
	    m.setAccessible(true);
	    m.invoke(Mclass, 76);
	    System.out.println(Mclass);
	  }
	
}
