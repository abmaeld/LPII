
public class Turma {

	private String nome;
	private Aluno alunos[];

	public Turma(String nome) {

		this.nome = nome;
		this.alunos = new Aluno[3];

	}

	public double calcularMedia() {

		double media = 0;
	
		for (int i = 0; i < alunos.length; i++) {
		
			media += this.alunos[i].calcularMedia();

		}

		media /= alunos.length;

		return media;

	}

	public void adicionarAluno(Aluno aluno, int n) {

		alunos[--n] = aluno;

	}


}


