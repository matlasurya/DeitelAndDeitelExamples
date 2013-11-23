package com.akrantha.TextBookExercise;

public class RectangleTest1 {
public static void main(String[] args) {
//rectangle with default length and width
Rectangle1 myRectangle = new Rectangle1();
System.out.println("The rectangle's area is " + myRectangle.calcArea() );
System.out.println("The rectangle's perimeter is " + myRectangle.calcPerimeter() );
//rectangle with specified length and width
Rectangle1 myRectangle2 = new Rectangle1(3.2, 4.3);
System.out.println("The rectangle's area is " + myRectangle2.calcArea() );
System.out.println("The rectangle's perimeter is " + myRectangle2.calcPerimeter() );

Rectangle1 myRectangle3 = new Rectangle1(3, 4);
System.out.println("The rectangle's area is " + myRectangle3.calcArea() );
System.out.println("The rectangle's perimeter is " + myRectangle3.calcPerimeter() );


//rectangle with wrong values
try
{
@SuppressWarnings("unused")
Rectangle1 badRectangle = new Rectangle1(5.5, 34.8);
}
catch (IllegalArgumentException e)
{
System.out.printf( "Exception: %s\n\n", e.getMessage() );
}
}
}
