import java.lang.reflect.Field;

/*
 * This experiment proves not only the value of private field accessed, but this experiment shows that can be altered
 */

public class Reflectionset8 {
	public static void main(String[] args) throws Exception {
	    Reflectionapi Mclass = new Reflectionapi();
	    Field[] fields = Mclass.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);
	    for (Field f : fields) {
	      f.setAccessible(true);
	      long x = f.getLong(Mclass);
	      x++;
	      f.setLong(Mclass, x);
	      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
	          f.getType(), f.getLong(Mclass));
	    }
	  }

}
