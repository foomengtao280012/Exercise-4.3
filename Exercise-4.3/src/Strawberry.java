
public class Strawberry extends Fruit{
	private String colour, taste;
	private int quantity; 
	private double weight;
	public Strawberry(String name, String colour, String taste, int quantity, double weight, double price) {
		super (name, price);
		this.colour = colour;
		this.taste = taste;
		this.quantity = quantity;
		this.weight = weight;
		this.price = price;
	}
	
	public double totalPrice(int quantity, double weight) {
		return price * quantity * weight;
	}
	
	public String toString() {
		return "\nName\t\t: " + this.name +
				"\nColour\t\t: "+ this.colour + 
				"\nTaste\t\t: " + this.taste +  
				"\nNumber of box\t: "+ this.quantity + 
				"\nWeight\t\t: "+ this.weight + "kg" +
				"\nPrice per kg\t: RM " + this.price +
				"\nTotal Price\t: RM " + totalPrice(quantity, weight);
	}
}
