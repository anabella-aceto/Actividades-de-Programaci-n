import java.util.HashMap;
import java.util.Map;

public class TestMapas {

	public static void main(String[] args) {
		Map<Integer, String> nombres;
		
		nombres= new HashMap<>();
		
		nombres.put(1, "Tomás");
		nombres.put(2, "Esteban");
		nombres.put(3, "Andrea");
		nombres.put(3, "Carmen");
		
		for(String ele: nombres.values()) {
			System.out.println(ele);
		}
		}
		//Al haber dos nombres con valor 3, machaca el último
	}


