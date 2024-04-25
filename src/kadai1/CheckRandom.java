package kadai1;

import java.util.Random;

public class CheckRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		int dice = rand.nextInt(3);

		switch (dice) {
		case 0:
			System.out.print("グー");
			break;
		case 1:
			System.out.print("チョキ");
			break;
		case 2:
			System.out.print("パー");
			break;
		}

	}

}
