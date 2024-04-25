package kadai6;

public class ItemAction {

	public static void main(String[] args) {
		Item item1 = new Item("掃除機",50000);
		item1.showInfo();

		System.out.println("---");

		Item item2 = new Item("洗濯機", 200000);
		item2.showInfo();
	}

}
