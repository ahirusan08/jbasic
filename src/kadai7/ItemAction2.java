package kadai7;

import java.util.ArrayList;
import java.util.List;

public class ItemAction2 {

	public static void main(String[] args) {
		List<Item> list=new ArrayList<Item>();
		
		list.add(new Item("ロボット掃除機",50000));
		list.add(new Book("鬼滅の包丁",500,"GO峠"));
		list.add(new Book("1ピース",500,"小田"));
		
		for(Item item:list) {
			item.showInfo();
			System.out.println("---");
		}
		
	}
}
