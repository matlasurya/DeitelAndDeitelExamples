package com.akrantha.TextBookExercise;

public class Rectangle1 {
private double length;
private double width;
// no-argument constructor defaults rectangle variables to 1
public Rectangle1()
{
this(1.0,1.0);
}
//rectangle with two parameters to specify length and width
public Rectangle1 (double myLength, double myWidth)
{
setLength(myLength); //call to set length
setWidth(myWidth); //call to set width
}
public void setLength(double len)
{
if (len > 0.0 && len < 20.0)
{
this.length = len;
}
else
{
throw new IllegalArgumentException("Length must be between 0 and 20");
}
}
public void setWidth(double wid)
{
if (wid > 0.0 && wid < 20.0)
{
this.width = wid;
}
else
{
throw new IllegalArgumentException("Width must be between 0 and 20");
}
}
public double calcPerimeter()
{
return (2.0 * this.length) + (2.0 * this.width);
}
public double calcArea()
{
return this.length * this.width;
}
}