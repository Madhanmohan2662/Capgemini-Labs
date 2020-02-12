package com.cpg.lab7.excercise5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Excercise5 {
	public static void get_second_smallest(int[] arr)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i:arr)
		{
			a1.add(i);
		}
		Collections.sort(a1);
		System.out.println("second smallest element in array:"+ a1.get(1));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements in array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		get_second_smallest(arr);
		
		
		// TODO Auto-generated method stub

	}


}
