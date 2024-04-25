package kadai1;

import java.util.Scanner;

public class CheckInteger4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力してください：");
		int age = scan.nextInt();
		
		if(age>0) {
			System.out.print(age+"は正の");	
		}else if(age<0) {
			System.out.print(age+"は負の");
		}else {
			System.out.print("正でも負もない");
		}
		
		if(age%2==0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}

	}

}
