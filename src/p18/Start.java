package p18;

public class Start {

	public static void main(String[] args) {
		Human[] canon= {
				new Oku(),
				new Kudo()
		};
//		canon[0]=new Oku();
//		canon[1]=new Kudo();
		
		
		
		canon[0].eat();
		canon[1].eat();
		
		System.out.println("----------------");
		
		for(int i=0;i<canon.length;i++) {
			canon[i].eat();
		}
		
		System.out.println("----------------");
		
		for(Human canons:canon) {
			canons.eat();
		}
		
		canon[0].name="奥";
		canon[0].age=20;
		canon[0].hobby("クッキー");
		canon[1].name="工藤";
		canon[1].age=21;
		canon[1].hobby("藤井風");
		
	}

}
