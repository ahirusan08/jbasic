package kadai4add;

public class Convert {

	 static void reverse(int input) {
		for (int value = input; value > 0; value /= 10) {
			System.out.print(value%10);
		}
	}

	 static void reverse(double input) {
		String s=String.valueOf(input);
		reverse(s);
	}

	static void reverse(String input) {
		String rev="";
		for(int i=0;i<input.length();i++) {
			rev=input.charAt(i)+rev;
		}
		System.out.println(rev);
	}

}
