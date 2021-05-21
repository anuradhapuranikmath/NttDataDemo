package com.nttdata.io.byteorineted;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MyFileCharacter {
	
	
	void writeToFile1()
	{
		
		try {
			FileWriter file=new FileWriter("test.txt");
			file.write("hello welcome ");
			System.out.println(" success ");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	void readFromFile1()
	{
		
		try {
			FileReader file=new FileReader("test.txt");
			char c[]=new char[6];
			file.read(c);
			System.out.println(Arrays.toString(c));
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public static void main(String[] args) {
	
	MyFileCharacter file=new MyFileCharacter();
	file.readFromFile1();
	//file.writeToFile1();
}
}
