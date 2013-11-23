package com.akrantha.chapter8;

public class PackageDataTest {
	public static void main(String[] args)
	{
		PackageData packageData = new PackageData();
		System.out.printf( "After instantiation:\n%s\n", packageData );
		// change package access data in packageData object
		packageData.number = 77;
		packageData.string = "Goodbye";
		System.out.printf( "\nAfter changing values:\n%s\n", packageData );
	}

}
class PackageData
{
	int number; // package-access instance variable
	String string;
	public PackageData()
	 {
	 number = 0;
	 string = "Hello";
	 } // end PackageData constructor
	// return PackageData object String representation
	 public String toString()
	 {
	 return String.format( "number: %d; string: %s", number, string );
	 } // end method toString
	 } // end class PackageData

