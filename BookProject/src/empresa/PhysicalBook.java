package empresa;

public class PhysicalBook extends Book {
	
	private int weight;
	
	public PhysicalBook() {}
	public PhysicalBook(String title, Author author, String genre, int edition, int weight) {
		super(title, author, genre, edition);
		this.weight = weight;
	}

	public PhysicalBook(int weight) {
		super();
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("Peso: " + weight);
	}
}
