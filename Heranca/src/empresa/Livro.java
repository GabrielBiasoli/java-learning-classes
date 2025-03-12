package empresa;

public class Livro {
	public String titulo;
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public int paginas;
	
	public Livro(String titulo, String autor, int paginas, float custoProducao, float precoVenda) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.custoProducao = custoProducao;
		this.precoVenda = precoVenda;
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
