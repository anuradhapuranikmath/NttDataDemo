package com.nttdata.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static  void drawShapes (List<? extends Shape> list)
	{
		for(Shape s:list)
		{
			s.draw();
		}
	}

	public static void main(String[] args) {
		
		List<Rectangle> lr=new ArrayList<>();
		lr.add(new Rectangle());
		
		List<Circle> cl=new ArrayList<>();
		cl.add(new Circle());
		cl.add(new Circle());
		
		drawShapes(cl);
		drawShapes(lr);

	}

}
