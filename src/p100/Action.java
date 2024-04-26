package p100;

public class Action {

	public static void main(String[] args) {
		Animal c=new Cat("たま");
		Animal b=new Bird("ぴ-");
		
		System.out.println(c.name+"です");
		c.move();
		
		System.out.println(b.name+"です");
		b.move();
		
	}

}
