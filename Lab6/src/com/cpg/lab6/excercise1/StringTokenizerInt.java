package com.cpg.lab6.excercise1;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerInt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		int sum=0;
		while(st.hasMoreElements())
		{
			String temp=st.nextToken(" ");
			System.out.println(temp);
			sum+=Integer.parseInt(temp);
			
		}
		System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
