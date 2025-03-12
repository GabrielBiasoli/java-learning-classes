package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Turma nova = new Turma();
		
		nova.prof = new Professor();
		nova.prof.nome = "Leonardo";
		
		nova.alunos = new ArrayList();
		//nova.alunos.add(new Aluno());
		//nova.alunos.get(0).nome = "Super Mario";
		
		Aluno b = new Aluno(1002, "Super Luigi", "111.222.333-5");
		b.info();
	}
}
