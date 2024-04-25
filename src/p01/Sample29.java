package p01;

public class Sample29 {

	public static void main(String[] args) {
		oku();
		kudo(-10,20);
		endo(10,20);
		System.out.println(endo(10,20));

	}
	
	
	static void oku() {
		System.out.println("よろしく！");
		
	}
	
	static void kudo(int x ,int y) {
		if(x<0) {
			return;
		}
		System.out.println(x+y);
	}
	
	static int endo(int x ,int y) {
		return x+y;
	}

}
