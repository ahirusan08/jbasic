package p01;

public class Sample11 {

	public static void main(String[] args) {
		int age = 42;

		if(age>=20 && age<30) {
			System.out.println("20代");
		}else if(age<=30 && age<40) {
			System.out.println("30代");
		}else if(40<=age && age<50) {
			System.out.println("40代");
		}else {
			System.out.println("該当なし");
		}
		
		

		

	}

}
