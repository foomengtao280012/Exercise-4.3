
public class Apple extends Fruit{
	protected int quantity;
	public Apple(String name, int quantity) {
		super (name);
		this.quantity = quantity;
	  }
	
	public String toString() {
		return "\nName\t\t: " + this.name + 
				"\nQuantity\t: "+ this.quantity;
	}
}
