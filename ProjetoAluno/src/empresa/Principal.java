package empresa;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Mário", 111, 0.1, new Curso("Engenharia de Sofware", 1000));
		
		a1.info();
		System.out.println(a1.pagamento());
		
		
	}

}
