package p29;

public class Sample10 {

	public static void main(String[] args) {

		try {
			//throw new NumberFormatException();
			throw new Exception("エラーエラー");

		} catch (Exception e) {
			System.out.println("エラー!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("例外処理終了");
		}
		System.out.println("終了");
	}

}
