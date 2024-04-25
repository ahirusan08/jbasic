package kadai1add;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int kokugo = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		int sugaku = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		int eigo = scan.nextInt();

		if (kokugo == sugaku) {
			if (kokugo == eigo) {
				System.out.println("最高点は全教科で" + kokugo + "点です");
			} else if (kokugo < eigo) {
				System.out.println("最高点は英語で" + eigo + "点です");
			} else {
				System.out.println("最高点は国語と数学で" + kokugo + "点です");
			}
		} else if (kokugo == eigo) {
			if (kokugo < sugaku) {
				System.out.println("最高点は数学で" + sugaku + "点です");
			} else {
				System.out.println("最高点は国語と英語で" + kokugo + "点です");
			}

		} else if (sugaku == eigo) {
			if (sugaku < kokugo) {
				System.out.println("最高点は国語で" + kokugo + "点です");
			} else {
				System.out.println("最高点は数学と英語で" + eigo + "点です");
			}
		} else if (kokugo > sugaku) {
			if (kokugo > eigo) {
				System.out.println("最高点は国語で" + kokugo + "点です");
			} else {
				System.out.println("最高点は英語で" + eigo + "点です");
			}
		} else {
			if (sugaku > eigo) {
				System.out.println("最高点は数学で" + sugaku + "点です");
			} else {
				System.out.println("最高点は英語で" + eigo + "点です");
			}
		}
	}

}
