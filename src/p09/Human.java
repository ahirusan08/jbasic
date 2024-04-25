package p09;

public class Human {
	String name;
	int age;
	
	Human(){
		this("名前なし",-1);
	}
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void introduce(){
		System.out.println("名前："+name);
		System.out.println("年齢："+age);
	}
	
}
