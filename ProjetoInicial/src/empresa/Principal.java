package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade = 16;
		String nome = "Mario";
		idade = idade + 2;
		
		double peso = 72.5;
		float peso2 = 80.6f; 
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Digite seu nome, idade e peso:");
		nome = teclado.next();
		peso = teclado.nextDouble();
		idade = teclado.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.printf("Idade: %d\n", idade );
		System.out.printf("Peso: %.2f\n", peso);
		
		if (idade < 18) {
			System.out.println("Acesso bloqueado");
		}
		else if (idade < 65) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor: " + i);
		}
		
		// array
		int megaSena[] = {11 ,14, 21, 30, 37, 56};
		int numeros[] = new int[200];
		
		megaSena[0] = 10;
		 
		System.out.println(numeros[0]);
		System.out.println(numeros[50]);

	
	}

}
