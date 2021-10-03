package practice10_2;

public class PoisonMatango extends Matango {
	int p = 5;

	public PoisonMatango(char c) {
		super(c);
	}

	public void attack() {
		super.attack();
		if(p > 0) {
			System.out.println("こんにちは");
			this.p --;
		}
	}
}
