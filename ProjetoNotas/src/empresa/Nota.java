package empresa;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	public Nota() {}
	
	public Nota(double nota1, double nota2, int faltas) {
		setNota1(nota1);
		setNota2(nota2);
		setFaltas(faltas);
	}
	
	public void setNota1(double nota) {
		if (nota < 0 || nota > 10) {
			System.out.println("Nota inválida!");
			return;
		}
		this.nota1 = nota;
	}

	public void setNota2(double nota) {
		if (nota < 0 || nota > 10) {
			System.out.println("Nota inválida!");
			return;
		}
		this.nota2 = nota;
	}
	
	public void setFaltas(int faltas) {
		if (faltas > 40 || faltas < 0) {
			System.out.println("Número de faltas inválido!");
			return;
		}
		this.faltas = faltas;
	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public int getFalta() {
		return this.faltas;
	}
	
	public void resultado() {
		double media = (nota1 + nota2) / 2;
		
		System.out.printf("Média: %.2f\n", media);
		
		if (faltas > 7) {
			System.out.println("Reprovado por faltas");
		}
		
		else if (media < 4) {
			System.out.println("Reprovado por nota	");
		}
		
		else if (media < 7) {
			System.out.println("Exame final");
		}
		else {
			System.out.println("Aprovado");
		}
	}
}
