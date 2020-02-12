package com.cpg.lab7.excercise4;
import java.util.HashMap;
import java.util.Scanner;

public class Excercise4 {
	public static void get_students(HashMap<Integer, Integer> hm)
	{
		HashMap<Integer,String> hm2=new HashMap<Integer, String>();
		for(int id:hm.keySet())
		{
			if(hm.get(id)>=90)
			{
				hm2.put(id,"Gold");
				continue;
			}
			else if(hm.get(id)<90 && hm.get(id)>=80)
			{
				hm2.put(id,"Silver");
				continue;
			}
			else if(hm.get(id)<80 && hm.get(id)>=70)
			{
				hm2.put(id, "Bronze");
			}
		}
		System.out.println("eligible students:"+hm2);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.nextInt());
		}
		get_students(hm);
		// TODO Auto-generated method stub

	}	

}
