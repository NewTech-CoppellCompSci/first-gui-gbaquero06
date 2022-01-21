package lab;

public class House {
	// parameters
	private int sqfoot;
	private double bath;
	private int bedroom;
	private int price;
	private String address;
	private double lot;
	private boolean pool;
	private String image;
	
	// constructor

	public House(int sqfoot, double bath, int bedroom, int price, String adress, double lot, boolean pool,
			String image) {
		this.sqfoot = sqfoot;
		this.bath = bath;
		this.price = price;
		this.address = adress;
		this.lot = lot;
		this.pool = pool;
		this.image = image;
		this.bedroom=bedroom;
		
	}

	// getter methods
	public int sqfoot() {
		return sqfoot;
	}

	public double bath() {
		return bath;
	}

	public int bedroom() {
		return bedroom;
	}

	public int price() {
		return price;
	}

	public String address() {
		return address;
	}

	public double lot() {
		return lot;
	}

	public boolean pool() {
		return pool;
	}

	public String image() {
		return image;
	}
	
	public static void add(House house) {
	}
//to string method
	@Override
	public String toString() {
		return sqfoot +" "+ bath +" "+ bedroom +" "+ price +" "+ address +" "+ lot +" "+ pool +" "+ image+" ";

	}

}
