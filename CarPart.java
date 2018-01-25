
interface Functional {
	
	public void function();
	
}

public class CarPart extends Car implements Functional {
	
	public void function() {}
	
	private int condition = 100 ;
	
	public void status() {
		
		condition--;
		
		System.out.println(condition);
	}

}
