package empresa;

public class Main {

	public static void main(String[] args) {

		DigitalBook dBook = new DigitalBook("Senhor dos Anéis",
				new Author("Tolkien", "Britânico", "tolkien@email.com"),
				"Aventura",
				5,
				10000,
				3500);
		
		dBook.info(); 
	}

}
