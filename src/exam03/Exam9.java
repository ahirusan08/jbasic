package exam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exam9 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int select = 0;

		do {
			System.out.println();
			System.out.println("1：登録 2：削除 3：一覧表示 9：終了");
			System.out.print("操作番号を入力して下さい：");
			select = scan.nextInt();

			switch (select) {
			case 1:
				System.out.print("名前を入力して下さい：");
				String name = scan.next();
				System.out.print("電話番号を入力して下さい：");
				String number = scan.next();
				map.put(name, number);
				break;
				
			case 2:
				System.out.print("名前を入力して下さい：");
				name = scan.next();
				map.remove(name);
				
				break;
				
			case 3:
				System.out.println("名前　　　電話番号");
				System.out.println("------------------");
				Set<String>keys=map.keySet();
				for(String key: keys) {
					System.out.println(key+"　　"+map.get(key));
				}
				break;
				
			case 9:				//test後つけたし分
				break;			//
				
			default:
				System.out.println("1,2,3,9を入力して下さい");
				break;
				
				
			}
		} while (select != 9);
		System.out.println("アプリケーションを終了します");

	}

}
