package kadai8;

public class Hero extends Actor {

	//コンストラクタ
	public Hero(int hp,int attack) {
		super();
		super.setName("▯勇者");
		super.setHp(hp);
		super.setAttack(attack);
	}
	
	void attack(Hero target) {
		System.out.println(super.getName()+"は剣で切りつけた");
		super.attack(target);
	}

}
