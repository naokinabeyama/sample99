package practice10;

public class Main {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero();

		sh.run();

		PoisonMatango m = new PoisonMatango('A');
		m.attack(sh);
	}
}
