package com.cpg.lab7.excercise1;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapSort {
	public static void hashmap_sort(HashMap hs)
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer, String>();
		tm.putAll(hs);
		System.out.println(tm);
	}

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"teja");
		hm.put(3, "ghjf");
		hm.put(2, "hgaf");
		hashmap_sort(hm);
		
		
		// TODO Auto-generated method stub

	}

}
