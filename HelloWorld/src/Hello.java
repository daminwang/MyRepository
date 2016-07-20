import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Hello {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:SS");
		System.out.println("Hello World!" + df.format(cal.getTime()));
	}

}
