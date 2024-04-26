package p100;

public class Bird extends Animal {

	String type;

	Bird(){
		
	}

	Bird(String name) {
		super.name = name;
	}

	void move() {
		System.out.println("飛ぶ");
	}

}
