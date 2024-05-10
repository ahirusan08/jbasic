package exam03;

public class Employee {
	
	//フィールド
	private String name;
	private int age;
	
	//コンストラクタ
	Employee(){
	
	}
	Employee(String name,int age){
		this.name=name;
		this.age=age;
	}

	
	//ゲッター、セッター
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//情報出力
	public void introduce() {
		System.out.println(name+"さんは"+age+"歳です");
	}

	

}
