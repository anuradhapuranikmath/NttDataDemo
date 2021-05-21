package com.nttdata.io.byteorineted;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;

public class SerlizeDeSerlizeExample {
	
	public static void main(String[] args) {
		
		Employee  employee=new Employee(101, "Anu");
		
		// serelization 
		try {
			FileOutputStream fin=new FileOutputStream("seriliaze.txt");
			ObjectOutputStream out=new ObjectOutputStream(fin);
			
			out.writeObject(employee);
			System.out.println(" done serilization ");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// de-serilization
		
		
		try {
			FileInputStream fin=new FileInputStream("seriliaze.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
		
			Employee e=(Employee) oin.readObject();
			e.getId();
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
