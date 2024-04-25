package kadai2add;

import java.util.Scanner;

public class CheckString4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("繰り返す回数を入力してください：");
		
		int a = scan.nextInt();
		int max=0;
		int maxMoji=0;
		
		String[] moji=new String[a];
		
		for(int i=0;i<a;i++) {
			System.out.print(i+1+"つ目の文字列を入力してください：");
			moji[i]= scan.next();
			if(max<moji[i].length()) {
				max=moji[i].length();
				maxMoji=i;
			}
		}
		
		
		System.out.println("最も長い文字列は「"+moji[maxMoji]+"」です");

	}

}
