package com.akrantha.Arrays;

public class InitArray {
	public static void main(String[] args)
	{
      int array[]={1,44,77,4,6,8,9,99,34,55};
      
      
      
      System.out.printf("%s%8s\n","index","value");
      for(int counter=0;counter <array.length;counter++)
    	  System.out.printf( "%5d%8d\n", counter, array[ counter ] );
      
      System.out.println("element6 value is:"+array[6]);
	}

}
