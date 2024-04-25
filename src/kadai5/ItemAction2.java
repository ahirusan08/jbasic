package kadai5;

public class ItemAction2 {

	public static void main(String[] args) {
		Item[] items = new Item[3];
		
		items[0]=new Item("ロボット掃除機",50000);
		items[1]=new Item("空気清浄機",20000);
		items[2]=new Item("扇風機",4000);
		
		for(Item item:items) {
			item.showInfo();
			System.out.println();
			System.out.println("---");
			System.out.println();
		}
	}
}
