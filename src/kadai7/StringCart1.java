package kadai7;

import java.util.ArrayList;
import java.util.List;

public class StringCart1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("ロボット掃除機");
		list.add("ドラム式洗濯機");
		list.add("液晶テレビ");
		
		for(String goods:list) {
			System.out.println(goods);
		}
	}

}
