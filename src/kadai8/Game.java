package kadai8;

public class Game {

	public static void partition() {//1秒処理途中
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("待機処理でエラーが発生しました");
		}
	}

	public static void main(String[] args) {

		System.out.println("★★★ゲーム開始★★★");
		Actor hero = new Actor("▯勇者", 50, 10);
		System.out.println(hero);//a1.toString()を省略してa1。仕様？？？
		partition();
		System.out.println("------");

		Actor zombie = new Actor("▯ゾンビ", 15, 5);
		System.out.println(zombie + "があらわれた！");
		partition();
		System.out.println("------");

		hero.attack(zombie);
		System.out.println("　" + zombie);
		partition();
		System.out.println("------");

		zombie.attack(hero);
		System.out.println("　" + hero);
		partition();
		System.out.println("------");

		hero.attack(zombie);
		System.out.println("　" + zombie);
		partition();
		System.out.println("------");
		System.out.println("★★★ゲーム終了★★★");
	}

}
