package kadai8;

public class Dragon extends Actor {

	//コンストラクタ
	public Dragon(int hp, int attack) {
		super("▯あのこ",hp,attack);
		
	}

	public void attack(Actor target) {
		System.out.println(super.getName() + "は"+target+"を投げた");
		super.attack(target);
	}

}
