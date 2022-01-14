package lab;

public class House {
	// parameters
	private int sqfoot = 0;
	private double bath = 0;
	private int bedroom = 0;
	private int price;
	private String adress = "";
	private double lot;
	private boolean pool;
	private String image;
	// constructor

	public House(int sqfoot, double bath, int bedroom, int price, String adress, double lot, boolean pool,
			String image) {
		this.sqfoot = sqfoot;
		this.bath = bath;
		this.price = price;
		this.adress = adress;
		this.lot = lot;
		this.pool = pool;
		this.image = image;
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

	public String adress() {
		return adress;
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

	@Override
	public String toString() {
		return sqfoot + bath + bedroom + price + adress + lot + pool + image;

	}

}
