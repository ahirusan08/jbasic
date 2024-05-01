package p30;

import java.util.Set;
import java.util.TreeSet;

public class Sample04 {

	public static void main(String[] args) {
		
		
		Set<String> canon=new TreeSet<>();
		
		canon.add("ハチワレ");
		canon.add("次郎");
		canon.add("ひよこ");
		canon.add("あひる");
		
		for(String data :canon) {
			System.out.println(data);
		}

	}

}
