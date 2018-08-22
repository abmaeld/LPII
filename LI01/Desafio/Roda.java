public class Roda {

	private int aro;
	private int pressao;

	public void Roda() {}

	public Roda(int aro, int pressao) {

		this.aro = aro;
		this.pressao = pressao;

	}

	public void getInfo() { 
		
		
		System.out.println("Rodas:");
		System.out.println("Aro: " + this.aro);
		System.out.println("Pressão: " + this.pressao);
		
	}

}
