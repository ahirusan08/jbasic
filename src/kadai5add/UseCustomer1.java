package kadai5add;

import java.util.Scanner;

public class UseCustomer1 {

	public static void main(String[] args) {
		Customer[] customerList=new Customer[3];
		Scanner scan =new Scanner(System.in);
		
		for(int index=0;index<customerList.length;index++) {
			System.out.println((index+1)+"人目の顧客情報を入力してください");
			System.out.print("ID：");
			int id=scan.nextInt();
			System.out.print("名前：");
			String name=scan.next();
			
			Customer customer;
			if(id==-1) {
				customer=new Customer(name);
			}else {
				customer=new Customer(id,name);
			}
			customerList[index]=customer;
		}

		System.out.println();
		System.out.println("===顧客データ一覧===");
		for(Customer customer:customerList) {
			customer.showData();
		}
		
	}

}
