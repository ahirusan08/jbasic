package p06;

public class Human {
	String name;
	int age;
	
	Human(){
		
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
