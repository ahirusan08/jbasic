package p01;

public class Sample19 {

	public static void main(String[] args) {
		
		String[][] canon=new String[2][3];
		canon[0][0]= "田中";
		canon[0][1]= "遠藤";
		canon[0][2]= "椿";
		canon[1][0]= "薄井";
		canon[1][1]= "菊水";
		canon[1][2]= "木村";
		
		
		System.out.println(canon[0][0]);
		System.out.println(canon[0][1]);
		System.out.println(canon[0][2]);
		System.out.println(canon[1][0]);
		System.out.println(canon[1][1]);
		System.out.println(canon[1][2]);
		
		System.out.println(canon[0].length);

	}

}
