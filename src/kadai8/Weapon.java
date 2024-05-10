package kadai8;

public class Weapon {
	private String name;
	private int addAttack;

	Weapon() {

	}

	Weapon(String name, int addAttack) {
		this.name = name;
		this.addAttack = addAttack;
	}

//		public String toString() {//
//			return ("装備("+name + "/" + addAttack +  ")");
//		}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddAttack() {
		return addAttack;
	}

	public void setAddAttack(int addAttack) {
		this.addAttack = addAttack;
	}

	public String getName() {
		return name;
	}

}
