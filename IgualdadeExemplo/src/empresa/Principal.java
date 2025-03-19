package empresa;

public class Principal {

	public static void main(String[] args) {
		Usuario u1 = new Usuario(111, "Mário", "111222333");
		Usuario u2 = new Usuario(111, "Mário", "111222333");
		Usuario u3 = u1;
		
		System.out.println(u1 == u2);
		System.out.println(u1 == u3);

		System.out.println();
		
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
	}

}
