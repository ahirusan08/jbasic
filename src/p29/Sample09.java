package p29;

public class Sample09 {

	public static void main(String[] args) {
		
		try {
			System.out.println(0/2);
			System.out.println(Integer.parseInt("1s00"));
		}catch(Exception e) {
			System.out.println("エラー");
		}finally {
			System.out.println("例外処理終了");
		}
		System.out.println("終了");
	}

}
