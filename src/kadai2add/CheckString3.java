package kadai2add;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("繰り返す回数を入力してください：");
		int a = scan.nextInt();
		
		String[] moji=new String[a];
		
		for(int i=0;i<a;i++) {
			System.out.print(i+1+"つ目の文字列を入力してください：");
			moji[i]= scan.next();
			
			for(int j=0;j<i+1;j++) {
			 System.out.print(moji[j]);	
			}
			System.out.println();
		}

	}

}
