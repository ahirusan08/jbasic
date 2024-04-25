package kadai6add;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Human[] party = new Human[3];

		System.out.println("===パーティを作成します===");
		for (int i = 0; i < party.length; i++) {
			System.out.print("どちら(1:市民　2:戦士)を作成しますか：");
			int select = scan.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("名前：");
				party[i]=new Human(scan.next());
				break;
			case 2:
				System.out.print("名前：");
				String name = scan.next();
				System.out.print("種別：");
				String type = scan.next();
				
				party[i]=new Warrior(name,type);
				
				break;
			}
		}
		System.out.println("===パーティを作成しました===");
		System.out.println();
		
		
		System.out.print("操作(1:一覧表示　2:攻撃　9:終了)を選択してください：");
		int select = scan.nextInt();
		while (select != 9) {
			if (select == 1) {//一覧表示
				for (Human  member: party) {
					member.info();
				}
			}else if (select == 2) {//攻撃
				for (Human  member: party) {
					member.attack();
				}
			}	
			System.out.println();
			System.out.print("操作(1:一覧表示　2:変更　9:終了)を選択してください：");
			select = scan.nextInt();
		}
		
		

	}

}
