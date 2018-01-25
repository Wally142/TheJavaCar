
import java.util.ArrayList;

public class Car  {

	public void run() {
	
		ArrayList<Object> parts = new ArrayList<Object>();
		
		CarPart a = new Engine();
		CarPart b = new FuelTank();
		CarPart c = new Wheels();
		
		parts.add(a);
		parts.add(b);
		parts.add(c);
		
		System.out.println(parts);
	}
	
}
