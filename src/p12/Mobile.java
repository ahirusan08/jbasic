package p12;

public class Mobile extends Camera {

	private String telNo;
	
	public Mobile() {
		//super(10);
		System.out.println("Mobileコンストラクタ");
	}
	public Mobile(String telNo,String maker) {
		
		//System.out.println("Mobileコンストラクタ");
	}
	
	public void setTelNo(String telNo) {
		this.telNo=telNo;
	}
	
	public void talk() {
		System.out.println("電話番号："+telNo);
		System.out.println("通話中です");
	}

}
