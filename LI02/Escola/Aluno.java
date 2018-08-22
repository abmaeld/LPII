
public class Aluno {

	private String nome;
	private Prova provas[];

	public Aluno(String nome) {
	
		this.nome = nome;
		this.provas = new Prova[2];

	} 	
	
	public double calcularMedia() {

		double media = 0;
	
		for (int i = 0; i < provas.length; i++) {
		
			media += this.provas[i].calcularNotaTotal();

		}

		media /= provas.length;

		return media;

	}

	public void adicionarProva(Prova prova, int n) {

		provas[--n] = prova;


	}

}
