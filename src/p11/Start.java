package p11;

public class Start {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		
		m.telNo="090-12344-5678";
		m.maker="キヤノン";
		
		m.talk();
		m.takePicture();
	}

}
