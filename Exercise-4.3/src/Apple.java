
public class Apple extends Fruit{
	protected int quantity;
	protected double price;
	public Apple(String name, int quantity, double price) {
		super (name);
		this.quantity = quantity;
		this.price = price;
	  }
	
	
	public double totalPrice() {
		return this.quantity * this.price;
	}
	
	public double totalPrice(int quantity) {
		return quantity * this.price;
	}
	
	public double totalPrice(int quantity, double price) {
		return quantity * price;
	}

	public void vitamin() {
		System.out.println("Apples contains vitamin A and C!");
	}
	
	public String toString() {
		return "\nName\t\t: " + this.name + 
				"\nQuantity\t: RM " + this.quantity +
				"\nUnit Price\t: RM " + this.price +
				"\nTotal Price\t: RM "+  totalPrice();
	}
}
