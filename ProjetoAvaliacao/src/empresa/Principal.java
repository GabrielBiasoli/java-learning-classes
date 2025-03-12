package empresa;package empresa;

public class Principal {

	public static void main(String[] args) {
		Avaliacao mario = new Avaliacao(7, 4, 10);
		
		System.out.println("Média Aritmetica do Mário: " + mario.mediaAritmetica());
		System.out.println("Média ponderada do Mário: " + mario.mediaPonderada());
		
	}

}
