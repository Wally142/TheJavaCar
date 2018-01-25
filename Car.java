
import java.util.ArrayList;

interface Functional {
	
	public void function();
	
}

public class Car implements Functional  {
	
	public void function() {}

	public void run() {
	
		ArrayList<Object> parts = new ArrayList<Object>();
		
		CarPart a = new Engine();
		a.function();
		CarPart b = new FuelTank();
		b.function();
		CarPart c = new Wheels();
		c.function();
		
		parts.add(a);
		parts.add(b);
		parts.add(c);
		
		for (Object it : parts) { 		      
	           System.out.println(it); 		
	      }


		
	}
	
}
