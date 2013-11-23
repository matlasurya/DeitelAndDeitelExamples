package com.akrantha.Arrays;


import java.util.Arrays;

class MyCustomArray{
	 Object[] container;
	 int current_capacity =0;
	
	MyCustomArray(){
		 container = new Object[10];
	       }
	public void add(Object[] container, Object[] addElement){
		//actual capacity -current capacity 
		
		if(current_capacity < container.length)
		{
		    Object[] result= Arrays.copyOf(container, container.length +1);
			result[container.length]=addElement;
			System.out.println("The new array is:"+result);
		}
		else
		{
			System.out.println("Adding new element is not Possible");
		}
	}
	public void display()
	{
		
		System.out.println("The size is:"+container.length);
	}
	public static void main(String [] args)
	{
		MyCustomArray output=new MyCustomArray();
		output.display();
		
	}
	
 }