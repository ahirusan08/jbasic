package p29;

public class Sample05 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("ABC");
		int a=10;
		
	//	Integer x=new Integer(a);
		Integer x=100;//オートボクシング
		
		//int b=x.intValue();
		int b=x;//オートアンボクシング
		
		System.out.println(x);
		System.out.println(b);
		System.out.println(Integer.toBinaryString(a));
		
		System.out.println(x+x);
		System.out.println(b+b);
	}

}
