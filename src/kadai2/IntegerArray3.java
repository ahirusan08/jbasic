package kadai2;

public class IntegerArray3 {

	public static void main(String[] args) {
		int[] numbers= {1,7,2,7,3};
		
		int count=0;
		System.out.print("合計：");
		for(int num: numbers) {
			if(num==7) {
				count++;
			}
		}
		System.out.println(count+"個ありました");
	}

}
