package p12;

public class Start {

	public static void main(String[] args) {
		Mobile m=new Mobile("090-12344-5678","キヤノン");
		
//		m.setTelNo("090-12344-5678");
//		m.setMaker("キヤノン");
		
		m.talk();
		m.takePicture();
	}

}
