import java.lang.reflect.Field;

public class Reflectionset4 {

	public static void main(String[] args) throws Exception {
	    Reflectionapi s = new Reflectionapi();
	    Field[] fields = s.getClass().getFields();
	    System.out.printf("There are %d fields\n", fields.length);
	    for (Field f : fields) {
	      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
	          f.getType(), f.getLong(s));
	    }
	  }
	
}
