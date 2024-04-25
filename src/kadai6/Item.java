package kadai6;

public class Item {
	//フィールド
	private String name;
	private int price;

	//コンストラクタ
	public Item() {
		this.name=null;
		this.price=0;
	}
	public Item(String name, int price) {
		this.name=name;
		this.price=price;
	}

	//セッター・ゲッター
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	//商品情報出力
	void showInfo() {
		System.out.println("商品名："+name);
		System.out.println("価格："+price+"円");
	}
	

	

}
