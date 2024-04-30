package p18;

public class Oku extends Human{
	
	Oku(){
		
	}
	
	void hobby(String food){
		System.out.println("名前："+name);
		System.out.println("年齢："+age);
		System.out.println(food+"をつくります");
	}
	void eat(){
		//super.eat();
		System.out.println("ラーメンおいしい");
	}

}
