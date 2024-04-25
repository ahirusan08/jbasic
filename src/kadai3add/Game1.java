package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int random = randomNum();
		int count = 1;

		System.out.print("数字を入力してください：");
		int num = scan.nextInt();

		while (num != random) {
			count++;
			jude(num, random);
			System.out.print("数字を入力してください：");
			num = scan.nextInt();
		}
		System.out.println("**当たりです**");
		System.out.println(count + "回で当たりました！");

	}

	static void jude(int num, int random) {
		if (num > random) {
			System.out.println("**大きすぎです**");
		} else {
			System.out.println("**小さすぎです**");
		}
	}

	static int randomNum() {
		Random rand = new Random();
		int random = rand.nextInt(100);
		return random;
	}

}
