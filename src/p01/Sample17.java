package p01;

public class Sample17 {

	public static void main(String[] args) {
		
		//配列の宣言と領域の確保とデータの設定
		//データ型[] 配列名={data1,data2,data3};
		//データ型[] 配列名=new データ型[]{data1,data2,data3};
		
		//String[] canon= {"田中","遠藤","椿"};
		String[] canon= new String[]{"田中","遠藤","椿"};
		
//		canon[0]="田中";
//		canon[1]="遠藤";
//		canon[2]="椿";
		
		
		System.out.println(canon[0]);
		System.out.println(canon[1]);
		System.out.println(canon[2]);
		System.out.println(canon.length);

	}

}
