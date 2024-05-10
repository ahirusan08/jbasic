package p100;

public class sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0;
		int y = 0;
		while (i < 3) {//⇐一つ目のwhile文ブロック
			System.out.println("i" + i);
			while (y < 3) {// ⇐二つ目のwhile文ブロック
				if (y == 1) {
					break;
				}
				System.out.println("y" + y);
				y++;
			} // ⇐二つ目のwhile文ブロック
			i++;
		} // ⇐一つ目のwhile文ブロック
		System.out.println("break pattern");
	}

}
