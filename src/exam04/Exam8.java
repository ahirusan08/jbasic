package exam04;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Exam8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		//プレイヤーとコンピュータの手を決める
		System.out.println("1:グー、2:チョキ、3:パーから選択してください。");
		System.out.println("じゃん、けん、、、：");
		int you = scan.nextInt();
		//コンピュータは1～3のランダムな数値を取得する
		int com = rand.nextInt(3) +1 ;
		
		//プレイヤーの手とコンピュータの手を比較して勝敗を出力する

		Map<Integer, String> zyanken = new HashMap<>();

		zyanken.put(1, "グー！");
		zyanken.put(2, "チョキ！");
		zyanken.put(3, "パー！");

		Set<Integer> list = zyanken.keySet();
		System.out.println("あなたは" + (zyanken.get(you)));
		System.out.println("コンピュータは" + (zyanken.get(com)));

		if ((you == 1 && com == 1) || (you == 2 && com == 2) || (you == 3 && com == 3)) {
			System.out.println("引き分けでした");
		}
		if ((you == 1 && com == 3) || (you == 2 && com == 1) || (you == 3 && com == 2)) {
			System.out.println("あなたの負け");
		}
		if ((you == 1 && com == 2) || (you == 2 && com == 3) || (you == 3 && com == 1)) {
			System.out.println("あなたの勝ち");
		}

	}
}
