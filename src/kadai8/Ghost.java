package kadai8;

public class Ghost extends Actor {

	//コンストラクタ
	public Ghost(int hp,int attack) {
		super("▯キメラ",hp,attack);
	}
	
	public void attack(Actor target) {
		System.out.println(super.getName()+"は爪で攻撃してきた！");
		super.attack(target);
	}

}
