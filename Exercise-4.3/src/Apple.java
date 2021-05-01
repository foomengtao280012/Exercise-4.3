
public class Apple extends Fruit{
	public Apple(String name, double price) {
		super (name, price);
	  }
	
	public String toString() {
		return "\nName\t\t: " + this.name + 
				"\nUnit Price\t: RM " +  totalPrice();
	}
}
