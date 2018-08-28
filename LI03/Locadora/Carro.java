public class Carro extends Veiculo {
	
	private double potencia;
	private int qnt_portas;

	public Carro(String marca, String modelo, String placa, int ano, double potencia, int qnt_portas) {
		
		super(marca, modelo, placa, ano);
		this.potencia = potencia;
		this.qnt_portas = qnt_portas;

	}

}

	
