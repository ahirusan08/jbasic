package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] randNum = randomNum();//メソッド呼び出し
		int random = randNum[0] * 100 + randNum[1] * 10 + randNum[2];//ランダムの数

		int count = 0;//カウント
		int num = 0;

		do {
			System.out.print("3桁の数字を入力してください：");
			num = scan.nextInt(); //数字入力

			int[] jude = jude(num, randNum);
			System.out.println(jude[0] + "ヒット・" + jude[1] + "ブロー");
			count++;
		} while (num != random);

		System.out.println(count + "回で当たりました！");
	}

	static int[] jude(int num, int[] randNum) {//hitかblowか判定
		int[] numAry = new int[3];//入力した数字を各位に分ける
		numAry[0] = num / 100;
		numAry[1] = (num / 10) % 10;
		numAry[2] = num % 10;

		int[] jude = { 0, 0 };//hit/blow

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (numAry[i] == randNum[j]) {

					if (i == j) {
						jude[0]++;
					} else if (i != j) {
						jude[1]++;
					}
				}
			}
		}
		return jude;
	}

	static int[] randomNum() {//各位が異なる、3桁の乱数生成
		Random rand = new Random();
		int[] randNum = new int[3];

		randNum[0] = rand.nextInt(9) + 1; //100の位を1~9で生成

		randNum[1] = rand.nextInt(10); //10の位を0~9で生成
		while (randNum[1] == randNum[0]) {
			randNum[1] = rand.nextInt(10);//被ったら再生成
		}

		randNum[2] = rand.nextInt(10);//1の位を0~9で生成
		while (randNum[2] == randNum[0] || randNum[2] == randNum[1]) {
			randNum[2] = rand.nextInt(10);//被ったら再生成
		}
		return randNum;
	}
}
