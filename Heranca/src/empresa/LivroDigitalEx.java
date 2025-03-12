package empresa;

public class LivroDigitalEx {
	public String[] autores;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	
	// Novo
	public String linkDownload;
	public int tamanhoMB;
	
	
	public float lucro() {
		return precoVenda - custoProducao;
	}
	
	public void imprimirTitulo() {
		System.out.println("O titulo: " + titulo);
	}
	
	// Mudou
	public float imposto() {
		return 0.2f * lucro() + 2;
	}
	
	// Novo
	public float tamanhoPorPagina() {
		return tamanhoMB/ (float) paginas;
	}
}
