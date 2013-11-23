package com.akrantha.TextBookExercise;

public class Rectangle
 {
 private double length; // the length of the rectangle
 private double width; // the width of the rectangle

// constructor without parameters
 public Rectangle()
 {
 setLength( 1.0 );
 setWidth( 1.0 );
 } // end Rectangle no-argument constructor

 // constructor with length and width supplied
 public Rectangle( double theLength, double theWidth )
 {
 setLength( theLength );
 setWidth( theWidth );
 } // end Rectangle two-argument constructor

 // validate and set length
 public void setLength( double theLength )
 {
 length = ( theLength > 0.0 && theLength < 20.0 ? theLength : 1.0 );
 } // end method setLength

 // validate and set width
 public void setWidth( double theWidth )
 {
 width = ( theWidth > 0 && theWidth < 20.0 ? theWidth : 1.0 );
 } // end method setWidth

 // get value of length
 public double getLength()
 {
 return length;
 } // end method getLength

 // get value of width
 public double getWidth()
 {
 return width;
 } // end method getWidth
 
  // calculate rectangle's perimeter
  public double perimeter()
  {
  return 2 * length + 2 * width;
  } // end method perimeter
 
  // calculate rectangle's area
  public double area()
  {
  return length * width;
  } // end method area
 
  // convert to String
  public String toString()
  {
  return String.format( "%s: %f\n%s: %f\n%s: %f\n%s: %f",
  "Length", length, "Width", width,
  "Perimeter", perimeter(), "Area", area() );
  } // end method toRectangleString
  } // end class Rectangle