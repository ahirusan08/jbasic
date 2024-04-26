package kadai8;

public class Actor {
	private String name;
	private int hp;
	private int attack;

	//コンストラクタ
	public Actor() {

	}

	public Actor(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	//セッター、ゲッター
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return hp;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getAttack() {
		return attack;
	}
	
	public String toString(){//名前と生命力を文字列にする・オーバーライド
		return (name+"(HP:"+hp+")");
	}
	
	void attack(Actor target) {//攻撃
		target.hp-=this.attack;
		if(target.hp<0)
			target.hp=0;
		
		System.out.println("　"+target.getName()+"に"+this.attack+"のダメージを与えた！");
	}

}
