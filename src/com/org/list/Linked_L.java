package com.org.list;


import java.util.LinkedList;
import java.util.List;

public class Linked_L {
public static void main(String[] args) {
	List<Object> ll=new LinkedList<Object>();
	List<Object> ll1=new LinkedList<Object>();
	ll.add("Red");
	ll.add(122);
	ll.add("Blue");
	ll.add('$');
	ll.add('M');
	ll.add("Red");
	System.out.println("ll:"+ll);
	ll1.addAll(ll);
	int i=ll1.lastIndexOf("Red");
	System.out.println("ll1 last index of Red:"+i);
	System.out.println("ll1:"+ll1);
	ll.remove(3);
	System.out.println("ll:"+ll);
	boolean a=ll1.contains('$');
	System.out.println("Contains $ in ll1:"+a);
	boolean b=ll.contains('$');
	System.out.println("Contains $ in ll:"+b);
	ll.add("Orange");
	ll.add("Purple");
	System.out.println("ll:"+ll);
	ll.retainAll(ll1);
	System.out.println("ll:"+ll);
	ll.removeAll(ll1);
	System.out.println("ll:"+ll);
	boolean c=ll.isEmpty();
	System.out.println("Al is empty:"+c);
	System.out.println("Hashcode:"+ll1.hashCode());
}
}
