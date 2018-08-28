import java.util.*;

public class Main {

	public static void main(String args[]) {

		ArrayList<Veiculo> Veiculos = new ArrayList<>();
		
		Veiculos.add(new Carro("Chevrolet", "Celta", "MYR7964", 2009, 1.0, 4));
		Veiculos.add(new Moto("Yamaha", "Fazer", "XYZ1234", 2010, "Manual", 150));

		for (int i = 0; i < Veiculos.size(); i++) {

			System.out.println(i + ": " + Veiculos.get(i).print());
			
		}

	}

}
