package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario funcionarios[] = {	new Assalariado("Mário", 3500),
										new Horista("Luigi", 100, 40.5f),
										new Comissionado("Yoshi", 50000, 0.05f)};
		
		Funcionario f;
		float total = 0;
		for (int i = 0; i < funcionarios.length; i++) {
			f = funcionarios[i];
			System.out.println(f.nome + " - salário: " + f.pagamento());
			total += f.pagamento();
		}
		
		System.out.println("Total: R$" + total);
	}

}
