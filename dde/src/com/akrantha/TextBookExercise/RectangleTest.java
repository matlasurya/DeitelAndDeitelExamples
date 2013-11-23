package com.akrantha.TextBookExercise;

import java.util.Scanner;

public class RectangleTest
 {
 public static void main( String args[] )
 {
Scanner input = new Scanner( System.in );

 Rectangle rectangle = new Rectangle();

 int choice = getMenuChoice();

 while ( choice != 3 )
 {
 switch ( choice )
 {
 case 1:
 System.out.print( "Enter length: " );
 rectangle.setLength( input.nextDouble() );
 break;

 case 2:
 System.out.print ( "Enter width: " );
 rectangle.setWidth( input.nextDouble() );
 break;
 } // end switch

 System.out.println ( rectangle.toString() );

 choice = getMenuChoice();
 } // end while
  } // end main
 
  // prints a menu and returns a value coressponding to the menu choice
  private static int getMenuChoice()
  {
  Scanner input = new Scanner( System.in );
 
  System.out.println( "1. Set Length" );
  System.out.println( "2. Set Width" );
  System.out.println( "3. Exit" );
  System.out.print( "Choice: " );
 
  return input.nextInt();
  } // end method getMenuChoice
  } // end class RectangleTest