public class Celular {

	private double Saldo;

	public Celular() {

		Saldo = 0;

	}

	public void addSaldo(double bonus) {

		if (bonus > 0) {

			this.Saldo += bonus;

		}

		else {

			return;

		}

	}

	public void removeSaldo(double onus) {

		if (this.Saldo > onus) {

			this.Saldo -= onus;
		
		}

		else {

			return;

		}

	}

	public void mostrarSaldo() {

		System.out.println("\nSaldo: " + this.Saldo);

	}

}
