package exam04;

public class Engineer extends Employee {

	//フィールド
	private String skill;

	//初期化するコンストラクタ
	public Engineer(String name, int age, String skill) {
		super(name, age);
		this.skill = skill;
	}

	//ゲッター、セッター
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	void introduce() {
		super.introduce();
		System.out.println( skill + "エンジニアです" );
		
	}

}
