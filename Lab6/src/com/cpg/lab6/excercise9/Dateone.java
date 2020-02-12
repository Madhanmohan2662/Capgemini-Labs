package com.cpg.lab6.excercise9;
import java.util.Date;
public class Dateone {
	@SuppressWarnings("deprecation")
	public static void date(Date d)
	{
		System.out.println("duration in days"+d.getDay());
		System.out.println("duration in months"+d.getMonth());
		System.out.println("duration in year:"+d.getYear());
	}

	public static void main(String[] args) {
		Date d1=new Date();
		date(d1); 
		
		// TODO Auto-generated method stub

	}


}
