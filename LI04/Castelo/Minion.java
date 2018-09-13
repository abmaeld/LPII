
public class Minion extends Entity {

	private int health;
	private int strength;
	private int resistence;
	private double crit;

	public Minion(int health, int strength, int resistence, double crit) {

		super('?');

		if (this instanceof Samurai) {
		
			this.setGrapheme('S');

		}

		else if (this instanceof Paladin) {

			this.setGrapheme('P');

		}

		this.health = health;
		this.strength = strength;
		this.resistence = resistence;
		this.crit = crit;		

	}

}
