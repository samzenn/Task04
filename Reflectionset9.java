import java.lang.reflect.Method;

/*
 * This experiment shows reflections not only be used to access data
 * in here demonstrate the names and parameter types for methods can be found in the Reflectionapi class
 * this version not return a not return a reference for a private method setA & private squareY
 * but can easily found a way to access private methods
 */

public class Reflectionset9 {
	 public static void main(String[] args) throws Exception {
		    Reflectionapi Mclass = new Reflectionapi();
		    Method[] methods = Mclass.getClass().getMethods();
		    System.out.printf("There are %d methods\n", methods.length);

		    for (Method m : methods) {
		      System.out.printf("method name=%s type=%s parameters = ", m.getName(),
		          m.getReturnType());
		      Class[] types = m.getParameterTypes();
		      for (Class c : types) {
		        System.out.print(c.getName() + " ");
		      }
		      System.out.println();
		    }
		  }
}
