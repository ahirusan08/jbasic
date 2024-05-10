package kadai8;

public class Zombie extends Actor {

	//コンストラクタ
	public Zombie(int hp, int attack) {
		super("▯ちいかぶ",hp,attack);
		
	}

	public void attack(Actor target) {
		System.out.println(super.getName() + "はかじってきた！");
		super.attack(target);
	}

}
