
public class Main {

	public static void main(String[] args) {
		Fruit f = new Fruit("Fruit", 1.0);
		f.vitamin();
		System.out.println();
		
		Apple a = new Apple("Apple", 1.2);
		System.out.println(a);
		a.vitamin();
		System.out.println();
	    
		RedApple b = new RedApple("Red Apple", "Red", "Sweet", 4, 1.4);
		System.out.println(b);
		b.vitamin();
		System.out.println();
	    
		GreenApple c = new GreenApple("Green Apple", "Green", "Sour", 5, 1.2);
		System.out.println(c);
		c.vitamin();
		System.out.println();
	    
		Orange d = new Orange("Orange", "Orange", "Sweet", 1, 0.7);
		System.out.println(d);
		d.vitamin();
		System.out.println();
	    
		Strawberry e = new Strawberry("Strawberry", "Red", "Sweet", 3, 0.8, 5);
		System.out.println(e);
		e.vitamin();
		System.out.println();
	}

}
