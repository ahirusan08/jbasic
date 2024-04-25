package p01;

import java.util.Scanner;

public class Sample09 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を入力：");
		String name = scan.next();
		
		System.out.print("年齢を入力：");
		int age = scan.nextInt();
		
		System.out.println("名前："+ name);
		System.out.println("年齢："+ age);
		
	}

}
