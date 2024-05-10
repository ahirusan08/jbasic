package exam04;

public class Exam2 {
	
	public static void main(String[] args) {
		
//問題2：
		
		//対象の配列を生成する
		int [] array = {1, 5, 4, 3,2 };
		
		//拡張for文とif文を利用して奇数の値だけを出力する
		for (int i : array) {
			if ( i % 2 == 1 ) {
				System.out.println(i);
			}
		}
	}

}
