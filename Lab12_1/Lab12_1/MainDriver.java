public class MainDriver {
	public static void main(String[] args) {
		Movie m1 = new Movie("Raiders of the Lost Ark", Movie.REGULAR);
		Movie m2 = new Movie("Batman and Superman", Movie.NEW_RELEASE);
		Movie m3 = new Movie("Wizard of Oz", Movie.CHILDRENS);
		
		Customer c1 = new Customer("Joe");
		Customer c2 = new Customer("Jane");
		
		Rental r1 = new Rental(m1, 3);
		Rental r2 = new Rental(m2, 2);
		Rental r3 = new Rental(m3, 2);

		c1.addRental(r1);
		c2.addRental(r2);
		c2.addRental(r3);
		
		System.out.println(c1.statement());
		System.out.println("-----");
		System.out.println(c2.statement());
	}
		
}
