package kadai5add;

import java.util.Scanner;

public class UseCustomer2 {

	public static void main(String[] args) {
		Customer[] customerList = new Customer[3];
		Scanner scan = new Scanner(System.in);

		for (int index = 0; index < customerList.length; index++) {
			System.out.println((index + 1) + "人目の顧客情報を入力してください");
			System.out.print("ID：");
			int id = scan.nextInt();
			System.out.print("名前：");
			String name = scan.next();

			Customer customer;
			if (id == -1) {
				customer = new Customer(name);
			} else {
				customer = new Customer(id, name);
			}
			customerList[index] = customer;
		}
		System.out.println();

		System.out.print("操作(1:一覧表示　2:変更　9:終了)を選択してください：");
		int select = scan.nextInt();

		while (select != 9) {
			if (select == 1) {//一覧表示
				System.out.println("===顧客データ一覧===");
				for (Customer customer : customerList) {
					customer.showData();
				}
			} else if (select == 2) {//変更
				int count = 0;
				System.out.println("更新するID：");
				int idUpdata = scan.nextInt();

				for (int i = 0; i < customerList.length; i++) {//ID検索、data更新
					if (customerList[i].id == idUpdata) {
						count++;
						System.out.println("新しいID：");
						int idNew = scan.nextInt();
						System.out.println("新しい名前：");
						String nameNew = scan.next();
						customerList[i].id = idNew;
						customerList[i].name = nameNew;
					}
				}
				if (count == 0)
					System.out.println("指定したIDは存在しません");
			}
			System.out.println();
			System.out.print("操作(1:一覧表示　2:変更　9:終了)を選択してください：");
			select = scan.nextInt();
		}

	}

}
