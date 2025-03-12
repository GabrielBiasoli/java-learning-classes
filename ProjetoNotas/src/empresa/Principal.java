package empresa;

public class Principal {

	public static void main(String[] args) {
		Nota mario = new Nota();
		mario.setNota1(9);
		mario.setNota2(1);
		
		mario.resultado();
		
		mario.setNota1(2);
		mario.setFaltas(8);
		
		mario.resultado();
		
	}

}
