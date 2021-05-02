
public class Apple extends Fruit{
	public Apple(String name, double price) {
		super (name, price);
	  }

	public void vitamin() {
		System.out.println("Apples contains vitamin A and C!");
	}
	
	public String toString() {
		return "\nName\t\t: " + this.name + 
				"\nUnit Price\t: RM " +  totalPrice();
	}
}
