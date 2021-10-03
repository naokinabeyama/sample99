package practice8;

public class Main {
	public static void main(String[] args) {
	//	勇者を生成
		Hero h1 = new Hero();
	// フィールドに初期値をセット
		h1.name = "ミナト";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;

		w.heal(h1);
		w.heal(h2);


		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 15;
//		h.sword = s;



		System.out.println(h1.name + "は" + s.name + "で攻撃した");

//		Matango m1 = new  Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//
//		Matango m2 = new Matango();
//		m2.hp = 48;
//		m2.suffix = 'B';
//
////		System.out.println("勇者" + h.name + "を生み出しました!");
//
//		h1.slip();
//		m1.run();
//		m2.run();
//		h1.run();
	}
}
