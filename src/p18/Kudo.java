package p18;

public class Kudo extends Human{
	
	Kudo(){
		
	}
	
	void hobby (String music){
		System.out.println("名前："+name);
		System.out.println("年齢："+age);
		System.out.println(music+"を聴きます");
	}
	void eat(){
		//super.eat();
		System.out.println("うどんおいしい");
	}

}
