package kadai2;

import java.util.Scanner;

public class CheckPassword1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		for (int i = 0; i <=3; i++) {
			System.out.print("パスワードを入力してください：");
			String PW= scan.next();
			if(PW.equals("himitu")) {
				System.out.println("ログインできました");
				break;
			}else {
				System.out.println("不正解です");
			}
		}
		

	}

}
