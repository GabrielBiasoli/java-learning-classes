package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int peso;
		double altura;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o peso:");
		peso = teclado.nextInt();
		System.out.println("Informe a altura:");
		altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("O IMC é %.2f", imc);
	}

}
