package p29;

public class Sample12 {

	public static void main(String[] args) {
		
		try {
			System.out.println(tasu(1,-2));
		} catch (TasuException e) {
			// TODO 自動生成された catch ブロック
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static int tasu(int a, int b) throws TasuException {
		int result = a + b;
		if (result <= 0) {
			//何らかの例外をスローする
			throw new TasuException("加算結果が負です");
		}
		return result;
	}

	public static int waru(int a, int b) {
		int result = a / b;
		return result;
	}

}
