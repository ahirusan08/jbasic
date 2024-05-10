package exam03;

public class Exam3 {

	public static void main(String[] args) {

		//長方形の面積
		int a1 = getSquareArea(3, 3);
		System.out.println(a1);

		//三角形の面積
		double a2 = getTriangleArea(3, 3);
		System.out.println(a2);
	}

	public static int getSquareArea(int w, int h) {//長方形
		return w * h;
	}

	public static double getTriangleArea(int w, int h) {//三角形
		return (double) w * h / 2.0;
	}

}
