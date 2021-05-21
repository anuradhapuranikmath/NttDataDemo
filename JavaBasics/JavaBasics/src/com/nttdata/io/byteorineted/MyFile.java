package com.nttdata.io.byteorineted;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFile {
	
	
	
	
	void readFromFile()
	{
		
		try {
			
			FileInputStream fin=new FileInputStream("abc.txt");
			BufferedInputStream bfin=new BufferedInputStream(fin);
			int i=0;
			while((i=bfin.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void writeToFile()
	
	{
		FileOutputStream fout=null;
		BufferedOutputStream bfout=null;
		String s=" hello welcome to files in java using io package ";
	    byte []b=	s.getBytes();
		try {
			fout=new FileOutputStream("abc.txt");
			bfout=new BufferedOutputStream(bfout);
			fout.write(b);
			System.out.println(" written to file successfulyyy");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				fout.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		
	}
public static void main(String[] args) {
	
	MyFile file=new MyFile();
	//file.writeToFile();
	file.readFromFile();
	
}
}
