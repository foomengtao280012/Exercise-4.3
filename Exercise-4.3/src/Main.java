
public class Main {

	public static void main(String[] args) {
		Apple a = new Apple("Apple", 3);
		System.out.println(a);
		System.out.println();
	    
		RedApple b = new RedApple("Red Apple", 4, "Red", "Sweet", 1.4);
		System.out.println(b);
		System.out.println();
	    
		GreenApple c = new GreenApple("Green Apple", 5, "Green", "Sour", 1.2);
		System.out.println(c);
		System.out.println();
	    
		Orange d = new Orange("Orange", "Orange", "Sweet", 1, 0.7);
		System.out.println(d);
		System.out.println();
	    
		Strawberry e = new Strawberry("Strawberry", "Red", "Sweet", 3, 0.8, 5);
		System.out.println(e);
		System.out.println();
	}

}
