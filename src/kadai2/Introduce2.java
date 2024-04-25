package kadai2;

import java.util.Scanner;

public class Introduce2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String hobbys[] = new String[3];

		System.out.println("情報を登録します");
		System.out.print("名前：");
		String name = scan.next();

		for (int i = 0; i < hobbys.length; i++) {
			System.out.print("趣味" + (i + 1) + "：");
			hobbys[i] = scan.next();
		}
		System.out.println("--------------------------");
		System.out.println("こんにちは" + name + "です");
		System.out.println("私の趣味は、");
		for (String hobby : hobbys) {
			System.out.println("・" + hobby);
		}
		System.out.println("です");

	}

}
