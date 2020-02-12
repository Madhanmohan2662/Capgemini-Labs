package com.cpg.lab7.excercise8;

import java.util.Arrays;
public class RemoveDuplicates {
	public static void remove_duplicates(int[] arr)
	{
		int n=arr.length;
		int temp[] = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
		for(int i=j;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,1,2,3,4,5};
		remove_duplicates(arr);
		
		
		// TODO Auto-generated method stub

	}
}
