package p07;

public class start {

	public static void main(String[] args) {
		Human h=new Human();
		
		//h.name="あひる";
		h.setName("あひる");		
		//h.age=3;
		h.setAge(-3);
		
		System.out.println("名前："+h.getName());
		System.out.println("年齢："+h.getAge());
		//h.introduce();
	

	}

}
