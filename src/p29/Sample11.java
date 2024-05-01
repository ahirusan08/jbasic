package p29;

public class Sample11 {

	public static void main(String[] args) {
		try {
			System.out.println(waru(10,0));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static int waru(int a,int b)  throws Exception{
		if(b==0) { 
			
		throw new Exception("０でわれないよ");
		//throw new Exception();//エラー
		}
		return a/b;
	}
}
