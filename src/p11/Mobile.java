package p11;

public class Mobile extends Camera {

	String telNo;
	
	void talk() {
		System.out.println("電話番号："+telNo);
		System.out.println("通話中です");
	}

}
