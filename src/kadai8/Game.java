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
		Actor h = new Hero(10, 5);
		System.out.println(h);//a1.toString()を省略してa1。仕様？？？
		partition();
		
		System.out.println("------");
		Actor z = new Zombie(15, 5);
		System.out.println(z + "があらわれた！");
		partition();
		
		while(z.getHp()!=0) {
			System.out.println("------");
			h.attack(z);
			System.out.println("　" + z);
			partition();
			
			System.out.println("------");
			z.attack(h);
			System.out.println("　" + h);
			partition();
			
			if(h.getHp()<0) {
				System.out.println("勇者HP0");
				break;
			}
		}
		if(h.getHp()<0) {
			System.out.println(h.getName()+"はやられてしまった...□");
		}else {
			System.out.println(z.getName()+"を倒した！□");
		}
	
		System.out.println("------");
		System.out.println("------");
		System.out.println("★★★ゲーム終了★★★");
	}

}
