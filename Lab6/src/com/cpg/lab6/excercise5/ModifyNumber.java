package com.cpg.lab6.excercise5;
import java.util.Scanner;

public class ModifyNumber {
	public static int modify_number(int num)
{
	String str=""+num;//converting integer to string
	int len=str.length()-1;
	String str2="";//empty string
	str2=str2+str.charAt(len);//taking last character and appending to empty string
	len--;
	while(len>=0)
	{
		str2=Math.abs(Integer.parseInt(str.charAt(len+1)+"")-Integer.parseInt(str.charAt(len)+""))+str2;
		len--;
	}
	int b=Integer.parseInt(str2);
	return b;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println(modify_number(num));
	// TODO Auto-generated method stub

}


}
