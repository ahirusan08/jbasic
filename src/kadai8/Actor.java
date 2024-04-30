package kadai8;

import java.util.Random;

public class Actor {
	private String name;
	private int hp;
	private int attack;
	private int maxHp;

	//コンストラクタ
	public Actor() {
	}

	public Actor(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
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

	public String toString() {//名前と生命力を文字列にする・オーバーライド
		return (name + "(HP:" + hp + "/" + maxHp + ")");
	}

	public void attack(Actor target) {//攻撃
		target.hp -= this.attack;
		if (target.hp < 0)
			target.hp = 0;
		System.out.println("　" + target.getName() + "に" + this.attack + "のダメージを与えた！");
	}

	public void heal() {//回復
		hp += maxHp / 2;
		if (hp > maxHp)
			hp = maxHp;
		System.out.println("　" + name + "はHPを回復した！");
	}

	public static Actor randomEnemy() {//敵のランダム生成(3択)
		Random rand = new Random();

		Actor[] list = {
				new Zombie(10, 5),
				new Zombie(20, 10),
				new Ghost(30, 15)
		};
		int i = rand.nextInt(list.length);
		return list[i];
	}
	public void status() {
		System.out.println("　"+name + "(HP:" + hp + "/" + maxHp + ")");
		System.out.print("　[");
		for(int i=0;i<10;i++) {

			String s=i<(hp/5) ?"▮":" ";
			System.out.print(s);
		}
		System.out.println("]");
	}
}
