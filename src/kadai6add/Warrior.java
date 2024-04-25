package kadai6add;

public class Warrior extends Human {
	private String type;
	
	Warrior(){
		
	}
	Warrior(String name,String type){
		super.setName(name);
		this.type=type;
	}
	
	void setType(String type) {
		this.type=type;
	}
	String getType() {
		return type;
	}
	
	void info() {
		System.out.println("種別："+type+"　名前："+super.getName());
	}
	void attack() {
		System.out.println("「"+type+"」は攻撃した");
	}

}
