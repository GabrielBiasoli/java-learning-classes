package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Digite um valor entre 0 e 10: ");
		Scanner teclado = new Scanner(System.in);
		int valor = teclado.nextInt();
		
		try {
			if (valor > 10 || valor < 0) {
				throw new ValorInvalidoException("Valor inválido");
			}
		}
		catch (Exception e) {
			System.out.println("Aconteceu um problema: " + e.getMessage());
		}
	}

}
