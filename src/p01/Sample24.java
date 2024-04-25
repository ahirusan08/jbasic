package p01;

import java.util.Scanner;

public class Sample24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String moji;
		
		System.out.println("文字を入力してください：");
		moji = scan.next();
		
		
		while (!moji.equals("zzz")){
			System.out.println(moji);
			System.out.println("文字を入力してください：");
			moji = scan.next();
		} 
		

	}

}
