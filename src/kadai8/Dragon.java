package kadai8;

public class Dragon extends Actor {

	//コンストラクタ
	public Dragon(int hp, int attack) {
		super("▯ドラゴン",hp,attack);
		
	}

	public void attack(Actor target) {
		System.out.println(super.getName() + "は火を吹いた！");
		super.attack(target);
	}

}
