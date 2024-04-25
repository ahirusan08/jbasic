package p05;

public class human {
	String name;
	int age;
	
	void eat(int money) {
		System.out.println(money+"もらったよ");
		System.out.println("食事中です");
	}
	void eat(String bento) {
		System.out.println(bento+"もらったよ");
		System.out.println("食事中です");
	}
	void eat() {
		System.out.println("食事中です");
	}

}
