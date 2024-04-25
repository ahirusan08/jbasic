package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartSystem {

	private static List<Item> cart = new ArrayList<Item>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("1:商品追加");
		System.out.println("2:書籍追加");
		System.out.println("3:情報更新");
		System.out.println("9:終了");
		System.out.print("メニューを選択してください：");
		int select = scan.nextInt();

		while (select != 9) {
			if (select == 1) {
				System.out.println("商品をカートに追加します");
				System.out.print("　商品名を入力してください：");
				String name = scan.next();
				System.out.print("　価格を入力してください：");
				int price = scan.nextInt();
				cart.add(new Item(name, price));
			} else if (select == 2) {
				System.out.println("書籍をカートに追加します");
				System.out.print("　書籍名を入力してください：");
				String book = scan.next();
				System.out.print("　著書を入力してください：");
				String author = scan.next();
				System.out.print("　価格を入力してください：");
				int price = scan.nextInt();
				cart.add(new Book(book, price, author));
			} else if(select==3){
				System.out.println("情報を更新します");
				System.out.print("　No.を入力してください：");
				int no = scan.nextInt();
				if(no<cart.size()) {//正しいnoが入力されたとき
					if(cart.get(no) instanceof Item) {//入力されたnoがbook
						System.out.print("　商品名を入力してください：");
						String name = scan.next();
						System.out.print("　価格を入力してください：");
						int price = scan.nextInt();
						(cart.get(no)).setName(name);
						(cart.get(no)).setPrice(price);
					}else{
						System.out.print("　書籍名を入力してください：");
						String book = scan.next();
						System.out.print("　著書を入力してください：");
						String author = scan.next();
						System.out.print("　価格を入力してください：");
						int price = scan.nextInt();
						(cart.get(no)).setName(book);
						(cart.get(no)).setPrice(price);
						//Bookの
						//(cart.get(no)).setAuthor(author);
						
					}
					
				}else {
					System.out.println("入力されたNo.はありません");
				}
				
			}else {
				System.out.println("1,2,3,9を入力してください");
				System.out.println();
			}
			System.out.println();
			int count = 1;
			System.out.println("No.　商品情報");
			System.out.println("---------------");
			for (Item items : cart) {
				System.out.print(count + "　");
				items.getInfo();
				count++;
			}
			System.out.println("---------------");
			System.out.println();
			System.out.println("1:商品追加");
			System.out.println("2:書籍追加");
			System.out.println("9:終了");
			System.out.print("メニューを選択してください：");
			select = scan.nextInt();
		}

	}
}
