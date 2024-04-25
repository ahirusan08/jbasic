package kadai2;

public class Introduce1 {

	public static void main(String[] args) {
		String[] hobbys= {"ダンス","映画","バイク"};
		
		System.out.println("私の趣味は、");
		for(String hobby:hobbys) {
			System.out.println("・"+hobby);
		}
		System.out.println("です");
	}

}
