package kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額：");
		int price = scan.nextInt();

		System.out.println("1:プレミア会員,2:無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();

		//会員ランクによる判定

		switch (rank) {
		case 1:
			int p1 = getPoints(price, true);
			System.out.println("プレミア会員には" + p1 + "ポイント付与されます");
			break;

		case 2:
			int p2 = getPoints(price, false);
			System.out.println("無料会員には" + p2 + "ポイント付与されます");
			break;

		default:
			System.out.println("会員ランクを2か2で入力してください");
			break;

		}

		scan.close();
	}

	//ポイント計算メソッド
	static int getPoints(int price, boolean x) {
		double per = x==true?0.2:0.1;
		return (int) (price * per);

	}

}
