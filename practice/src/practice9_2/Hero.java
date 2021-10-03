package practice9_2;

public class Hero {
	String name;
	int hp;
	Sword sword;

	public void attack() {
		System.out.println(this.name + "は、攻撃をした！");
		System.out.println("敵に5ポイントのダメージを与えた");
	}
}
