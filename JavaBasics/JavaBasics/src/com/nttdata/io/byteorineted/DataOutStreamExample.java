package com.nttdata.io.byteorineted;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutStreamExample {
	
	
	public static void main(String[] args) {
		
	  try {
		/*FileOutputStream fout=new FileOutputStream("hello.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		*/
		/*dout.writeInt(87);
		dout.writeDouble(99);*/
		
		FileInputStream fin=new FileInputStream("hello.txt");
		DataInputStream din=new DataInputStream(fin);
		int count=din.available();
		byte []arry=new byte[count];
		din.read(arry);
		for(byte bt:arry)
		{
			char c=(char)bt;
			System.out.println(c);
		}
		
	
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
		
	}

}
