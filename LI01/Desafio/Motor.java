public class Motor {

	private String tipo_de_combustivel;
	private double cilindradas;
	private boolean ligado;

	public void Motor() {}

	public Motor(String tipo_de_combustivel, double cilindradas) {
		
		this.tipo_de_combustivel = tipo_de_combustivel;
		this.cilindradas = cilindradas;
		this.ligado = false;

	}

	public void getInfo() { 
		
		System.out.println("Motor:");
		System.out.println("Tipo de Combustível: " + this.tipo_de_combustivel);
		System.out.println("Cilindradas: " + this.cilindradas);
		
	}


}

	
