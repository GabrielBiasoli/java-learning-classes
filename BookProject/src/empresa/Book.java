package empresa;

public class Book {
	
	private String title;
	private Author author;
	private String genre;
	private int edition;
	
	public Book() {}
	public Book(String title, Author author, String genre, int edition) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.edition = edition;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getEdition() {
		return edition;
	}
	
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	public void info() {
		System.out.println("Título livro: " + title);
		System.out.println("Gênero livro: " + genre);
		System.out.println("Edição: " + edition);
		author.info();
	}
}
