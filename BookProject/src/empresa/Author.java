package empresa;

public class Author {
	
	private String name;
	private String email;
	private String nationality;
	
	public Author() {}
	public Author(String name, String email, String nationality) {
		this.name = name;
		this.email = email;
		this.nationality = nationality;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void info() {	
		System.out.println("Nome Autor: " + name);
		System.out.println("Nacionalidade: " + nationality);
		System.out.println("Email: " + email);
	}
}
