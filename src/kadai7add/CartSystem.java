package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartSystem {

	private static List<Item> cart = new ArrayList<Item>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int select;

		do {
			System.out.println("1:商品追加");
			System.out.println("2:書籍追加");
			System.out.println("3:情報更新");
			System.out.println("4:カートから削除");
			System.out.println("5:カートを検索");
			System.out.println("6:購入");
			System.out.println("9:終了");
			System.out.print("メニューを選択してください：");
			select = scan.nextInt();

			switch (select) {

			case (1):
				System.out.println("商品をカートに追加します");
				System.out.print("　商品名を入力してください：");
				String name = scan.next();
				System.out.print("　価格を入力してください：");
				int price = scan.nextInt();
				cart.add(new Item(name, price));
				break;

			case (2):
				System.out.println("書籍をカートに追加します");
				System.out.print("　書籍名を入力してください：");
				String book = scan.next();
				System.out.print("　著者を入力してください：");
				String author = scan.next();
				System.out.print("　価格を入力してください：");
				price = scan.nextInt();
				cart.add(new Book(book, price, author));
				break;

			case (3):
				System.out.println("情報を更新します");
				System.out.print("　No.を入力してください：");
				int no = scan.nextInt();
				no--;
				if ((no) < cart.size()) {//正しいnoが入力されたとき
					if (cart.get(no) instanceof Item) {//入力されたnoがItem型の要素
						System.out.print("　商品名を入力してください"
								+ "(現在：" + (cart.get(no)).getName() + ")：");
						name = scan.next();
						System.out.print("　価格を入力してください"
								+ "(現在：" + (cart.get(no)).getPrice() + ")：");
						price = scan.nextInt();
						(cart.get(no)).setName(name);
						(cart.get(no)).setPrice(price);
					} else {
						Book b = (Book) (cart.get(no));//参照型のキャスト
						System.out.print("　書籍名を入力してください"
								+ "(現在：" + (cart.get(no)).getName() + ")：");
						book = scan.next();
						System.out.print("　著者を入力してください"
								+ "(現在：" + b.getAuthor() + ")：");
						author = scan.next();
						System.out.print("　価格を入力してください"
								+ "(現在：" + (cart.get(no)).getPrice() + ")：");
						price = scan.nextInt();
						(cart.get(no)).setName(book);
						(cart.get(no)).setPrice(price);
						b.setAuthor(author);
					}

				} else {
					System.out.println("　選択されたNo.はありません");
				}
				break;

			case (4):
				System.out.println("カートから削除します");
				System.out.print("　No.を入力してください：");
				no = scan.nextInt();
				no--;
				if ((no) < cart.size()) {//正しいnoが入力されたとき
					System.out.println("カートから削除します");
					cart.remove(no);
				} else {
					System.out.println("選択されたNo.はありません");
				}
				break;

			case (5):
				System.out.println("カートを検索します");
				System.out.print("　検索キーワードを入力してください：");
				String keyword = scan.next();
				System.out.println();
				System.out.println("商品情報");
				System.out.println("---------------");
				for (int i = 0; i < cart.size(); i++) {
					if ((cart.get(i).getName()).contains(keyword)) {
						//商品名(書籍名)にヒット
						(cart.get(i)).getInfo();
					} else if (cart.get(i) instanceof Book) {
						//Book型だった場合
						Book b = (Book) cart.get(i);//参照型のキャスト
						if ((b.getAuthor()).contains(keyword)) {
							//商品名(書籍名)にヒット
							(cart.get(i)).getInfo();
						}
					}
				}
				System.out.println("---------------");
				System.out.println("");

				continue;

			case (6):
				System.out.println("購入します");
				int sum=0;
				for(Item items:cart) {
					sum+=items.getPrice();
				}
				System.out.println("***合計金額は" + sum + "円です***");
				break;

			case (9):
				break;

			default:
				System.out.println("1,2,3,4,5,9を入力してください");
				System.out.println();
			}//switch文おわり
			
			if (select == 9)
				break;

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
			if (select == 6)
				break;
		} while (select != 9);

	}
}
