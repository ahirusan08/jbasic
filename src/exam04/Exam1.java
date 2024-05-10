package exam04;

import java.util.Scanner;

public class Exam1 {
	
	public static void main(String[] args) {
		
//問題1：キーボードから名前（文字列）と年齢（整数）の入力を受け取り、10年後の年齢結果をコンソールに出力する処理を作成しなさい
		
		Scanner scan = new Scanner(System.in);
		
		//キーボードから名前と年齢を取得して10年後の年齢を出力する
		System.out.print("名前：");
		String name = scan.next();
		System.out.println("年齢：");
		int age = scan.nextInt();
		System.out.println( name + "さんの10年後は" + (age + 10) + "歳です！");
		
	}

}
