import java.lang.reflect.Field;

public class Reflectionset5 {
	public static void main(String[] args) throws Exception {
	    Reflectionapi mcls = new Reflectionapi();
	    Field[] fields = mcls.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);

	    for (Field f : fields) {
	      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
	          f.getType(), f.getInt(mcls));
	    }
	  }
}
