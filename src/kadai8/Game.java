package kadai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	public static void partition() {//1秒処理途中
		try {
			Thread.sleep(1000);
			System.out.println("------");

		} catch (InterruptedException e) {
			System.out.println("待機処理でエラーが発生しました");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("★★★ゲーム開始★★★");
		Actor h = new Hero(50, 10);
		System.out.println(h);//a.toString()を省略してa。仕様らしい
		partition();

		List<Actor> enemys=new ArrayList<>();//敵を格納
		int i=0;//enemysを参照するときのindex
		//Dragon d=new Dragon(100,50);
		int select = 0;
		for (int j = 0; j < 3; j++) {
//			if(j==3) {
//				enemys.add(d);
//			}else {
				enemys.add(Actor.randomEnemy());
			//}
			System.out.println(enemys.get(i) + "があらわれた！▯");
			partition();
			while (enemys.get(i).getHp() != 0) {//敵が生きているとき
				System.out.println("▯ステータス");
				h.status();
				enemys.get(i).status();

				System.out.println("▯どうしますか？");
				System.out.print("[1]攻撃 [2]回復 [3]逃げる：");
				select = scan.nextInt();
				partition();
				switch (select) {
				case 1:
					h.attack(enemys.get(i));//勇者の攻撃
					enemys.get(i).status();
					break;
				case 2://勇者の回復
					h.heal();
					h.status();
					break;
				case 3://逃げる
					System.out.println(h.getName()+"は逃げ出した！");
					j--;//戦闘回数調整
					break;
				default:
					System.out.println("1,2のどちらかを選択してください");
					partition();
					continue;
				}
				partition();
				if (enemys.get(i).getHp() <= 0 ||select==3)//敵のHP0or勇者逃げたとき
					break;//whileからbreak
				
				enemys.get(i).attack(h);//敵の攻撃
				h.status();
				partition();

				if (h.getHp() <= 0)//勇者が倒れたら
					break;//whileからbreak
			} //ターン終了
			if (h.getHp() <= 0)//勇者が倒れたら
				break;//forからbreak
			if(select==3){//勇者逃げたとき
				i++;//次の敵のindex
				continue;//forをcontinue
			}else {//敵のHP0
			System.out.println(enemys.get(i).getName() + "を倒した！");
			i++;//次の敵のindex
			partition();
			}
		}
		

		if (h.getHp() <= 0) {
			System.out.println(h.getName() + "はやられてしまった...▯");
			partition();
			partition();
			System.out.println("★★★ゲームオーバー★★★");

		} else {
			System.out.println("すべての敵を倒した！");
			partition();
			partition();
			System.out.println("★★★ゲーム終了★★★");
		}
	}

}
