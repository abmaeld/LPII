public class Tanque {

	private double capacidade;

	private double volume;

	public void Tanque() {}

	public Tanque(double capacidade, double volume) {

		this.capacidade = capacidade;
		this.volume = volume;
	
	}

	public void getInfo() { 
		
		System.out.println("Tanque:");
		System.out.println("Capacidade: " + this.capacidade);
		System.out.println("Volume atual: " + this.volume);
		
	}

}
