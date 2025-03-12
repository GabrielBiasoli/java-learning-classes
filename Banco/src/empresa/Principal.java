package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111,"Mário", 2000, 500);
		Conta c2 = new Conta(222, "Luigi", 2000, 500);
		
		System.out.println("Mario antes da tranferência:");
		c1.info();
		
		System.out.println("Luigi antes da transferência:");
		c2.info();
		
		c1.transferir(c2, 500);
		
		System.out.println("Mario depois da tranferência:");
		c1.info();
		
		System.out.println("Luigi depois da transferência:");
		c2.info();
		
	}

}
