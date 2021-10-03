package practice9_2;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println(h.name + "は" + h.sword.name + "で攻撃をした");

		Hero h1 = new Hero();
		h1.name = "アサカ";
		h1.hp = 100;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;

		w.heal(h);
		w.heal(h1);

		Hero k = new Hero();
		k.name = "小林";
		k.hp = 100;

		w.heal(k);
	}
}
