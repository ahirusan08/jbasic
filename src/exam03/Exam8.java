package exam03;

import java.util.Random;
import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		// プレイヤーとコンピュータの手を決める
		System.out.println("1:グー、2:チョキ、3:パー から選択してください。");
		System.out.print("じゃん、けん、、、：");
		int you = scan.nextInt();

		// コンピュータは1～3のランダムな数値を取得する
		int com = random.nextInt(3) + 1;

		// プレイヤーの手とコンピュータの手を比較して勝敗を出力する(5点)
		System.out.print("あなたは");
		hand(you);
		System.out.print("コンピュータは");
		hand(com);

		if (you == com) {
			System.out.println("引き分けでした");
		} else if (com - you == 1 || com - you == -2) {
			System.out.println("あなたの勝ち");
		} else {
			System.out.println("あなたの負け");
		}

	}

	public static void hand(int hand) {
		switch (hand) {
		case 1:
			System.out.println("グー！");
			break;
		case 2:
			System.out.println("チョキ！");
			break;
		case 3:
			System.out.println("パー！");
			break;
//		default:
//			System.out.println("1,2,3で入力してください");
//			return;
		}

	}

}
