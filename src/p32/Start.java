package p32;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		//Controller c =new Controller();　抽象クラスのインスタンスは×エラー
//		Controller[] list=new Controller[2];
//		list[0]=new Baseball();
//		list[1]=new Mario();
		
		List<Controller>list=new ArrayList<>();
		list.add(new Baseball());
		list.add(new Mario());
		
		for(Controller lists:list) {
			lists.pushA();
			lists.pushB();
			System.out.println("--------------");
		}
		
		
	}

}
