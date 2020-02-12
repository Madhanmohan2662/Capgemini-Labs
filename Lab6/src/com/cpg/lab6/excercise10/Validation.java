package com.cpg.lab6.excercise10;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
	public static boolean validate(String str)
	{
		if(Pattern.matches("[A-z]{8}_job", str))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User_name");
		String str=sc.next();
		if(validate(str))
		{
			System.out.println("yes allowed");
		}
		else
		{
			System.out.println("not allowed");
		}

	}
}
