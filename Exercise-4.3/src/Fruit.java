
public class Fruit {
	protected String name;
	protected double price;
	public Fruit(String name, double price) {
		this.name = name;
		this.price = price;
	    System.out.println(name + " constructor is invoked");
	  }
	
	public double totalPrice() {
		return price;
	}
}
