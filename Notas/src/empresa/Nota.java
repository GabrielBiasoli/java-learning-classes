package empresa;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	public int getFaltas() {
		return faltas;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	public void setNota1(double nota) {
		if (nota < 0 || nota > 10) {
			System.out.println("Nota inválida!");
			return ;
		}
		
		this.nota1 = nota;
	}
	
	public void setNota2(double nota) {
		if (nota < 0 || nota > 10) {
			System.out.println("Nota inválida!");
			return ;
		}
		this.nota2 = nota;
	}
	
	public void resultado() {
		
		double media = (nota1 + nota2) / 2;
		System.out.printf("Media: %.2f \n", media);
		
		if (faltas > 7) {
			System.out.println("Reprovado por faltas");
		}
		else if (media < 4) {
			System.out.println("Reprovado por nota");
		}
		else if (media < 7) {
			System.out.println("Exame Final");
		}
		else {
			System.out.println("Aprovado!");
		}
	}
	
}
