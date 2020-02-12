package com.cpg.lab7.excercise3;
import java.util.HashMap;
import java.util.Scanner;
public class Excercise3 {
	public static void square(int[] arr)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int value:arr)
		{
				hm.put(value, value*value);
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of integers in array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		square(arr);
		// TODO Auto-generated method stub

	}

}
