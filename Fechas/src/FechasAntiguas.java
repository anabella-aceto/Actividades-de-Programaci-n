import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechasAntiguas {

	public static void main(String[] args) {
		
		
		Date mifecha = new  Date();
		String fechaAlata = "2023-01-12";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd"); 
		
		try {
		mifecha = sdf.parse(fechaAlata);
		}
		catch(ParseException e) {
			System.out.println("error de fecha");
			e.printStackTrace();
		}
		System.out.println(fechaAlata);

	}

}
