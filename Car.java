import java.util.Iterator;
import java.util.ArrayList;

interface Functional {
	
	public void function();
	
}

public class Car implements Functional  {
	
	public void function() {}

	public void run() {
	
		ArrayList<Object> parts = new ArrayList<Object>();
		
		CarPart a = new Engine();
		CarPart b = new FuelTank();
		CarPart c = new Wheels();
		
		parts.add(a);
		parts.add(b);
		parts.add(c);
		
Iterator<Object> it = parts.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}

System.out.println(it.next());
		
	}
	
}
