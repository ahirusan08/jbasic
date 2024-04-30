package p29;

public class Sample07 {

	public static void main(String[] args) {
		
		try {
			System.out.println(0/2);
			System.out.println(Integer.parseInt("1s00"));
		}catch(ArithmeticException e) {
			System.out.println("0でわれないよ");
		}catch(NumberFormatException e) {
			System.out.println("数値に変換できないよ");
		}finally {
			System.out.println("例外処理終了");
		}
		System.out.println("終了");
	}

}
