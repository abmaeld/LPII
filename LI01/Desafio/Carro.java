public class Carro {

	private Roda rodas[];
	private Porta portas[];
	private Motor motor;
	private Tanque tanque;

	private String modelo;
	private int num_portas;
	private int num_rodas;
	private String cor;
	private int ano;
	private int marchas;
	private double velocidade;

	public Carro() {}

	public Carro(String modelo, String tipo_de_combustivel, double cilindradas, String cor, int ano, int marchas, double velocidade, int aro, int pressao, double capacidade, double volume) {

		this.modelo = modelo;
		this.num_portas = 4;
		this.num_rodas = 4;
		this.cor = cor;
		this.ano = ano;
		this.marchas = marchas;
		this.velocidade = velocidade;
		this.motor = new Motor(tipo_de_combustivel, cilindradas);
		this.tanque = new Tanque(capacidade, volume);

		portas = new Porta[num_portas];
		rodas = new Roda[num_rodas];

		for (int i = 0; i < num_rodas; i++) {

			rodas[i] = new Roda(aro, pressao);

		}

		for (int i = 0; i < num_portas; i++) {

			portas[i] = new Porta();

		}

	}

	public void getInfo() { 
		
		System.out.println();
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Portas: " + this.num_portas);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Marchas: " + this.marchas);
		System.out.println();
		this.motor.getInfo();
		System.out.println();
		this.tanque.getInfo();
		System.out.println();
		this.rodas[0].getInfo();
		System.out.println();

	}

}
