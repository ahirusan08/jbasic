package p100;

public class Cat extends Animal{
	
	String type;
	
	Cat(){
		
	}
	Cat(String name){
		super.name=name;
	}
	void move() {
		System.out.println("歩く");
	}
	

}
