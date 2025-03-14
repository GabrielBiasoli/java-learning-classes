package empresa;

public class Livro {
	public String titulo;
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public int paginas;
	
	public Livro() {}
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public float lucro() {
		return precoVenda - custoProducao;
	}
	
	public void imprimirTitulo() {
		System.out.println("O titulo: " + titulo);
	}
	
	public float imposto() {
		return 0.2f * lucro();
	}
	
}
