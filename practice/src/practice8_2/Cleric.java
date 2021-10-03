package practice8_2;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた");
		this.mp -= 5;
		this.hp =  this.MAXHP;
		System.out.println(this.name + "は、全回復した");
	}

	public int pray(int sec) {
		Random random = new Random();
		int heal = random.nextInt(3) + sec;
		int healAll = Math.min(this.MAXMP - this.mp, heal);
		this.mp += healAll;
		System.out.println(this.name + "は、" + sec + "秒祈った");
		System.out.println("MPが、" + healAll + "回復した");
		return healAll;
	}
}
