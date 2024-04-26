package kadai8;

public class Zombie extends Actor {

	//コンストラクタ
	public Zombie(int hp,int attack) {
		super();
		super.setName("□ゾンビ");
		super.setHp(hp);
		super.setAttack(attack);
	}
	
	void attack(Actor target) {
		System.out.println(super.getName()+"の体当たり");
		super.attack(target);
	}

}
