package com.akrantha.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//import java.util.Arrays;

 class CustomArray{
	 Object[] container;
	 int current_capacity =0;
	
	CustomArray(){
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
		
		//add logic
		//throw new Exception("Out of capacity");
		
		//if not empty throw exception
		
		
	}
	/*remove(int index){
		
		
		
	}*/
	
}

 public class MyArrayTest {
		
		public static void main(String[] args)
		{
		int[] myArrs={87,68,94,100,83,78,85,91,76,87};
		
		List< Integer > list = new ArrayList< Integer >();

		for(Integer arr:myArrs)
		{
			list.add(arr);
		}

		System.out.println("The Given List of elements are: ");
		for(Integer li:list)
		{
			System.out.println(li);
		}
		list.add(100);
		list.add(200);
		System.out.println("After adding new elements are:");
		for(Integer li:list)
		{
			System.out.println(li);
		}
		System.out.println("After removing elements are:");
		list.remove( 11 );
		
		for(Integer li:list)
		{
			System.out.println(li);
		}
		
		
		}
		
		
	}
