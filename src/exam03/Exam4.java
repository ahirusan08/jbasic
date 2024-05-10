package exam03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = 0;

		try {
			System.out.print("年齢を入力してください：");
			age = scan.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("整数で入力してください");
			return;
		}

		if (age < 0 || age > 130) {
			System.out.println("0以上130以下で入力してください");
			return;
		}

		System.out.println(age+"歳で登録しました");
		
		scan.close();

	}

}
