package kadai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCart2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.print("商品を追加してください：");
			String goods=scan.next();
			list.add(goods);
		}
		System.out.println();
		for(String goods:list) {
			System.out.println(goods);
		}
	}

}
