package practice16;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] main) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

//		List<Hero> list = new ArrayList<Hero>();
//		list.add(h1);
//		list.add(h2);
//
//		for(Hero a : list) {
//			System.out.println(a.getName());
//		}

		Map<Hero, Integer> hero = new HashMap<Hero, Integer>();
		hero.put(h1, 3);
		hero.put(h2, 7);

		for(Hero key : hero.keySet()) {
			int value = hero.get(key);
			System.out.println(key.getName() + "が倒した数=" + value );
		}
	}
}
