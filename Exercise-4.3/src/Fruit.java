
public class Fruit {
	protected String name;
	protected double price;
	public Fruit(String name, double price) {
		this.name = name;
		this.price = price;
	    System.out.println(name + " constructor is invoked");
	  }
	
	public void vitamin() {
		System.out.println("\nFruits are generally rich in vitamin C!");
	}
	
	public double totalPrice() {
		return price;
	}
}
