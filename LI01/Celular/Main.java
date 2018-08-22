public class Main {

	public static void main(String[] args) {
		
		Celular CelularDoLadra1 = new Celular();
		
		CelularDoLadra1.mostrarSaldo();
		
		System.out.println("\nAdicionando 29.90 ao chip de 'CelularDoLadra1'");

		CelularDoLadra1.addSaldo(29.90);

		CelularDoLadra1.mostrarSaldo();

		System.out.println("\nRemovendo 10.00 do chip de 'CelularDoLadra1'");

		CelularDoLadra1.removeSaldo(10);

		CelularDoLadra1.mostrarSaldo();

			
	}

}
