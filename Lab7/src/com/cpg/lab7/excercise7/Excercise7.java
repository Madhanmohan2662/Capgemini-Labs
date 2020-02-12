package com.cpg.lab7.excercise7;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class Excercise7 {
	public static int reverse(int num)
	{
		int rev=0;
		int n=num;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		return rev;
	}
	public static void sort_array(int[] arr)
	{
		int n1=arr.length;
		for(int i=0;i<n1;i++)
		{
			arr[i]=reverse(arr[i]);
		}
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int val=0;val<n1;val++)
		{
			a1.add(arr[val]);
		}
		Collections.sort(a1);
		System.out.println(a1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,21,32,123};
		sort_array(arr);
	}

}
