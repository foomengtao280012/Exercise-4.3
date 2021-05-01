
public class GreenApple extends Apple {
	private String colour, taste;
	private double price;
	public GreenApple(String name, int quantity, String colour, String taste, double price) {
		super (name, quantity);
		this.colour = colour;
		this.taste = taste;
		this.price = price;
	}
	
	public double totalPrice() {
		return price * quantity;
	}
	
	public String toString() {
		return "\nName\t\t: " + this.name + 
				"\nQuantity\t: "+ this.quantity +
				"\nColour\t\t: "+ this.colour + 
				"\nTaste\t\t: " + this.taste + 
				"\nPrice\t\t: RM " + this.price +
				"\nTotal Price\t: RM " + totalPrice();
	}
}

