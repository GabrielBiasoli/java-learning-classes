package empresa;

public class LivroDigital extends Livro {
	public String linkDownload;
	public int tamanhoMB;
	
	public LivroDigital(String linkDownload, int tamanhoMB) {
		super();
		
	}
	
	public float imposto() {
		return 0.2f * lucro() + 2;
	}
	
	public float tamanhoPorPagina() {
		return tamanhoMB/ (float) paginas;
	}
}
