package com.cpg.lab7.excercise2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Excercise2 {
	public static void count_occurences(char[] arr)
	{
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();//HashMap created to map values
		for(char c:arr)
		{
			if(hm.containsKey(c))//check whether it contains character
			{
				hm.put(c, hm.get(c)+1);//to add value to hashmap
			}
			else
			{
				hm.put(c, 1);
			}
		}
		for(Map.Entry entry:hm.entrySet() )//to display 
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println(hm);//to display hashmap
	}

	public static void main(String[] args) {
		
	char[] arr1={'A','p','p','l','E'};
		count_occurences(arr1);
		
		// TODO Auto-generated method stub

	}
}
