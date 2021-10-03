package practice16_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

//		List<Hero> list = new ArrayList<Hero>();
//		list.add(h1);
//		list.add(h2);
//
//		for(Hero hero : list) {
//			System.out.println(hero.getName());
//		}

		Map<Hero, Integer> list = new HashMap<Hero, Integer>();
		list.put(h1, 3);
		list.put(h2, 7);

		for(Hero key : list.keySet()) {
			int value = list.get(key);
			System.out.println(key.getName() + "が倒した数＝" + value);
		}
	}


}
