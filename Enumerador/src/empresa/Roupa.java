package empresa;

enum Estacao {
	VERAO,
	OUTONO,
	INVERNO,
	PRIMAVERA
}

enum Tamanho  {
	PP,
	P,
	M,
	G,
	GG
}

public class Roupa {
	String modelo;
	Tamanho tamanho;
	Estacao colecao;
	
	public Roupa(String modelo, Tamanho tamanho, Estacao colecao) {
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.colecao = colecao;
	}
	
	public void msg() {
		switch (colecao) {
		case VERAO:
			System.out.println("Arrase na pista!");
			break;
		case OUTONO:
			System.out.println("Passe o outono com elegância!");
			break;
		case INVERNO:
			System.out.println("Se agasalhe bem e com estilo!");
			break;
		case PRIMAVERA:
			System.out.println("Se vista na estação das flores!");
			break;
		}
	}
}
