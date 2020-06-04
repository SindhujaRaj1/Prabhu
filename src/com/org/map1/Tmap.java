package com.org.map1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tmap {
public static void main(String[] args) {
	Map<Integer,String> hm=new TreeMap<Integer,String>();
	Map<Integer,String> hm1=new TreeMap<Integer,String>();

	hm.put(1, "Apple");
	hm.put(2, "Apple");
	hm.put(3, "Apple");
	//hm.put(null, "Orange");--->key null not allowed in Treemap and hashtabel
	hm.put(6, null);
	hm.put(5, "pineapple");
	System.out.println("hm");
	System.out.println(hm);
	hm1.putAll(hm);
	System.out.println("hm1");
	System.out.println(hm1);
	boolean a=hm1.isEmpty();
	System.out.println("hm1 ISEMPTY:"+a);
	boolean b=hm.containsKey(3);
	boolean c=hm.containsValue(null);
	System.out.println("contains null in key:"+b);
	System.out.println("contains null in value:"+c);
	System.out.println("key value pair: "+hm.entrySet());
	System.out.println("key value: "+hm.keySet());
	hm.replace(3, "Apple", "mango");
	System.out.println("replace:"+hm);

}
}
