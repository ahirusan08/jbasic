package kadai8;

public class Hero extends Actor {

	//コンストラクタ
	public Hero(int hp,int attack) {
		super("▯勇者",hp,attack);
	}
	
	public void attack(Actor target) {
		System.out.println(super.getName()+"は剣で切りつけた");
		super.attack(target);
	}

}
