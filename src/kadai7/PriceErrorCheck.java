package kadai7;

import java.util.Scanner;

public class PriceErrorCheck {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int price = 0;
		System.out.print("価格：");
		try {
			price = scan.nextInt();
			if (price < 0) {
				System.out.println("マイナスの値です");
			}else {
			System.out.println(price + "円を登録しました");
			}

		} catch (Exception e) {
			System.out.println("整数で入力してください");
		}
		
		scan.close();
	}

}
