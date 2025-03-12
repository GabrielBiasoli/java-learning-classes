package empresa;

public class Curso {
	private String nome;
	private double mensalidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public Curso(String nome, double mensalidade) {
		super();
		this.nome = nome;
		this.mensalidade = mensalidade;
	}

	public void info() {
		System.out.println("Nome Curso: " + nome);
		System.out.println("Mensalidade Curso: " + mensalidade);

	}
	
}
