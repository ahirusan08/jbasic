package kadai4add;

import java.util.Scanner;

public class UseCustomer {

	public static void main(String[] args) {
		Customer[] customerList=new Customer[3];
		Scanner scan=new Scanner(System.in);
		
		for(int index=0;index<customerList.length;index++) {
			System.out.println((index+1)+"人目の顧客情報を入力します");
			
			System.out.print("ID(指定しない場合は-1と入力)：");
			int id=scan.nextInt();
			System.out.print("名前：");
			String name=scan.next();
			
			Customer customer=new Customer();
			if(id==-1) {
				customer.setData(name);
			}else {
				customer.setData(id,name);
			}
			customerList[index]=customer;
		}
		System.out.println();
		System.out.println("===顧客データ一覧===");
		for(Customer customer:customerList) {
			customer.showData();
		}
		
		scan.close();

	}

}
