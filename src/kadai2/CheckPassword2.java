package kadai2;

import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = 0;
		System.out.print("パスワードを入力してください：");
		String PW = scan.next();

		while (!PW.equals("himitu")) {
			System.out.print("再入力してください：");
			PW = scan.next();

		}
		System.out.println("ログインできました");
	}

}
