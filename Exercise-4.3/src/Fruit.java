
public class Fruit {
	protected String name;
	public Fruit(String name) {
		this.name = name;
	    System.out.println(name + " constructor is invoked");
	  }
	
	public void vitamin() {
		System.out.println("\nFruits are generally rich in vitamin C!");
	}
}
