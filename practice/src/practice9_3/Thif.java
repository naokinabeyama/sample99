package practice9_3;

public class Thif {
	String name;
	int hp;
	int mp;

	public Thif(String name, int hp, int mp) {
		this.name = name;
		this.hp  = hp;
		this.mp = mp;
	}

	public Thif(String name, int hp) {
		this(name, hp, 5);
	}

	public Thif(String name) {
		this(name, 40);
	}

}
