package exam04;

import java.util.Scanner;

public class Exam4 {
	
	public static void main(String[] args) {
		
//問題4：キーボードから年齢の入力を受け付けて入力チェックをしなさい
		
		Scanner scan = new Scanner(System.in);
			
			System.out.print("年齢を入力してください：");
			int age = 0;
			
			try {
				age = scan.nextInt();	
			}catch(Exception e){
				System.out.println("整数で入力してください");
				return;
			}
			
			if (0 <= age && age <= 130) {
				System.out.println(age +"歳で登録しました");
			} else {
				System.out.println("0以上130以下で入力してください");
			}
	}

}
