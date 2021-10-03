package practice8_3;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		this.mp -= 5;
		System.out.println(this.name + "セルフエイドを唱えた");
		this.hp += this.MAX_HP;
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int sec) {
		Random random = new Random();
		int heal = random.nextInt(3) + sec;
		int h = Math.min(heal, this.MAX_MP - this.mp);
		this.mp += h;
		return h;
	}
}
