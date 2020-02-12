package com.cpg.lab3.excercise1;

import java.util.Arrays;

public class SecondSmallestElement 
{
	 int getSecondSmallestElementInArray(int arr[])
		{	  
			Arrays.sort(arr);
			return arr[1];
		}
}
