package p19;

public class Start {

	public static void main(String[] args) {
		Controller b = new Baseball();
		b.pushA();
		b.pushB();
		
		System.out.println("--------------");
		
		Controller m = new Mario();
		m.pushA();
		m.pushB();
	}

}
