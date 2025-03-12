package empresa;

public class Principal {

	public static void main(String[] args) {

		Nota Mario = new Nota();
		
		Mario.setNota1(9);
		Mario.setNota2(5);
		Mario.setFaltas(5);
		
		Mario.resultado();
		
		Mario.setNota1(7);
		Mario.setFaltas(10);
		Mario.resultado();
		
		Mario.setNota1(1);
		Mario.resultado();
		
		Mario.setNota1(11);
	}

}
