package com.cpg.lab6.excercise3;
import java.util.Scanner;

public class Mirror {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		System.out.println(str+"|"+str2);
		
		// TODO Auto-generated method stub

	}


}
