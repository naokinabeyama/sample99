package practice1;

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = {3, 4, 9};

		System.out.println("１桁の数字を入力してください");

		int input = sc.nextInt();

		for (int a : numbers) {
			if(a == input) {
				System.out.println("アタリ！");
			}
		}

	}
}
