package kadai7;

import java.util.ArrayList;
import java.util.List;

public class ItemAction {

	public static void main(String[] args) {
		List<Item> list=new ArrayList<Item>();
		
		list.add(new Item("ロボット掃除機",50000));
		list.add(new Item("ドラム式洗濯機",200000));
		list.add(new Item("液晶テレビ",100000));
		
		for(Item item:list) {
			item.showInfo();
			System.out.println("---");
		}
		
	}
}
