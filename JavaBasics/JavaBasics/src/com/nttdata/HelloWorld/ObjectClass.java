package com.nttdata.HelloWorld;

public class ObjectClass  {
	
	String name;
	
	@Override
	public String toString() {
		return name;
	}
	
	
	public static void main(String[] args) {
		
		
		Integer a=new Integer(10);
		Integer b=new Integer(10);
		
		System.out.println(a.hashCode()+" "+b.hashCode());
		System.out.println(a.equals(b));
		
		ObjectClass obj=new ObjectClass();
		obj.name="Anu";
		
		System.out.println(obj.getClass());
	
		
	}

}
