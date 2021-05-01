
public class RedApple extends Apple {
	private String colour, taste;
	private int quantity; 
	private double price;
	public RedApple(String name, String colour, String taste, int quantity, double price) {
		super (name, price);
		this.colour = colour;
		this.taste = taste;
		this.quantity = quantity;
		this.price = price;
	}
	
	public double totalPrice(int quantity) {
		return price * quantity;
	}
	
	public String toString() {
		return "\nName\t\t: " + this.name + 
				"\nColour\t\t: "+ this.colour + 
				"\nTaste\t\t: " + this.taste + 
				"\nQuantity\t: "+ this.quantity +
				"\nUnit Price\t: RM " + this.price +
				"\nTotal Price\t: RM " + totalPrice(quantity);
	}
}
