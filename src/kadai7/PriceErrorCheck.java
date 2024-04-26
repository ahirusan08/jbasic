package kadai7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PriceErrorCheck {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int price = 0;
		System.out.print("価格：");
		try {
			price = scan.nextInt();
			System.out.println(price + "円を登録しました");
	

		} catch (InputMismatchException e) {
			System.out.println("整数で入力してください");
		}
		if (price < 0) {
			System.out.println("マイナスの値です");
		}
		scan.close();
	}

}
