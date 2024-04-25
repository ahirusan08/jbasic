package p01;

public class Sample18 {

	public static void main(String[] args) {
		
		String[] canon={"田中","遠藤","椿"};
		String[] sony;
		
		sony=canon;
		sony[1]="工藤";
		
		System.out.println(canon[0]);
		System.out.println(canon[1]);
		System.out.println(canon[2]);
		System.out.println(canon.length);

	}

}
