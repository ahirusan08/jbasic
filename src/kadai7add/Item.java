package kadai7add;

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
	void getInfo() {
		System.out.println(name+"/"+price+"円");
	}
	

	

}
