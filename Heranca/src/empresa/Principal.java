package empresa;

public class Principal {

	public static void main(String[] args) {

		Livro l1 = new Livro();
		l1.imposto();
		
		LivroDigital l2 = new LivroDigital("Sherlock Holmes", "Sir Arthur Conan Doyle", "http://meusite.com/sherlock");
		l2.imposto();
		
		System.out.println(l1 instanceof Livro);
	}

}
