
public class Main {

	public static void main(String[] args) {

		Turma Turma1 = new Turma("Turma 01");

		Aluno Aluno1 = new Aluno("Aluno 01");
		Aluno1.adicionarProva(new Prova(4.0, 2.5), 1); 
		Aluno1.adicionarProva(new Prova(1.0, 7.0), 2); 
		Turma1.adicionarAluno(Aluno1, 1);
		
		Aluno Aluno2 = new Aluno("Aluno 02");
		Aluno2.adicionarProva(new Prova(6.5, 3.5), 1);
		Aluno2.adicionarProva(new Prova(0.0, 3.0), 2);
		Turma1.adicionarAluno(Aluno2, 2);

		Aluno Aluno3 = new Aluno("Aluno 03");
		Aluno3.adicionarProva(new Prova(5.0, 4.0), 1);
		Aluno3.adicionarProva(new Prova(6.0, 1.5), 2);
		Turma1.adicionarAluno(Aluno3, 3);

		System.out.println(Turma1.calcularMedia());	

	}

}
