package p13;

public class Mobile extends Camera {

	private String telNo;
	
	public Mobile() {
		
	}
	public Mobile(String telNo,String maker) {
		this.telNo=telNo;
		//super.setMaker(maker);
		super.maker=maker;
	}
	
	public void setTelNo(String telNo) {
		this.telNo=telNo;
	}
	
	public void talk() {
		System.out.println("電話番号："+telNo);
		System.out.println("通話中です");
	}

}
