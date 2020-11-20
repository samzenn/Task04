import java.lang.reflect.Field;

public class Reflectionset5 {
	public static void main(String[] args) throws Exception {
	    Reflectionapi mcls = new Reflectionapi();
	    Field[] fields = mcls.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);
//Access the private field using getDeclaredFields() and call field.setAccessible(true) 
	    for (Field f :  mcls.getClass().getDeclaredFields()) {
	    	f.setAccessible(true);
		    Object o;
	      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
	          f.getType(), f.getLong(mcls));
	    }
	  }
}
