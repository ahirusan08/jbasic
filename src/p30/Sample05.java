package p30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample05 {

	public static void main(String[] args) {
		
		
		Map<String,Integer> canon=new HashMap<>();
		
		canon.put("key",0);
		canon.put("ハチワレ",8);
		canon.put("ちいかわ",1);
		canon.put("うさぎ",3);
		
		System.out.println(canon.get("ハチワレ"));
		System.out.println(canon.get("うさぎ"));
		System.out.println(canon.get("ちいかわ"));
		
		Set<String>list=canon.keySet();
				
		for(String key :list) {
			System.out.println(key+"・・・"+canon.get(key));
		}

	}

}

