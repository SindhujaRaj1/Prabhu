package com.org.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1  {
public static void main(String[] args) {
	List<Object> Al=new ArrayList<Object>();
	List<Object> Al1=new ArrayList<Object>();
	Al.add("prabhu");
	Al.add(12);
	Al.add("Sindhu");
	Al.add('#');
	Al.add('A');
	System.out.println("Al:"+Al);
	Al1.addAll(Al);
	System.out.println("Al1:"+Al1);
	Al.remove(3);
	System.out.println("Al:"+Al);
	boolean a=Al1.contains('#');
	System.out.println("Contains # in Al1:"+a);
	boolean b=Al.contains('#');
	System.out.println("Contains # in Al:"+b);
	Al.add("Sham");
	Al.add("priya");
	System.out.println("Al:"+Al);
	Al.retainAll(Al1);
	System.out.println("Al:"+Al);
	Al.removeAll(Al1);
	System.out.println("Al:"+Al);
	boolean c=Al.isEmpty();
	System.out.println("Al is empty:"+c);
	System.out.println("Hashcode:"+Al1.hashCode());
}
}
