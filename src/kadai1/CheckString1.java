package kadai1;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("パスワード：");
		String pw = scan.next();
		
		System.out.print("一致");
		if(pw.equals("himitu")) {
			System.out.println("しました");
		}else {
			System.out.println("しませんでした");
		}
		
	}

}
