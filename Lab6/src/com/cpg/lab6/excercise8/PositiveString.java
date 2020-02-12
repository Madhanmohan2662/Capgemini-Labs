package com.cpg.lab6.excercise8;
import java.util.Scanner;
public class PositiveString {
	public static boolean positive_string(String str)
	{
		int n=str.length()-1;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)>str.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String str=sc.next();
		if(positive_string(str))
				{
			System.out.println("positive");
				}
		else
		{
			System.out.println("negative");
		}
		// TODO Auto-generated method stub

	}


}
