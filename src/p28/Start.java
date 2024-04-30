package p28;

public class Start {

	public static void main(String[] args) {
		Object a1=new Ogawa(10);
		Object a2=/*a1;*/new Ogawa(10);
		
		System.out.println(a1.equals(a2));
		System.out.println(a1==a2);

	}

}
