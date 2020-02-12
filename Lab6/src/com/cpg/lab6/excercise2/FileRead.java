package com.cpg.lab6.excercise2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		File f=new File("demo5.txt");
		f.createNewFile();
		FileReader fr=new FileReader("demo5.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		int count=1;
		while(s!=null)
		{
			System.out.println(count+")"+s);
			s=br.readLine();
			count+=1;
		}
		
		// TODO Auto-generated method stub

	}

}
