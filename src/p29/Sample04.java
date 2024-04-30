package p29;

public class Sample04 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("ABC");
		//sb.append("01234567890123456");
		//sb.insert(2, "XYZ");
		

		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.replace(1, 3, "DE");
		System.out.println(sb);
	}

}
