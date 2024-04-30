package kadai8;

public class Ghost extends Actor {

	//コンストラクタ
	public Ghost(int hp,int attack) {
		super("▯ゴースト",hp,attack);
	}
	
	public void attack(Actor target) {
		System.out.println(super.getName()+"の叫び声！");
		super.attack(target);
	}

}
