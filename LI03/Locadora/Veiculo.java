public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private int ano;

	public Veiculo(String marca, String modelo, String placa, int ano) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;

	}

	public String print() {

		return this.marca + ' ' + this.modelo + ' ' + this.ano + " - " + this.placa;
	
	}

}
	
	
