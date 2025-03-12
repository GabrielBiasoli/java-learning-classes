package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> moedas = new ArrayList();
	
	public Cofrinho() {
	}
	
	public void add(Moeda moeda) {
		moedas.add(moeda);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Moeda m: moedas) {
			total += m.getValor();
		}
		return total;
	}
}
