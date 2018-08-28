public class Moto extends Veiculo {

	private String partida;
	private double cilindradas;

	public Moto(String marca, String modelo, String placa, int ano, String partida, double cilindradas) {
		
		super(marca, modelo, placa, ano);
		this.partida = partida;
		this.cilindradas = cilindradas;

	}

}
