package p08;

public class start {

	public static void main(String[] args) {
		Human h1=new Human();
		Human h2;
		
		h1.setName("あひる");		
		h1.setAge(3);
		
		h2=h1;
		h2.setAge(10);
		
		System.out.println("名前："+h1.getName());
		System.out.println("年齢："+h1.getAge());
		System.out.println("名前："+h2.getName());
		System.out.println("年齢："+h2.getAge());
		//h.introduce();
	

	}

}
