package com.cpg.lab6.excercise4;

import java.util.Scanner;

public class ReplaceString {
	public boolean is_vowel(char s)
	{
			if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U'||s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
			{
				return true;
			}
			return false;
		
	}
	public String replace_string(String s)
	{
		String str="";
		for(int itr=0;itr<s.length();itr++)
		{
			if(!is_vowel(s.charAt(itr)))
			{
				str=str+(char)((int)s.charAt(itr)+1);
			}
			else
			{
				str=str+s.charAt(itr);
			}
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ReplaceString r=new ReplaceString();
		System.out.println(r.replace_string(str));
		
		// TODO Auto-generated method stub

	}


}
