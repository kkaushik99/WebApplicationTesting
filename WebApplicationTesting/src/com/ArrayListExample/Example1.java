package com.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args)
	{
		/*int a=10;
		a=20;
		System.out.println(a);*/
		
		List<String>I=new ArrayList<>();
		I.add("Selenium");
		I.add("LoadRunner");
		I.add("QTP");
		
		
		/*System.out.println(I.get(0));
		System.out.println(I.get(1));
		System.out.println(I.get(2));
		System.out.println(I.get(3));*/
		
		for(int a=0;a<I.size();a++)
		{
			System.out.println(I.get(a));
		}
	}

}
