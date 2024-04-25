package p07;

public class Human {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(0<=age && age<=130) {
			this.age=age;
		}else {
			System.out.println("正しい年齢を入力してください");
		}
	}
	public int getAge() {
		return age;
	}
	

//	void introduce(){
//		System.out.println("名前："+name);
//		System.out.println("年齢："+age);
//	}
	
}
