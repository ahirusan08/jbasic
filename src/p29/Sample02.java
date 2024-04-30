package p29;

public class Sample02 {

	public static void main(String[] args) {
		String s="ABCXYZA";
		
		
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.substring(2,5));//3文字目以降
		System.out.println(s.indexOf("A"));//何文字目にある？
		System.out.println(s.lastIndexOf("A"));//何文字目にある？
		System.out.println(s.startsWith("ABC"));
		System.out.println(s.startsWith("XY",3));
		System.out.println(s.endsWith("ZA"));

	}

}
