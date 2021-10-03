package practice8_6;

import java.util.Random;

public class Cleric {
	String  name;
	int hp = 50;
	int mp = 10;
	final int MAXHP = 50;
	final int MAXMP = 10;

	public void selfAid() {
		this.mp -= 5;
		System.out.println(this.name + "はセルフエイドを使った！");
		this.hp += this.MAXHP;
		System.out.println(this.name + "のHPは全回復した！");
	}

	public void pray(int sec) {
		System.out.println(this.name + "は祈った！");
		Random rand = new Random();
		int recover = rand.nextInt(3) + sec;

		int recoverAll = Math.min(this.MAXMP - this.mp, recover);
		this.mp += recoverAll;
		System.out.println("MPが" + recoverAll + "回復した！");
	}
}
