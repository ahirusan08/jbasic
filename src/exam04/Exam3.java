package exam04;

public class Exam3 {
	public static void main(String[] args) {

//問題3：四角形と三角形の面積を計算するメソッドを作成し利用しなさい
		
		//長方形の面積を計算する
		int a1 = getSquareArea(3, 3);
		System.out.println(a1);
		//三角形の面積を計算する
		double a2 = getTriangleArea(3, 3);
		System.out.println(a2);
	}

	//	引数で幅と高さを 整数で受け取り長方形 の面積（整数）を返す
	//getSquareArea()メソッドを作りなさい（5点）
	static int getSquareArea(int haba, int takasa) {
		return haba * takasa;
	}

	//引数で幅と高さを整数で受け取り三角形の面積（小数）を返す
	// getTriangleArea()メソッドを作りなさい（5点）

	private static double getTriangleArea(int haba, int takasa) {
		return (haba * takasa) / 2;

	}

}
