import java.lang.reflect.Field;

/*
 * "This experiment shows that data integrity is not as solid as first,
 * this manages to obtain the name and value of the private member,
 * it has done by setting accessibility flag to true.
 * by calling setAccesibile(true) that code ask to switch data hiding off
 */

public class Reflectionset7 {

	public static void main(String[] args) throws Exception {
	    Reflectionapi Mclass = new Reflectionapi();
	    Field[] fields = Mclass.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);

	    for (Field f : fields) {
	      f.setAccessible(true);
	      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
	          f.getType(), f.getLong(Mclass));
	    }
	  }
}
