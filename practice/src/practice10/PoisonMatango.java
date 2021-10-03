package practice10;

public class PoisonMatango extends Matango {
	int poison = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);

//		for(int i = 1; i < poison; i++) {
//			System.out.println("さらに胞子をばらまいた");
//			int a = h.hp / 5;
//			h.hp -= a;
//			System.out.println(a + "ポイントのダメージ");
//		}
		if(poison > 0) {
			System.out.println("さらに胞子をばらまいた");
			int a = h.hp / 5;
			h.hp -= a;
			System.out.println(a + "ポイントのダメージ");
			poison--;
		}
	}
}