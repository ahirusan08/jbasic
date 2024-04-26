package p17;

public class Start {

	public static void main(String[] args) {
		Human h=new Oku();
		Human h2=new Kudo();
		
		h.name="奥";
		h.age=20;
		h.hobby("クッキー");
		h.eat();
		
		System.out.println();
		
		h2=new Kudo();
		h2.name="工藤";
		h2.age=21;
		h2.hobby("藤井風");
		h2.eat();
	}

}
