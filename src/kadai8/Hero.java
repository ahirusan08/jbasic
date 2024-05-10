package kadai8;

public class Hero extends Actor {
	
	private Weapon w;
	

	//コンストラクタ
	public Hero(int hp,int attack) {
		super("▯ハチワレ",hp,attack);
	}
	
	public void attack(Actor target) {
		System.out.println(super.getName()+"は"+w.getName()+"で攻撃した");
		int hp=target.getHp()-(getAttack()+w.getAddAttack());
		if (hp < 0)
			hp = 0;
		target.setHp(hp);
		System.out.println("　" + target.getName() + "に" + 
			(getAttack()+w.getAddAttack()) + "のダメージを与えた！");
	
	}
	
	public Weapon getWeapon() {
		return w;
	}
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	
	
	

}
