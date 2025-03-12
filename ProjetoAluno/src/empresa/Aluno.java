package empresa;

public class Aluno {
	private String nome;
	private int matricula;
	private double desconto;
	private Curso curso;

	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void info() {
		System.out.println("Nome Aluno: " + nome);
		System.out.println("Matricula Aluno: " + matricula);
		System.out.println("Desconto Aluno: " + desconto);
		System.out.println("Curso: " + curso);
		curso.info();
	}
	
	public double pagamento() {
		return curso.getMensalidade() * (1 - desconto);
	}

}
