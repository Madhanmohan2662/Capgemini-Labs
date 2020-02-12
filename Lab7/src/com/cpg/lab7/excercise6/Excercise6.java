package com.cpg.lab7.excercise6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Excercise6 {
	public static void voters_list(HashMap<Integer, Integer> hm)
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int age:hm.keySet())
		{
			if(hm.get(age)>=18)
			{
				l1.add(age);
			}
		}
		System.out.println("voters list is given by:"+l1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.nextInt());
		}
		voters_list(hm);
		
	}


}
